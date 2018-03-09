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
public class POO_TP3_DURAND_AURIAN_S2_A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entreeUser;
        DAB d = new DAB(24,10,5);
        System.out.print("Entrez une somme à distribuer (multiple de 10) : ");
        entreeUser=Clavier.lireInt();
        while (entreeUser!=0) {
            if (d.estVide()) {
                d.remplissage(10,10,10);
            }
            d.distribue(entreeUser);
            System.out.print("Entrez une somme à distribuer (multiple de 10) : ");
            entreeUser=Clavier.lireInt();
        }
    }
}
