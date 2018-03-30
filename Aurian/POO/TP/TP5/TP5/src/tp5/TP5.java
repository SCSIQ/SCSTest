/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author durand aurian 
 */
public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*AFFICHAGE VOITURE 1*/
        Voiture v1 = new Voiture(600,"Formule1",15);
        System.out.println(v1.toString());
        
        /*AFFICHAGE VOITURE 2*/
        Voiture v2 = new Voiture(60,"Twingo",15);
        System.out.println();
        System.out.println(v2.toString());
        
        /*AFFICHAGE VOITURE 3*/
        Conducteur c1 = new Conducteur("Sylvain");
        v1.changeConducteur(c1);
        v1.demarre();      
        System.out.println();
        System.out.println(v1.toString());
        
        /*AFFICHAGE VOITURE 4*/
        v1.enPanne();
        System.out.println();
        System.out.println(v1.toString());
        
        /*AFFICHAGE VOITURE 5*/
        Remorque r1=new Remorque(300);
        v2.attacheRemorque(r1);
        v2.changeConducteur(c1);
        System.out.println();
        System.out.println(v2.toString());
        
        /*AFFICHAGE VOITURE 6 : CLONE DE VOIURE 5*/
        Voiture vtest = v2.clone();
        System.out.println();
        System.out.println(vtest.toString());
        
        if(v2==vtest){
            System.out.println("v2 == vtest : vrai");
        }else{
            System.out.println("v2 == vtest : faux");
        }
        
        if(v2.equals(vtest)){
            System.out.println("v2 equals vtest : vrai");
        }else{
            System.out.println("v2 equals vtest : faux");
        }

    }
    
}
