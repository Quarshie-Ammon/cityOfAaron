
package byui.cit260.cityofaaron.control;
import byui.cit260.cityofaaron.model.*;
import java.util.Random;
/**
 *
 * @author Saturn
 */
public class CropControl {
    //buyLand method
    //Purpose: Buy land - Adds land to acers owned and subtracts cost from 
    //    wheatInStore
    //Parameters: landPrice, the number of acres to buy, and a reference to a
    //    cropData object
    //Pre-conditions: acresToBuy > 0 and population < (acersOwned + acresToBuy)/10
    //    and wheatInStore > acresToBuy * landPrice
    // Returns: The number of acres owned after adding land bought to acresOwned
    
  public static int buyLand(int landPrice, int acresToBuy, CropData cropData) {
      
     
     
      //get values from cropData
    int wheatInStore = cropData.getWheatInStore();
    int population = cropData.getPopulation();
    int acresOwned = cropData.getAcresOwned();
    
      //if acresToBuy < 0, return -1
    if (acresToBuy < 0) {
        return -1;
    }

      //if population < (acresOwned + acresToBuy/10), return -1
    if (population < ((acresOwned + acresToBuy) / 10)) {
        return -1;
    }
    
       //if acresToBuy * landPrice > wheatInStore, return -1
        if (acresToBuy * landPrice > wheatInStore) {
        return -1;
    }

       //acresOwned = acresOwned + acresToBuy
       //update cropData.acresOwned variable
    acresOwned += acresToBuy;
    cropData.setAcresOwned(acresOwned);

       //wheatInStore = wheatInStore - (acresToBuy * landPrice)
       //update cropData.wheatInStore variable
    wheatInStore -= (acresToBuy * landPrice);
    cropData.setWheatInStore(wheatInStore);

      //Return number of acresOwned
    return acresOwned;

} 
  
  //calcLandCost
  //Purpose: Generate random number between 17 and 27 to caclulate landPrice
  //Parameters: none
  //Preconditions: none
  //Returns: landPrice
  private static Random random = new Random();  
  public static int calcLandCost(){
  // get random value between 17 and 27  
  int landPrice = random.nextInt(28-17)+ 17;
  //return value as landPrice
  return landPrice;
} 

    //feedPeople method
    //Purpose: to set aside wheat to feed people
    //Parameters: amountof wheat to buy to feed the people, 
    // and a reference to a cropData object
    //Pre-conditions: wheatForPeople > 0 and wheatInStore >  wheatForPeople
    // Returns: THe amount of wheat yhou have set aside for the people
   public static int feedPeople(int wheatForPeople, CropData cropData) {
       //get values from cropData
       int wheatInStore = cropData.getWheatInStore();
       
       //if wheatForPeople < 0, return -1
       if (wheatForPeople < 0) {
        return -1;
    }
      
       //if wheatInStore < wheatForPeople, return -1
    if (wheatInStore < wheatForPeople) {
        return -1;
    }
       //wheatInStore = wheatInStore - wheatForPeople
       //update cropData.wheatForPeople variable
       wheatInStore -= wheatForPeople;
       cropData.setWheatInStore(wheatInStore);
      
       //wheatForPeople = newly set aside wheat for people + wheat already stored for people
       //update cropData.wheatForPeople variable
       wheatForPeople+=cropData.getWheatForPeople();
       cropData.setWheatForPeople(wheatForPeople);
        
  //return value as wheatForPeople
  return wheatForPeople;    
 }
}
