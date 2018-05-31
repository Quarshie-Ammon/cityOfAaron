/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.control;
import byui.cit260.cityofaaron.model.CropData;
import byui.cit260.cityofaaron.control.InventoryControl;

/**
 *
 * @author silver
 */
public class TestInventory {
    
    
    public void buyLandTest1() {
        
        System.out.println("buyLand() Testing");
        
         System.out.println("Test Case #1: VALID");
        
        CropData ourCrops = new CropData();
        InventoryControl landCost = new InventoryControl();
 
        
        int landPrice = landCost.calcLandCost() ;
        int acresToBuy = 10;
        int theResult = 30;

        ourCrops.setWheatInStore(300);
        ourCrops.setAcresOwned(20);
        ourCrops.setPopulation(3);
        
        int result = InventoryControl.buyLand(landPrice, acresToBuy, ourCrops);
        System.out.println("Intended Result:" + theResult);
}
    
}
