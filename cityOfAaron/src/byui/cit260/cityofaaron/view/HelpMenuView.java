/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.view;

import java.util.Scanner; 

public class HelpMenuView {
    Scanner keyboard = new Scanner(System.in);
    private String theMenu; 
    private int max;
    
   // MainMenuView mmv = new MainMenuView();
 
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
public HelpMenuView()
{
    theMenu = "\n" +
        "**********************************\n" +
        "* CITY OF AARON: HELP MENU  *\n" +
        "**********************************\n\n" +
        "	1 - View goals\n" +
        "	2 - View map help\n" + 
        "        3 - View move help\n" + 
        "        4 - View List Help\n" +
        "	5 - Main menu\n";
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
                viewGoals();
                break;
            case 2: // get and start a saved game
                viewMapHelp();
                break;
            case 3: // get help menu 
              viewMoveHelp();
                break;
            case 4: // save game 
              viewListHelp();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
 
        }
    }   
    
    /**
    *	The viewGoals method
    *	Purpose: Displays goals in game
    *	Parameters: none
    *	Returns: none
    */
    // ===================================
    public void viewGoals()
    {
        System.out.println("Display view goals option selected.");
    }
    
    /**
    *	The viewMapHelp method
    *	Purpose: Displays goals help
    *	Parameters: none
    *	Returns: none
    */
    // ===================================
    
    public void viewMapHelp()
    {
        System.out.println("Display view map help option selected.");
    }
    
    /**
    *	The viewMoveHelp method
    *	Purpose: Displays move help
    *	Parameters: none
    *	Returns: none
    */
    // ===================================
    
    public void viewMoveHelp()
    {
        System.out.println("Display view move help option selected.");
    }
    
    /**
    *	The viewListHelp method
    *	Purpose: Displays move help
    *	Parameters: none
    *	Returns: none
    */
    // ===================================
    
    public void viewListHelp()
    {
        System.out.println("Display view list help option selected.");
    }
    
}
