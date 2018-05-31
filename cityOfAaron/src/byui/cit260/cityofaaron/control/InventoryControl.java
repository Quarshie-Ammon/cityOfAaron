
package byui.cit260.cityofaaron.control;
import byui.cit260.cityofaaron.model.*;
import java.util.Random;
/**
 *
 * @author Saturn
 */
public class InventoryControl {
    
  public static int buyLand(int landPrice, int acresToBuy, CropData cropData) {
     
      // get values from cropData
    int wheatInStore = cropData.getWheatInStore();
    int population = cropData.getPopulation();
    int acresOwned = cropData.getAcresOwned();
    

    if (acresToBuy < 0) {
        return -1;
    }

    if (population < ((acresOwned + acresToBuy) / 10)) {
        return -1;
    }
    
        if (acresToBuy * landPrice > wheatInStore) {
        return -1;
    }

    acresOwned += acresToBuy;
    cropData.setAcresOwned(acresOwned);

    wheatInStore -= (acresToBuy * landPrice);
    cropData.setWheatInStore(wheatInStore);

    return acresOwned;

} 
                
  private static Random random = new Random();  
  public static int calcLandCost(){
  // get value between     
  int landPrice = random.nextInt(28-17)+ 17;
  return landPrice;
} 
    
    
}
