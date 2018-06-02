/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.control;

import byui.cit260.cityofaaron.model.CropData;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ray_m
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of buyLand method, of class InventoryControl.
     */
//    @Test
//    public void testBuyLand() {
//        System.out.println("buyLand");
//        int landPrice = 0;
//        int acresToBuy = 0;
//        CropData cropData = null;
//        int expResult = 0;
//        int result = InventoryControl.buyLand(landPrice, acresToBuy, cropData);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of calcLandCost method, of class InventoryControl.
//     */
//    @Test
//    public void testCalcLandCost() {
//        System.out.println("calcLandCost");
//        int expResult = 0;
//        int result = InventoryControl.calcLandCost();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of feedPeople method, of class InventoryControl.
//     */
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        
        // --- Test case 1 ---
        System.out.println("Test case 1");
        
        // define the input variables
        int wheatForPeople = 5;
        CropData cropData = new CropData();
        
        // Set wheatInStore variable
        int wheatInStore = 10;
        cropData.setWheatInStore(wheatInStore);
        
        int expResult = 5;
        int result = InventoryControl.feedPeople(wheatForPeople, cropData);
        assertEquals(expResult, result);
        
         // --- Test case 2 ---
        System.out.println("Test case 2");
        
        // define the input variables
        wheatForPeople = 0;
        // reset cropDataWheatForPeople variable for testing
        cropData.setWheatForPeople(0);
        
        // Set wheatInStore variable
        wheatInStore = 10;
        cropData.setWheatInStore(wheatInStore);
        
        expResult = 0;
        result = InventoryControl.feedPeople(wheatForPeople, cropData);
        assertEquals(expResult, result);
        
         // --- Test case 3 ---
        System.out.println("Test case 3");
        
        // define the input variables
        wheatForPeople = -1;
        // reset cropDataWheatForPeople variable for testing
        cropData.setWheatForPeople(0);
        
        // Set wheatInStore variable
        wheatInStore = 10;
        cropData.setWheatInStore(wheatInStore);
        
        expResult = -1;
        result = InventoryControl.feedPeople(wheatForPeople, cropData);
        assertEquals(expResult, result);
        
                 // --- Test case 4 ---
        System.out.println("Test case 4");
        
        // define the input variables
        wheatForPeople = 15;
        // reset cropDataWheatForPeople variable for testing
        cropData.setWheatForPeople(0);
        
        // Set wheatInStore variable
        wheatInStore = 10;
        cropData.setWheatInStore(wheatInStore);
        
        expResult = -1;
        result = InventoryControl.feedPeople(wheatForPeople, cropData);
        assertEquals(expResult, result);

    }
    
}
