// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Ammon Quarshie, Cameron Milstead, Raymond Mullins
// Date last modified: June 8, 2018
//-------------------------------------------------------------
package byui.cit260.cityofaaron.view;

import java.util.Scanner; 
import cityofaaron.CityOfAaron;
import byui.cit260.cityofaaron.model.Player;
import byui.cit260.cityofaaron.model.*;




public class MainMenuView extends MenuView
{
    Scanner keyboard = new Scanner(System.in);
    private String theMenu; 
    private int max;
    
    HelpMenuView hmv = new HelpMenuView();
    
    
    
    /**
*	The MainMenuView constructor
*	Purpose: Initialize the menu data
*	Parameters: none
*	Returns: none
*/
// ===================================
public MainMenuView()
{
    super( "\n" +
        "**********************************\n" +
        "* CITY OF AARON: MAIN GAME MENU  *\n" +
        "**********************************\n" +
        "1 - Start new game\n" +
        "2 - Get and start a saved game\n" + 
        "3 - Get help on playing the game\n" + 
        "4 - Save game\n" +
        "5 - Quit\n",
       5);
}


    
    /**
    *   The doAction method
    *	Purpose: performs the selected action
    *	Parameters: none
    *	Returns: none
     * @param option
    */
    // ===================================
    @Override public void doAction(int option)
    { 
        switch (option) 
        {
            case 1: // create and start a new game
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu 
                hmv.displayMenu();  
                break;
            case 4: // save game 
                displaySaveGameView(); 
                break;
            case 5:
                System.out.println("Thanks for playing ... bye.");
 
        }
    }
    
     /**
    *	The startNewGame method
    *	Purpose: creates game object and starts the game
    *	Parameters: none
    *	Returns: none
    */
    // ===================================
    public void startNewGame()
    {
        //Create a new Game object.
        Game theGame = new Game();
        
        // Save a reference to it in the GameProject class.
        CityOfAaron.setCurrentGame(theGame);
        
        // Display the Banner Page.
        System.out.println("Welcome to the city of Aaron.");
        
        // Create a new Player object 
        Player thePlayer = new Player();
        
        // Prompt for and get the user’s name. String name;
        String name;
        System.out.println("Please type in your first name: ");
        name = keyboard.next();
        
        // Save the user’s name in the Player object
        thePlayer.setName(name);
        
        // Save a reference to the player object in the Game object
        theGame.setPlayer(thePlayer);
        
        // Display a welcome message
        System.out.println("Welcome " + name + " have fun!");
        
        // Display the Game menu
        
        // Create a CropData object
        CropData cropData = new CropData();
        
        //  initialize 
        cropData.setYear(0); 
        cropData.setPopulation(100); 
        cropData.setNewPeople(5); 
        cropData.setCropYield(3); 
        cropData.setNumberWhoDied(0); 
        cropData.setOffering(10); 
        cropData.setWheatInStore(2700); 
        cropData.setAcresOwned(1000); 
        cropData.setAcresPlanted(1000); 
        cropData.setHarvest(3000);
        cropData.setOfferingBushels(300);
        cropData.setAcresPlanted(1000);
        
        // save a reference to it in the Game
        theGame.setCrop(cropData);
        
        
        //Display the Game menu
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayMenu();
     


    }
    /**
    *	The startSavedGame method
    *	Purpose: creates game object and star
    * ts saved game
    *	Parameters: none
    *	Returns: none
    */
    // ===================================
    public void startSavedGame()
    {
        System.out.println("Start saved game option selected.");
    }
    
    
    /**
    *	The displaySaveGameView method
    *	Purpose: Displays save game view
    *	Parameters: none
    *	Returns: none
    */
    // ===================================
    public void displaySaveGameView()
    {
        System.out.println("Display save game view menu option selected.");
    }
}



