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
public class Roue {
    private int taille;
    
    /**
     * 
     * @param taille taille de la roue 
     */
    public Roue(int taille){
        this.taille=taille;
    }
    /**
     * 
     * @return une chaine de caractères décrivant la roue
     */
    @Override
    public String toString(){
        return "[Roue] "+taille+" pouces";
    }
}
