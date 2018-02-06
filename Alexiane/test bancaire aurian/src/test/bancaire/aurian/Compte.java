/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.bancaire.aurian;

import java.util.ArrayList;

/**
 *
 * @author ab587732
 */
public class Compte {
  private int numero ; 
  private String proprietaire ; 
  private double solde ;  
  private Date dateOU; 
  private ArrayList<Operation> listeOp ; 
  
  public Compte () {
      numero = 1 ;  
      proprietaire = "Aucun";
      solde = 0;
                       
  }
  public String toString() {
      return "C'est un compte";
  }
}
