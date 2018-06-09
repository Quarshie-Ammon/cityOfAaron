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



public class MainMenuView 
{
    Scanner keyboard = new Scanner(System.in);
    private String theMenu; 
    private int max;
    
    /**
    *	The displayMenuView method
    *	Purpose: displays the menu, gets the user's input, and does the
    *	selected action
    *	Parameters: none
    *	Returns: none
    */
    // =========================================================
    
    public void displayMenuView()
    {
        int menuOption;
        do
        {
        // Display the menu
        System.out.println(theMenu);
        
        // Prompt the user and get the user’s input
        menuOption = getMenuOption();
        
        // Perform the desired action
        doAction(menuOption);
        // Determine and display the next view
        } while (menuOption != max);
    }
    
    /**
*	The MainMenuView constructor
*	Purpose: Initialize the menu data
*	Parameters: none
*	Returns: none
*/
// ===================================
public MainMenuView()
{
    theMenu = "\n" +
        "**********************************\n" +
        "* CITY OF AARON: MAIN GAME MENU  *\n" +
        "**********************************\n\n" +
        "	1 - Start new game\n" +
        "	2 - Get and start a saved game\n" + 
        "        3 - Get help on playing the game\n" + 
        "        4 - Save game\n" +
        "	5 - Quit\n";
    max = 5;
}

/**
*	The getMenuOption method
*	Purpose: gets the user's input
*	Parameters: none
*	Returns: integer - the option selected
*/
// ===================================
    public int getMenuOption()
    {
        // declare a variable to hold user’s input
        int userInput;
        // begin loop
        do
        {
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            // if it is not a valid value, output an error message
            if (userInput < 1 || userInput > max)
            {
            System.out.println("Option must be between 1 and " + max);
            }

            // loop back to the top if input was not valid
            } while (userInput < 1 || userInput > max);

            // return the value input by the user return userInput;
            return userInput;
       }
    
    /**
    *   The doAction method
    *	Purpose: performs the selected action
    *	Parameters: none
    *	Returns: none
    */
    // ===================================
    public void doAction(int option)
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
                displayHelpMenuView(); 
                break;
            case 4: // save game 
                displaySaveGameView(); 
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
 
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
        // Display the Game menu    }
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
    *	The displayHelpMenuView method
    *	Purpose: Displays Help menu
    *	Parameters: none
    *	Returns: none
    */
    // ===================================
    public void displayHelpMenuView()
    {
        System.out.println("Display help menu option selected.");
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



