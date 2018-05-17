/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testparseur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author aurian
 */
public class Parseur {
    
    private final String adresseFichier;
    private Carte carte;
    
    public Parseur(String adresseFichier,Carte carte) {
        this.adresseFichier = adresseFichier;
        this.carte = carte;
    }
    
    //Parse une ligne du fichier
    public void parseLigne(int numLigne,String ligne) {
        //lecture caractère par caractère de la ligne et création de la case adaptée
        for(int numColumn = 0; numColumn < ligne.length(); numColumn++) {
            char c = ligne.charAt(numColumn);
            
            //creation de la case
            Case newCase = null;
            switch(c) {
                case 'M' : newCase = Fabrique.construireCase(TypeCase.Mur, numLigne, numColumn,this.carte); break;
                default : newCase = Fabrique.construireCase(TypeCase.Sol, numLigne, numColumn,this.carte); break;
            }
            this.carte.setCase(newCase);
            
            switch(c) {
                case 'S' : carte.setStart(newCase);
                case 'E' : carte.setExit(newCase);
            }
        }
    }
    
    //Lance le parsage du fichier
    public void lecture() throws FileNotFoundException, IOException {
        
        //ouverture du fichier en lecture
        File file = new File(this.adresseFichier);
        BufferedReader fichier = new BufferedReader(new FileReader(file));
        
        //Lecture ligne à ligne
        String line;
        int numLine = 0;
        while((line = fichier.readLine()) != null){
            //parsage de la ligne
            this.parseLigne(numLine, line);
            numLine++;
        }
    }
}
