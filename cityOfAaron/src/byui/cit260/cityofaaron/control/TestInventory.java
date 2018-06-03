/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.control;
import byui.cit260.cityofaaron.model.CropData;

/**
 *
 * @author silver
 */
public class TestInventory {
    
    
    public void buyLandTest1() {
        
        System.out.println("buyLand() All Valid Parameter Inputs");
        
         System.out.println("Test Case #1: VALID");
        
        CropData ourCrops = new CropData();
        CropControl landCost = new CropControl();
 
        
        int landPrice = landCost.calcLandCost() ;
        int acresToBuy = 10;
        int theResult = 30;

        ourCrops.setWheatInStore(300);
        ourCrops.setAcresOwned(20);
        ourCrops.setPopulation(3);
        
        int result = CropControl.buyLand(landPrice, acresToBuy, ourCrops);
        System.out.println("Intended Result:" + theResult + "\nActual Result:" + result +"\n");
}
    public void buyLandTest2() {
        
        System.out.println("buyLand() Not Enough Wheat");
        
         System.out.println("Test Case #2: INVALID");
        
        CropData ourCrops = new CropData();
        CropControl landCost = new CropControl();
 
        
        int landPrice = landCost.calcLandCost() ;
        int acresToBuy = 10;
        int theResult = -1;

        ourCrops.setWheatInStore(145);
        ourCrops.setAcresOwned(9);
        ourCrops.setPopulation(2);
        
        int result = CropControl.buyLand(landPrice, acresToBuy, ourCrops);
        System.out.println("Intended Result:" + theResult + "\nActual Result:" + result +"\n");
}
public void buyLandTest3() {
        
        System.out.println("buyLand() Population Too Low");
        
         System.out.println("Test Case #3: INVALID");
        
        CropData ourCrops = new CropData();
        CropControl landCost = new CropControl();
 
        
        int landPrice = landCost.calcLandCost() ;
        int acresToBuy = 20;
        int theResult = -1;

        ourCrops.setWheatInStore(200);
        ourCrops.setAcresOwned(20);
        ourCrops.setPopulation(1);
        
        int result = CropControl.buyLand(landPrice, acresToBuy, ourCrops);
        System.out.println("Intended Result:" + theResult + "\nActual Result:" + result +"\n");
}
public void buyLandTest4() {
        
        System.out.println("buyLand() acresToBuy are > 0");
        
         System.out.println("Test Case #4: INVALID");
        
        CropData ourCrops = new CropData();
        CropControl landCost = new CropControl();
 
        
        int landPrice = landCost.calcLandCost() ;
        int acresToBuy = -2;
        int theResult = -1;

        ourCrops.setWheatInStore(300);
        ourCrops.setAcresOwned(20);
        ourCrops.setPopulation(3);
        
        int result = CropControl.buyLand(landPrice, acresToBuy, ourCrops);
        System.out.println("Intended Result:" + theResult + "\nActual Result:" + result +"\n");
}
public void setOfferingTest1() throws Exception{
        
        System.out.println("setOferring() Valid Test");
        
         System.out.println("Test Case #1: Valid");
        
        CropData ourCrops = new CropData(); 
        
        int offering = 10;
        int harvest = 100;
        int expectedReturn = 10;

        ourCrops.setHarvest(harvest);
        
        int result = CropControl.setOffering(offering, ourCrops);
        System.out.println("Intended Result:" + expectedReturn + "\nActual Result:" + result +"\n");
}
public void setOfferingTest2() throws Exception{
        
        System.out.println("setOferring() 'Negative Offering of -10'");
        
         System.out.println("Test Case #2: Invalid");
        
        CropData ourCrops = new CropData(); 
        
        int offering = -10;
        int harvest = 100;
        int expectedReturn = -1;

        ourCrops.setHarvest(harvest);
        
        int result = CropControl.setOffering(offering, ourCrops);
        System.out.println("Intended Result:" + expectedReturn + "\nActual Result:" + result +"\n");
}
public void setOfferingTest3() throws Exception{
        
        System.out.println("setOferring() 'Offering over 100'");
        
         System.out.println("Test Case #3: Invalid");
        
        CropData ourCrops = new CropData(); 
        
        int offering = 105;
        int harvest = 100;
        int expectedReturn = -2;

        ourCrops.setHarvest(harvest);
        
        int result = CropControl.setOffering(offering, ourCrops);
        System.out.println("Intended Result:" + expectedReturn + "\nActual Result:" + result +"\n");
}
}
