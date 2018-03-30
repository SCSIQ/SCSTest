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
public class Remorque {
    private int capacite;
    
    /**
     * 
     * @param capacite capacité de la remorque en litres
     */
    public Remorque(int capacite){
        this.capacite=capacite;
    }
    
    /**
     * 
     * @return une chaine de caractères décrivant la remorque
     */
    public String toString(){
        return "[Remorque] "+capacite+" litres";
    }
}
