package travailaurian;

import java.util.ArrayList;

public class Compte {
    private String numC;
    private String proprio;
    private double solde;
    private Date dateOuverture;
    private ArrayList<Operation> listeOperations;
   
    public Compte()
    {
        numC=proprio="Erreur";
        solde=0;
        dateOuverture = new Date (00,00,00);
    }
    
    public String toString()
    {
       return "C'est un compte";         
    }
    
}
