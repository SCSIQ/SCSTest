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
public class Moteur {
    
    private int puissance;
    private boolean demarre;
    private Voiture voiture;
    private boolean enPanne;
    
    /**
     * 
     * @param cv puissance du moteur 
     * @param v v la voiture à laquelle appartient le moteur
     */
    public Moteur(int cv, Voiture v){
        puissance=cv;
        voiture=v;
        enPanne=false;
        demarre=false;
    }

    /**
     * 
     * @return retourne si le moteur est en marche ou non
     */
    public boolean estDemarre(){
        boolean res=false;
        if((demarre==true)&&(enPanne==false)){
            res=true;
    }
        return res;
    }
    
    /**
     * démare le moteur 
     */
    public void demarre(){
        demarre=true;
    }
    
    /**
     * modifie l'état du moteur à en panne
     */
    public void enPanne(){
        enPanne=true;
        demarre=false;
    }
    
    /**
     * 
     * @return une chaine de caractères décrivant le moteur 
     */
    public String toString(){
        return "[Moteur] "+puissance+" cv,";
    }
    
    /**
     * 
     * @return retourne un boolean pour indiquer si le moteur est en panne
     */
    public boolean getEnPanne(){
        return enPanne;
    }
}
