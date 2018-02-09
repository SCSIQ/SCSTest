package travailaurian;

public class Operation {
    private int montant;
    private String libelle;
    private Date dateOp;
    
    public Operation() {
        montant=0;
        libelle="Aucun";
        dateOp = new Date (00,00,00);
    }
    
    public String toString()
    {
        return "Montant : "+montant+" | Libelle : "+libelle+" | "+dateOp.toString();
    }
}
