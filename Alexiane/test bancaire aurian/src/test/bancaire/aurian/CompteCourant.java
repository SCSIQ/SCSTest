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
public class CompteCourant extends Compte {
 
    private double montantDA ;  
 
 public CompteCourant () {
     montantDA = 0 ; 
 }
 
 public String toString () {
    return "C'est un compte courant" ;  
 }
 
}
