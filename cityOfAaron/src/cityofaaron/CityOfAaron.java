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

/**
 *
 * @author Saturn
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        CropData cropDataTest = new CropData();
        
        playerOne.setName("Aaron");
        
        String playerOneName = playerOne.getName();
        
            System.out.println("Player Name = " + playerOneName );
        
        String teamMemberName = TeamMember.Ammon.getName();
        
            System.out.println("Team Member = " + teamMemberName);
        
        Location initialPosition = new Location();
        
        initialPosition.setDescription("In the woods.");
        initialPosition.setSymbol("Shield");
                
            System.out.println(initialPosition.toString());
      
       //CropData class test code
       
        cropDataTest.setYear(9);
        cropDataTest.setPopulation(956);
        cropDataTest.setAcresOwned(100);
        cropDataTest.setCropYield(50);
        cropDataTest.setWheatInStore(40);
        cropDataTest.setNumberWhoDied(3);
        cropDataTest.setNewPeople(2);
        cropDataTest.setHarvest(100);
        cropDataTest.setHarvestAfterOffering(110);
        cropDataTest.setOffering(10);
        cropDataTest.setOfferingBushels(12);
        cropDataTest.setPeopleFed(1000);
        cropDataTest.setAcresPlanted(100);
        cropDataTest.setNumStarved(1);
        cropDataTest.setEatenByRats(3);
        cropDataTest.setWheatForPeople(20);
        
        int cropDataYear = cropDataTest.getYear();
        int cropDataPopulation = cropDataTest.getPopulation();
        int cropDataAcresOwned = cropDataTest.getAcresOwned();
        int cropDatacropYield = cropDataTest.getCropYield();
        int cropDatawheatInStore = cropDataTest.getWheatInStore();
        int cropDatanumberWhoDied = cropDataTest.getNumberWhoDied();
        int cropDataNewPeople = cropDataTest.getNewPeople();
        int cropDataHarvest = cropDataTest.getHarvest();
        int cropDataHarvestAfterOffering = cropDataTest.getHarvestAfterOffering();
        int cropDataOffering = cropDataTest.getOffering();
        int cropDataOfferingBushels = cropDataTest.getOfferingBushels();
        int cropDataPeopleFed = cropDataTest.getPeopleFed();
        int cropDataAcresPlanted = cropDataTest.getAcresPlanted();
        int cropDataNumStarved = cropDataTest.getNumStarved();
        int cropDataEatenByRats = cropDataTest.getEatenByRats();
        int cropDataWheatForPeople = cropDataTest.getWheatForPeople();
        
        System.out.println(cropDataTest.toString());
        
        // end cropData test code
        
    }
    
}
