/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.control;
import java.util.ArrayList; 
import cityofaaron.CityOfAaron;
import byui.cit260.cityofaaron.model.*;
import byui.cit260.cityofaaron.view.*;

import java.util.ArrayList;

/**
 *
 * @author ray_m
 */
public class GameControl {
    
    // size of the Locations array
    private static final int MAX_ROW = 5; 
    private static final int MAX_COL = 5;
    
    // reference to a Game object
    private static Game theGame;

    public static void createNewGame(String name)
        {
        // Created the game object. Save it in the main driver file
        // create the player object. Save it in the game object
        // create the CropData object
        // create the list of animals
        // create the list of tools
        //create the list of provisions
        // create the Locations and the Map object
            
        //Create the Game object, save it in the main driver file 
        theGame = new Game(); 
        CityOfAaron.setTheGame(theGame);
        
        // create the player object. Save it in the game object 
        Player thePlayer = new Player(); 
        thePlayer.setName(name); 
        theGame.setPlayer(thePlayer);
        
        createCropDataObject();
        
         // create the list of animals
        createAnimalList();
  
        createMap();
        
        }
        
        // method prologues ….
        public static void createCropDataObject()
        {
        CropData theCrops = new CropData();
        
        theCrops.setYears(0); 
        theCrops.setPopulation(100); 
        theCrops.setNewPeople(5); 
        theCrops.setCropYield(3); 
        theCrops.setNumberWhoDied(0); 
        theCrops.setOffering(10); 
        theCrops.setWheatInStore(2700); 
        theCrops.setAcresOwned(1000); 
        theCrops.setAcresPlanted(1000); 
        theCrops.setHarvest(3000); 
        theCrops.setOfferingBushels(300); 
        theCrops.setAcresPlanted(1000);
        // Save the cropData in the Game object 
        theGame.setCropData(theCrops);
        }
        
        /**
        *	The createMap method
        *	Purpose: creates the location objects and the map
        *	Parameters: none
        *	Returns: none
        */
        public static void createMap()
        {
        // create the Map object,
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
        
        // create a string that will go in the Location objects
        // that contain the river
        String river = "You are on the River. The river is the source\n" +
        "of life for our city. The river marks the eastern\n " +
        "boundary of the city - it is wilderness to the East.\n";
        
        // create a new Location object
        Location loc = new Location();
        
        // use setters in the Location class to set the description and symbol
        loc.setDescription(river);
        loc.setSymbol("~~~");
        
        // set this location object in each cell of the array in column 4
        for(int i = 0; i < MAX_ROW; i++)
        {
        theMap.setLocation(i, 4, loc);
        }
        
        // define the string for a farm land location
        String farmland = "You are on the fertile banks of the River.\n" + 
        "In the spring, this low farmland floods and is covered with rich\n" + 
        "new soil. Wheat is planted as far as you can see.";
        
        // set a farmland location with a hint
        loc = new Location();
        loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
        loc.setSymbol("!!!"); 
        theMap.setLocation(0, 2, loc);
        theMap.setLocation(1, 1, loc);
        theMap.setLocation(2, 1, loc);
        theMap.setLocation(3, 0, loc);
        theMap.setLocation(3, 1, loc);
        theMap.setLocation(4, 0, loc);
        theMap.setLocation(4, 1, loc);
        theMap.setLocation(2, 0, loc);
        
        
        // define the string for a undeveloped land location
        String undeveloped = "This is land with potential, it can be developed.";
        
        // set a farmland location with a hint
        loc = new Location();
        loc.setDescription(undeveloped + "\nA tumbleweed rolls by.");
        loc.setSymbol("###"); 
        for(int i = 0; i < MAX_ROW; i++)
        {
        theMap.setLocation(i, 3, loc);
        
        }
        for(int i = 1; i < MAX_ROW; i++)
        {
        theMap.setLocation(i, 2, loc);
        
        }
        
        // define the string for a granary/storehouse location
        String granary = "\nWheat and other supplies abound at this location.";
        
        // set a granary & storehouse location with a hint
        loc = new Location();
        loc.setDescription(granary + "\nIt's great to have supplies.");
        loc.setSymbol("==="); 
        theMap.setLocation(0, 1, loc);
        
        // define the string for a granary/storehouse location
        String rulers = "\n An important person sits upon a throne here." ;
        
        // set a granary & storehouse location with a hint
        loc = new Location();
        loc.setDescription(rulers + "\nMoney and power.");
        loc.setSymbol("$$$"); 
        theMap.setLocation(1, 0, loc);
        
        // define the string for a granary/storehouse location
        String village = "\n This is a place where the average people live" ;
        
        // set a granary & storehouse location with a hint
        loc = new Location();
        loc.setDescription(village + "\nLess money and power.");
        loc.setSymbol("^^^"); 
        theMap.setLocation(0, 0, loc);
        

        theGame.setMap(theMap);
      
        
        }
        
    public static void displayMap() 
        {
            
            Game game = CityOfAaron.getTheGame();
            Map theMap = game.getTheMap();
        System.out.println("\n**The City Map**\n");
        String column = "";
               
        //print each line (row)
        for(int i = 0; i < 5; i++){
       
            //print column of each row
            for(int j = 0; j< 5; j++){
            column += "|" + theMap.getLocation(i, j).getSymbol();
            }
           
            System.out.println(column + "|");                      
            column = "";            
}
            System.out.println("\n"
                + "  Map Key:\n"
                + "  ^^^ - Village\n"
                + "  !!! - Farmland\n"
                + "  ~~~ - River\n"
                + "  === - Granary and Storehouse\n"
                + "  $$$ - Rulers Court\n"
                + "  ### - Undeveloped Land");
            
                    
        }
    
    
public static void createAnimalList()
    {
   
   		
	    ArrayList<ListItem> animals = new ArrayList<ListItem>();
	    
	    animals.add(new ListItem("cows", 12));
            animals.add(new ListItem("horses", 3));
	    animals.add(new ListItem("pigs", 7));
	    animals.add(new ListItem("goats", 4));
	    
	    // Save the animals in the game
	    theGame.setAnimals(animals);
	
}

public void displayAnimalList() {
            System.out.println("\nCurrent Animals:\n");
        for (int i = 0; i < theGame.getAnimals().size(); i++) {
            System.out.println(theGame.getAnimals().get(i).getName() + ": " +theGame.getAnimals().get(i).getNumber());
        }  
}
    
}
