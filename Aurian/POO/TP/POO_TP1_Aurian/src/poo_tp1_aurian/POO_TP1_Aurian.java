/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_tp1_aurian;

/**
 *
 * @author ad731784
 */
public class POO_TP1_Aurian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "ma chaine";
        System.out.println(compteNbChar(s));
        
    }
    
    public static int compteNbChar(String s)
    {
        int longueur = s.length();
        int compteur = 0;
        for (int i = 1; i <= longueur; i++)
        {
            if(s.charAt(i)=='a')
            {
                compteur++;
            }
            else 
            {
                compteur = -1;
            }
        }
        return compteur;
    }
    
}
