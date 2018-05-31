/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.control;
import byui.cit260.cityofaaron.model.*;
import java.util.Random;
/**
 *
 * @author Saturn
 */
public class InventoryControl {
    
  public static int buyLand(int landPrice, int acresToBuy, CropData cropData) {
        
    int wheatInStore = cropData.getWheatInStore();
    int population = cropData.getPopulation();
    int acresOwned = cropData.getAcresOwned();
    

    if (acresToBuy < 0) {
        return -1;
    }

    if (acresToBuy * landPrice > wheatInStore) {
        return -1;
    }

    if (population < ((acresOwned + acresToBuy) / 10)) {
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
  int landPrice = random.nextInt(28-17)+ 17;
  return landPrice;
} 
    
    
}
