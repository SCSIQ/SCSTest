/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author 
 */
public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Voiture v1 = new Voiture(600,"Formule1",15);
/*AFFICHAGE VOITURE 1*/
        System.out.println(v1.toString());
        
        Voiture v2 = new Voiture(60,"Twingo",15);
/*AFFICHAGE VOITURE 2*/
        System.out.println();
        System.out.println(v2.toString());
        
        
        Conducteur c1 = new Conducteur("Sylvain");
        v1.changeConducteur(c1);
        v1.demarre();
/*AFFICHAGE VOITURE 3*/        
        System.out.println();
        System.out.println(v1.toString());
        
/*AFFICHAGE VOITURE 4*/
        v1.enPanne();
        System.out.println();
        System.out.println(v1.toString());
        
/*AFFICHAGE VOITURE 5*/
        Remorque r1=new Remorque(300);
        v2.attaqueRemorque(r1);
        v2.changeConducteur(c1);
        
        System.out.println();
        System.out.println(v2.toString());
    }
    
}
