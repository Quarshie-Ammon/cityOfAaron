/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import byui.cit260.cityofaaron.model.Location;
import byui.cit260.cityofaaron.model.Player;
import byui.cit260.cityofaaron.model.TeamMember;
import byui.cit260.cityofaaron.model.CropData;
import byui.cit260.cityofaaron.control.TestInventory;

/**
 *
 * @author Saturn
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//        Player playerOne = new Player();
//        CropData cropDataTest = new CropData();
        TestInventory InvTest = new TestInventory();
        
//        playerOne.setName("Aaron");
//        
//        String playerOneName = playerOne.getName();
//        
//            System.out.println("Player Name = " + playerOneName );
//        
//        String teamMemberName = TeamMember.Ammon.getName();
//        
//            System.out.println("Team Member = " + teamMemberName);
//        
//        Location initialPosition = new Location();
//        
//        initialPosition.setDescription("In the woods.");
//        initialPosition.setSymbol("Shield");
//                
//            System.out.println(initialPosition.toString());
//      
//       //CropData class test code
//       
//        cropDataTest.setYear(9);
//        cropDataTest.setPopulation(956);
//        cropDataTest.setAcresOwned(100);
//        cropDataTest.setCropYield(50);
//        cropDataTest.setWheatInStore(40);
//        cropDataTest.setNumberWhoDied(3);
//        cropDataTest.setNewPeople(2);
//        cropDataTest.setHarvest(100);
//        cropDataTest.setHarvestAfterOffering(110);
//        cropDataTest.setOffering(10);
//        cropDataTest.setOfferingBushels(12);
//        cropDataTest.setPeopleFed(1000);
//        cropDataTest.setAcresPlanted(100);
//        cropDataTest.setNumStarved(1);
//        cropDataTest.setEatenByRats(3);
//        cropDataTest.setWheatForPeople(20);
//        
//              
//        System.out.println(cropDataTest.toString());
        
        // end cropData test code
        
        // begin test cases for buyLand() & setOffering()
        
        InvTest.buyLandTest1();
        InvTest.buyLandTest2();
        InvTest.buyLandTest3();
        InvTest.buyLandTest4();
        InvTest.setOfferingTest1();
        InvTest.setOfferingTest2();
        InvTest.setOfferingTest3();
        
        
        // end test cases
        
    }
    
}
