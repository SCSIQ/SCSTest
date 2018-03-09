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
    
    public DAB(int n10,int n20, int n50) {
        nbBillets10=n10;
        nbBillets20=n20;
        nbBillets50=n50;
    }
    
    public boolean distribue(int valeur) {
        
        return false;
    }
    
    public void remplissage(int n10, int n20, int n50) {
        nbBillets10+=n10;
        nbBillets20+=n20;
        nbBillets50+=n50;
    }
    
    public boolean estVide() {
        if ((nbBillets10==0) && (nbBillets20==0) && (nbBillets50==0)) {
            return false;
        } else {
            return true;
        }
    }
    
    private boolean glouton() {
        return false;
    }
    
}
