package travailaurian;

public class CompteCourant extends Compte {
    private double montantDecouvertAutorise;
    public CompteCourant(double m)
    {
        montantDecouvertAutorise=m;
    }
    public CompteCourant()
    {
        montantDecouvertAutorise=0;
    }
    public double montantDecouvertAutorise()
    {
        return montantDecouvertAutorise;
    }
    public void montantDecouvertAutorise(double m)
    {
        montantDecouvertAutorise=m;
    }
    public String toString()
    {
       return "C'est un compte courant";         
    }
}
