/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_tp3_durand_aurian_s2_a1;

/**
 *
 * @author aurian
 */
public class DAB {
    
    private int nbBillets10;
    private int nbBillets20;
    private int nbBillets50;
    private int billets50donne;
    private int billets20donne;
    private int billets10donne;
    private int resteApayer;
    
    public DAB(int n10,int n20, int n50) {
        nbBillets10=n10;
        nbBillets20=n20;
        nbBillets50=n50;
    }
    
    public boolean distribue(int valeur) {
        
        boolean res = false;
        
        if (valeur <= nbBillets50*50 + nbBillets20*20 + nbBillets10*10) {
            System.out.println("La somme demandée est inférieure à la somme disponible");
            
            //appelle la fonction glouton et regarde ce qu'elle renvois
            if (glouton(valeur) == true) { 
                nbBillets50 -= billets50donne;
                nbBillets20 -= billets20donne;
                nbBillets10 -= billets10donne;

                //La fonction glouton a bien fait le calcul et on l'affiche
                System.out.println("Billets de 50 : "+billets50donne);
                System.out.println("Billets de 20 : "+billets20donne);
                System.out.println("Billets de 10 : "+billets10donne);

                res = true;

            //La fonction glouton n'a pas réussi à rendre la monnaie, on fait
            //le troisième point du grand 3 : distribuer les billets 
            } else {
            
                valeur = resteApayer;

                nbBillets50 -= billets50donne;
                nbBillets20 -= billets20donne;
                nbBillets10 -= billets10donne;

                if ((nbBillets50 > 0) && (billets50donne > 0)) {
                    nbBillets50 += 1;
                    billets50donne -= 1;
                    valeur += 50;
                }
                if (nbBillets20 >= 3) {
                    nbBillets20 -= 3;
                    billets20donne += 3;
                    valeur -= 60;
                }
                if (valeur == 0) {
                    System.out.println("Billets de 50 : "+billets50donne);
                    System.out.println("Billets de 20 : "+billets20donne);
                    System.out.println("Billets de 10 : "+billets10donne); 

                    res = true;

                } else {
                    System.out.println("Nous n'avons pas pu vous donner vos billets");
                }
            }
        } else {
            System.out.println("La somme demandée est suppérieure à la somme disponible");
        }
        
        return res;
    }
    
    public void remplissage(int n10, int n20, int n50) {
        nbBillets10+=n10;
        nbBillets20+=n20;
        nbBillets50+=n50;
    }
    
    public boolean estVide() {
        if ((nbBillets10==0) && (nbBillets20==0) && (nbBillets50==0)) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean glouton(int valeur) {
        boolean res = false;
        int reste;
        if (valeur%10==0) {
            if ((int)valeur/50 <= nbBillets50) {
                reste = valeur - ((int)valeur/50)*50;
                billets50donne = (int)valeur/50;
                valeur = reste;
                if (valeur == 0) {
                    res = true;
                }
            } else if (valeur == 0) {
                res = true;
            }
            if (((int)valeur/20 <= nbBillets20) && (valeur >= 20)) {
                reste = valeur - ((int)valeur/20)*20;
                billets20donne = (int)valeur/20;
                valeur = reste;
                if (valeur == 0) {
                    res = true;
                }
            } else if (valeur == 0) {
                res = true;
            }
            if (((int)valeur/10 <= nbBillets10) && (valeur >= 10)) {
                reste = valeur - ((int)valeur/10)*10;
                billets10donne = (int)valeur/10;
                valeur = reste;
                if (valeur == 0) {
                    res = true;
                }
            } else if (valeur == 0) {
                res = true;
            }    
        }
        resteApayer = valeur;
        return res;
    }
    
}
