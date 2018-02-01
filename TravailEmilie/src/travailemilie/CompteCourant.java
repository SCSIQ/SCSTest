package travailemilie;

/**
 *
 * @author emili
 */
public class CompteCourant extends Compte{          // extends = fille de compte
    private double montantDecouvertAutorise ; 
    
    public CompteCourant(double m) {
        montantDecouvertAutorise=m;
    }
    public CompteCourant() {
        montantDecouvertAutorise=0;
    }
    public double getmontantDecouvertAutorise() {
        return montantDecouvertAutorise;    
    }
}
