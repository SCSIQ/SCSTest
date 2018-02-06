/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.bancaire.aurian;

/**
 *
 * @author ab587732
 */
public class ComppteEpargne extends Compte {
  private float taux; 

public ComppteEpargne () {
    taux = 0 ; 
}  
public String toString() {
    return "C'est un compte épargne " ; 
}
}
