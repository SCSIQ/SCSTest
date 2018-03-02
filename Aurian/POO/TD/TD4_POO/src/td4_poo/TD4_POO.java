/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td4_poo;

import java.awt.Color;

/**
 *
 * @author ad731784
 */
public class TD4_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Voiture v1 = new Voiture();
        Voiture v2 = new Voiture(Color.ORANGE,4,180);
        
        System.out.println(v1.toString());
        v1.repeindre();
        
        System.out.println(v2.toString());
        v2.repeindre();*/
        Personne p1 = new Personne("Boucquemont","Lucie");
        System.out.println(p1.toString());
    }
    
    
}
