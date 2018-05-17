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
    
    //construction d'une case
    public static Case construireCase(TypeCase type,int line,int column,Carte carte) {
        Case nouvelleCase = null;
        switch(type) {
            case Sol: nouvelleCase = new CaseSol(line,column,carte);
                break;
            case Mur: nouvelleCase = new CaseMur(line,column,carte);
                break;
        }
        return nouvelleCase;
    }
    
}
