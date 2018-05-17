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
        for(int numColonne = 0; numColonne < ligne.length(); numColonne++) {
            char c = ligne.charAt(numColonne);
            
            //creation de la case
            Case nouvelleCase = null;
            switch(c) {
                case 'M' : nouvelleCase = FabriqueCases.construireCase(TypeCase.Mur, numLigne, numColonne,this.carte); break;
                default : nouvelleCase = FabriqueCases.construireCase(TypeCase.Sol, numLigne, numColonne,this.carte); break;
            }
            this.carte.setCase(numLigne, numColonne, nouvelleCase);
        }
    
    //Lance le parsage du fichier
    public void lecture() throws FileNotFoundException, IOException {
        
        //ouverture du fichier en lecture
        File file = new File(this.adresseFichier);
        BufferedReader fichier = new BufferedReader(new FileReader(file));
        
        //Lecture ligne à ligne
        String ligne;
        int numLigne = 0;
        while((ligne = fichier.readLine()) != null){
            //parsage de la ligne
            this.parseLigne(numLigne, ligne);
            numLigne++;
        }
    }
}
    
}
