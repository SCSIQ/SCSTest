/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author durand aurian 
 * 
 */
public class Conducteur {
    private String nom;
    
    /**
     * 
     * @param nom le nom du conducteur
     */
    public Conducteur(String nom){
        this.nom=nom;
    }
    
    /**
     * 
     * @return une chaine de caractères décrivant le conducteur 
     */
    public String toString(){
        return "[Conducteur] "+nom;
    }
}
