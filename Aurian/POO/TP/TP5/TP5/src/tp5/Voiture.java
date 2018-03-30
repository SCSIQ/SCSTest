/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

import java.util.ArrayList;

/**
 *
 * @author 
 * 
 */
public class Voiture {
    /**ATTRIBUTS**/
    private Moteur moteur;
    private String modele;
    private Conducteur pilote = null;
    private Remorque remorque = null;
   // private Roue roues;
    
    private ArrayList<Roue> roues;
    
    /**CONSTRUCTEUR**/
    public Voiture(int cv, String type, int tailleRoue ){ 
        modele=type;
        moteur=new Moteur(cv,this);
        roues = new ArrayList();
        for(int i=0;i<4;i++){
            roues.add(new Roue(tailleRoue));
        }
    }
    
    public void enPanne(){
        moteur.enPanne();
    }
    
    public void demarre(){
        if (moteur.estDemarre()==false){
            moteur.demarre();
        }
    }
    
    public void changeConducteur(Conducteur conducteur){
        pilote = conducteur;
    }
    
    public void attaqueRemorque(Remorque remorque){
        this.remorque = remorque;
    }
    
    public void detacheRemorque(){
        this.remorque = null;
    }
    
    public String toString(){
        String type = "[Voiture] "+modele;
        String enMarche;
        String res ="";
        
        if(moteur.estDemarre()==true){
            enMarche=" est démarré,";
        }else if(moteur.getEnPanne()==true){
            enMarche=" à l'arrêt, en panne.";
        }else{
            enMarche=" à l'arrêt,";
        }
        
        String mot = "->"+moteur.toString()+enMarche;
        res = type+"\n"+mot;
        if(pilote!=null){
            String conduct = "->"+pilote.toString();
            res += "\n"+conduct;
        }
        
        if(remorque!=null){
            String rem = "->"+remorque.toString();
            res += "\n"+rem;
        }
        
        String roue="";
        for(int i=0;i<4;i++){
            Roue r =roues.get(i);
            roue += "-> "+r.toString()+", ";
        }
        
        res += "\n"+roue;
        
        return res;
    }
}
