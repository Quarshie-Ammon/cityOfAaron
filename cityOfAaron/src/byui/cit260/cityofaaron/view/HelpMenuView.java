/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.view;

import java.util.Scanner; 

public class HelpMenuView extends MenuView {
    Scanner keyboard = new Scanner(System.in);
    private String theMenu; 
    private int max;
    
  
/**
*	The MainMenuView constructor
*	Purpose: Initialize the menu data
*	Parameters: none
*	Returns: none
*/
// ===================================
public HelpMenuView()
{
    super("\n" +
        "**********************************\n" +
        "* CITY OF AARON: HELP MENU  *\n" +
        "**********************************\n\n" +
        "	1 - What are the goals of the game?\n" +
        "        2 - Where is the city of Aaron?\n" +
        "	3 - How do I view the map?\n" + 
        "        4 - How do I move to another location?\n" + 
        "        5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
        "	6 - Back to the Main Menu.\n",
    6);
}


    
    /**
    *   The doAction method
    *	Purpose: performs the selected action
    *	Parameters: none
    *	Returns: none
    */
    // ===================================
    @Override public void doAction(int option)
    {
        switch (option)
        {
            case 1: // View goals of game
                viewGoals();
                break;
            case 2: // View Whereis Viry of Aaron
                viewWhereIs();
                break;
            case 3: // View Map Help
                viewMapHelp();
                break;
            case 4: // View move help
              viewMoveHelp();
                break;
            case 5: // View lists help
              viewListHelp();
                break;
            case 6: //exit back main menu
            
 
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
    *	The viewGoals method
    *	Purpose: Displays goals in game
    *	Parameters: none
    *	Returns: none
    */
    // ===================================
    public void viewWhereIs()
    {
        System.out.println("Display view where is City of Aaron option selected.");
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
