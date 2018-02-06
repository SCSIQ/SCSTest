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
public class Date {
 private int mois; 
 private int jour ; 
 private int annee ; 
 
 public Date () {
     jour=mois=annee=1;
 }
 
 
 public Date (int j, int m , int a ){
     jour = j ; 
     mois = m;
     annee = a ;
 }
 
 
 public String toString (){
  String res ; 
  res = jour + "/" + mois + "/" + annee ;
  return res ;
 } 
 
 }

