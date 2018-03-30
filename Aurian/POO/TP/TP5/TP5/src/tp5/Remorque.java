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
public class Remorque {
    private int capacite;
    
    public Remorque(int capacite){
        this.capacite=capacite;
    }
    
    public String toString(){
        return "[Remorque] "+capacite+" litres";
    }
}
