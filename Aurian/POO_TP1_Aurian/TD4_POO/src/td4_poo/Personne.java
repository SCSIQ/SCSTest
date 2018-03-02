/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td4_poo;

/**
 *
 * @author ad731784
 */
public class Personne {
    /*ATTRIBUTS*/
    private String nom;
    private String prenom;

    private Compte monCompte;

    /*CONSTRUCTEUR*/
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        Compte c = new Compte(this,0);
        monCompte = c;
    }
    
    /*OPERATIONS*/
    public void affecterCompte(Compte c) {
    }
    
    public String toString() {
        return "Personne : "+nom+" "+prenom+" --- "+monCompte.toString();
    }
    
}
