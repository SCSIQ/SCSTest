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
public class Roue {
    private int taille;
    
    public Roue(int taille){
        this.taille=taille;
    }
    
    @Override
    public String toString(){
        return "[Roue] "+taille+" pouces";
    }
}
