package travailaurian;

public class Date {
    private int jour;
    private int mois;
    private int annee;
                    
    public Date()
    {
        jour=mois=annee=1;;
    }
    public Date(int j,int m,int a)
    {
        jour = j;
        mois = m;
        annee = a;
    }
    public String toString()
    {
        return String.valueOf(jour) + "/" + String.valueOf(mois) + "/" + String.valueOf(annee);
    }
}
