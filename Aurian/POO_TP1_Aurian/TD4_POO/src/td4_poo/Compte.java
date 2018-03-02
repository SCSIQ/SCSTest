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
public class Compte {
    
    /*ATTRIBUTS*/
    private int numero;
    private int solde;

    private Personne client;

    /*CONSTRUCTEUR*/
    public Compte(Personne p, int num) {
        client = p;
        numero = num;
        solde = 0;
    }
    
    /*OPERATIONS*/
    public void deposer(int s) {
    }
    public void retirer(int s) {
    }
    public void affecterPrioprietaire(Personne p) {
    }
    public String toString() {
        return "Numéro de compte : "+numero+" | Solde : "+solde;
    }

}
