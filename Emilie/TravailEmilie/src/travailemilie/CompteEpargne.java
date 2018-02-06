package travailemilie;

/**
 *
 * @author emili
 */
public class CompteEpargne {
   private float taux; 
   public CompteEpargne(float e) {
       taux = e;
   }
   public CompteEpargne() {
       taux = 0;
   }
   public float getTaux(){
       return taux;
   }
   
  public void taux(float t){
      taux= t;
  }
}
