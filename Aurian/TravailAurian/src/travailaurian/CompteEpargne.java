package travailaurian;

public class CompteEpargne extends Compte {
    private float taux;
    public CompteEpargne (float e)
    {
        taux=e;
    }
    public CompteEpargne ()
    {
        taux=0;
    }
    public float taux()
    {
        return taux;
    }
    public void taux(float t)
    {
        taux=t;
    }
}
