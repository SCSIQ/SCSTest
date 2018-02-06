package travailemilie;

import java.util.ArrayList;

/**
 *
 * @author emili
 */
public class Compte {
    private String num ; 
    private String proprio;
    private double solde ; 
    private Date ouverture;
    private ArrayList<Operation> listeOperation;
    
    public Compte() {
        num=proprio="Erreur";
        solde=0;
       Date ouverture = new Date (0,0,0);
    }
    
    
}
