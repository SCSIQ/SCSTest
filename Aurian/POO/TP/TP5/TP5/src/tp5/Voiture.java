/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

import java.util.ArrayList;

/**
 *
 * @author durand aurian
 * 
 */
public class Voiture {

    private Moteur moteur;
    private String modele;
    private Conducteur pilote = null;
    private Remorque remorque = null;
    private ArrayList<Roue> roues;
    
    /**
     * 
     * @param cv nombre de chevaux du moteur 
     * @param type type de voiture (ex : formule1,twingo,etc) 
     * @param tailleRoue taille res roues de la voiture s
     */
    public Voiture(int cv, String type, int tailleRoue ){ 
        modele=type;
        moteur=new Moteur(cv,this);
        roues = new ArrayList();
        for(int i=0;i<4;i++){
            roues.add(new Roue(tailleRoue));
        }
    }
    
    /**
     * 
     * @param aThis constructeur privé permetant de cloner la voiture 
     */
    private Voiture(Voiture aThis) {
        this.modele=aThis.modele;
        this.moteur=aThis.moteur;
        this.pilote=aThis.pilote;
        this.remorque=aThis.remorque;
        this.roues=aThis.roues;
    }
    
    /**
     * 
     * @return un clone de la voiture 
     */
    public Voiture clone(){
        return new Voiture(this);
    }
    
    public boolean equals(Voiture v){
        boolean resultat = false;
        if((this.modele==v.modele)&&(this.moteur==v.moteur)&&(this.pilote==v.pilote)&&(this.remorque==v.remorque)&&(this.roues==v.roues)){
            resultat = true;
        }
        return resultat;
    }
    
    /**
     * modifie l'état de la voiture à en panne
     */
    public void enPanne(){
        moteur.enPanne();
    }
    
    /**
     * démare le moteur 
     */
    public void demarre(){
        if (moteur.estDemarre()==false){
            moteur.demarre();
        }
    }
    /**
     * 
     * @param conducteur donne le nouveau conducteur à la fonction 
     */
    public void changeConducteur(Conducteur conducteur){
        pilote = conducteur;
    }
    /**
     * 
     * @param remorque donne la remorque à attacher 
     */
    public void attacheRemorque(Remorque remorque){
        this.remorque = remorque;
    }
    
    /**
     * détache la remorque 
     */
    public void detacheRemorque(){
        this.remorque = null;
    }
    
    /**
     * 
     * @return une chaine de caractère décraivant la voiture 
     */
    public String toString(){
        String type = "[Voiture] "+modele;
        String enMarche;
        String res ="";
        
        if(moteur.estDemarre()==true){ //affiche si le moteur est démaré ou non, et si il est en panne ou non
            enMarche=" est démarré,";
        }else if(moteur.getEnPanne()==true){
            enMarche=" à l'arrêt, en panne.";
        }else{
            enMarche=" à l'arrêt,";
        }
        
        String mot = "->"+moteur.toString()+enMarche;
        res = type+"\n"+mot;
        if(pilote!=null){ //affiche les détails d conducteur si il y en a un 
            String conduct = "->"+pilote.toString();
            res += "\n"+conduct;
        }
        
        if(remorque!=null){ //affiche les détails de la remorque si il y en a une 
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
