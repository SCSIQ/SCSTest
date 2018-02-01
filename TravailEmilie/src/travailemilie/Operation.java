package travailemilie;

/**
 *
 * @author emili
 */
public class Operation {
    private int montant; 
    private Date dateOp;
    private String libelle;
    
public Operation() {
    montant=0;
    libelle="";
    Date dateOp = new Date(0,0,0);
}    


public String toString() {
    System.out.println("Montant : "+montant+ " Libellé : "+ libelle);
    dateOp.toString();
    return null;
}
}
