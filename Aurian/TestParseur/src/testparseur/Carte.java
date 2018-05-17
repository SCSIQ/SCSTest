/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testparseur;

import java.util.ArrayList;

/**
 *
 * @author aurian
 */
public class Carte {
    
    private ArrayList<Case> listeCases;
    
    public Carte() {
        listeCases = new ArrayList<Case>();
    }
    
    public void setCase(Case _case) {
        this.listeCases.add(_case);
    }
    
    @Override
    public String toString() {
        String s = "";
        return s;
    }
    
}
