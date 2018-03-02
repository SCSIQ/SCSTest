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


public class Voiture {
    
    /*ATTRIBUTS*/
    private Color couleur;
    private int nbPortes;
    private int nbChevaux;
    
    /*CONSTRUCTEUR*/
    public Voiture(){ 
       this.couleur = Color.DARK_GRAY;
       this.nbPortes = 5;
       this.nbChevaux = 100;
    }
    
   public Voiture(Color couleur, int nbPortes, int nbChevaux){
       this.couleur = couleur;
       this.nbPortes = nbPortes;
       this.nbChevaux = nbChevaux;
   } 
   
   public void repeindre(){
       String porte1;
       String porte2;
       String porte3;
       String porte4;
       String voiture;
       
       for (int i = 1;i <= nbPortes;i++)
       {
           System.out.println("La porte "+i+" est maintenant "+couleur);
       }
       voiture ="la voiture est maintenant totalement "+couleur;
   }
   
   public String toString(){
       return "La voiture de couleur "+couleur+", possède "+nbPortes+" portes et a un moteur de "+nbChevaux+" CV";
   }
   
}
