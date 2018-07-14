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
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author ray_m
 */
public class GameControl {
    
    // size of the Locations array
    private static final int MAX_ROW = 5; 
    private static final int MAX_COL = 5;
    private static Scanner keyboard = new Scanner(System.in);
    
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
        // Create list of tools
        createToolList();
        //create the list of proviscreateProvisionsList();
        createProvisionsList();
  
        createMap();
        
        }
        
    public static void saveGame(Game theGame, String filePath) {
        
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(theGame);
            System.out.println("\nGame saved.");

        }
        catch(Exception x)
        {
            System.out.println("\nThere was an error saving the game");
        }
}
    
    
    public static void getSavedGame(String filePath) {
        Game theGame = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            theGame = (Game) input.readObject();
            CityOfAaron.setTheGame(theGame);
            System.out.println("\nGame loaded.");

        }
        catch(Exception e)
        {
            System.out.println("\nThere was an error reading the saved gamed");
        }
}
        
        // method prologues ….
        public static void createCropDataObject()
        {
        CropData theCrops = new CropData();
        
        theCrops.setPopulation(100); 
        theCrops.setNewPeople(5); 
        theCrops.setCropYield(3); 
        theCrops.setYears(0); 
        theCrops.setNumberWhoDied(0); 
        theCrops.setOffering(10); 
        theCrops.setWheatInStore(2700); 
        theCrops.setAcresOwned(1000); 
        theCrops.setAcresPlanted(1000); 
        theCrops.setHarvest(3000); 
        theCrops.setOfferingBushels(300); 
        theCrops.setAcresPlanted(1000);
        // Save the cropData in the Game object 
        theGame.setCrop(theCrops);

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
        
        public static void printWriter(String filePath, ArrayList<ListItem> inventoryItems, String ListName) 
    {
        
        //theGame = new Game();
        try (PrintWriter pwout = new PrintWriter(filePath))
        {
            pwout.println("\n\n   " + ListName + " Stock Report                ");
            
            pwout.printf("%n%-20s%10s", ListName, "Quantity");
            pwout.printf("%n%-20s%10s", "------", "--------"); 
            for (ListItem item : inventoryItems) {
                pwout.printf("%n%-20s%7d", item.getName(), item.getNumber());
               
                //System.out.println(item.getName());
                //System.out.println(item.getNumber());
            }
            System.out.println("\nReport was saved to " + filePath + " successfully!");
            pwout.close();
        }
        catch(Exception e)
        {
            System.out.println("\nThere was an error saving the the listlist to disk. " + e.getMessage());
        }
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
    System.out.println("\nYour animals:");
        Game game = CityOfAaron.getTheGame();
        
        ArrayList<ListItem> animals = game.getAnimals();
        
           System.out.println("\n\n   Animals In Inventory     ");
           System.out.printf("%n%-20s%10s", "Animal", "Quantity");
           System.out.printf("%n%-20s%10s", "------", "--------"); 
            for (ListItem item : animals) {
                System.out.printf("%n%-20s%7d", item.getName(), item.getNumber());
            }

        System.out.println("\n\nWould you like to save this list as a file? (y/n)");
        String ans = keyboard.next();
        if ("y".equals(ans)) {
            System.out.println("\nPlease provide the path and filename you would like to save to");
            String fileLocation = keyboard.next();   
            
            GameControl.printWriter(fileLocation, animals, "Animal");
        } 
  
}

public static void createProvisionsList()
{
        
    ArrayList<ListItem> provisions = new ArrayList<ListItem>();
    
            provisions.add(new ListItem("food Items", 10));
            provisions.add(new ListItem("bottles of water", 15));
	    provisions.add(new ListItem("toolbox", 2));
	    
            
            //Save the provisions in the game
            theGame.setProvisions(provisions);
}

public void displayProvisionsList(){
        Game game = CityOfAaron.getTheGame();
      
        System.out.println("\nCurrent Provisions:\n");
        for (int i = 0; i < game.getProvisions().size(); i++){
        System.out.println(game.getProvisions().get(i).getName() + ": " +game.getProvisions().get(i).getNumber());
        }
}

    public static void createToolList()
    {

	    ArrayList<ListItem> tools = new ArrayList<ListItem>();
	    
	    tools.add(new ListItem("shovel", 22));
            tools.add(new ListItem("hoe", 25));
	    tools.add(new ListItem("plow", 7));
	    tools.add(new ListItem("Pitch Fork", 18));
	    
	    // Save the tools in the game
	    theGame.setTools(tools);
	
}

    public void displayToolList() {
            Game game = CityOfAaron.getTheGame();
              
            ArrayList<ListItem> tools = game.getTools();
            
            System.out.println("\n\n     Tool Stock Report:");
            System.out.printf("%n%-20s%10s", "Tool", "Quantity");
            System.out.printf("%n%-20s%10s", "----", "--------"); 
            
            for (ListItem item : tools) {
                System.out.printf("%n%-20s%7d", item.getName(), item.getNumber());
            }
            
            System.out.println("\n\nWould you like to save this list as a file? (y/n)");
            String ans = keyboard.next();
        if ("y".equals(ans)) {
            System.out.println("\nPlease provide the path and filename you would like to save to");
            String fileLocation = keyboard.next();   
            
            GameControl.printWriter(fileLocation, tools, "Tool");
            }  
    }
   
}
