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
public class Operation {
    private Date date0o ;
    private int montant ; 
    private String libelle ; 
   
public Operation(){
   montant=0;
   libelle="Aucun";
   Date date0p = new Date (00,00,00);
}

public String toString (){
  String res ="" ; 
  res = "|" + libelle + "|" + montant; 
  return res ; 
}


}
