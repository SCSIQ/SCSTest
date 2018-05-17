/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testparseur;

import java.io.IOException;

/**
 *
 * @author aurian
 */
public class TestParseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Carte carte = new Carte();
        
        Parseur parseur = new Parseur("level1.txt", carte);
        
        parseur.lecture();
        
        carte.genererGrapheSimple();
        
        System.out.println(carte.toString());
        
        System.out.println("Start : "+carte.getStart().getLine()+"/"+carte.getStart().getColumn());
        
        System.out.println("Exit : "+carte.getExit().getLine()+"/"+carte.getExit().getColumn()+"\n");
        
        System.out.println(carte.stringMatrix());
        
    }
    
}
