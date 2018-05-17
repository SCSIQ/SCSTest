/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testparseur;

/**
 *
 * @author aurian
 */
public class Fabrique {
    
    private static Fabrique instance;
    
    private Fabrique() {
        
    }
    
    public Fabrique get() {
        if(instance==null) {
            instance = new Fabrique();
        }
        return instance;
    }
    
    public Case construireCase(int line, int column, Carte carte) {
        return null;
    }
    
}
