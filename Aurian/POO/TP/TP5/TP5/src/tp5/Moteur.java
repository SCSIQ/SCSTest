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
public class Moteur {
    /*ATTRIBUTS*/
    private int puissance;
    private boolean demarre;
    private Voiture voiture;
    private boolean enPanne;
    
    /*CONSTRUCTEUR*/
    public Moteur(int cv, Voiture v){
        puissance=cv;
        voiture=v;
        enPanne=false;
        demarre=false;
    }
    
    /*METHODES*/
    
    public boolean estDemarre(){
        boolean res=false;
        if((demarre==true)&&(enPanne==false)){
            res=true;
    }
        return res;
    }
    
    public void demarre(){
        demarre=true;
    }
    
    public void enPanne(){
        enPanne=true;
        demarre=false;
    }
    
    public String toString(){
        return "[Moteur] "+puissance+" cv,";
    }
    
    public boolean getEnPanne(){
        return enPanne;
    }
}
