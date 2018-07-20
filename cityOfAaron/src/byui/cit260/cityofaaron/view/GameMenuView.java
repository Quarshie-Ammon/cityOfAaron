/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.view;
import byui.cit260.cityofaaron.model.CropData;
import byui.cit260.cityofaaron.model.Game;
import byui.cit260.cityofaaron.model.Map;
import byui.cit260.cityofaaron.control.GameControl;
import byui.cit260.cityofaaron.model.*;
import cityofaaron.CityOfAaron;


import java.io.Serializable;
//import java.util.Scanner;

/**
 *
 * @author silver
 */
public class GameMenuView extends MenuView implements Serializable{

    private static CropData theCrops;
    
    public GameMenuView() {

        
       
  
        super( "\n" +
            "**********************************\n" +
            "*    CITY OF AARON: GAME MENU    *\n" +
            "**********************************\n" +
            " 1 - View the Map\n" +
            " 2 - View/Print a List\n" +
            " 3 - Move to a new location\n" +
            " 4 - Manage the Crops\n" +
            " 5 - Return to the Main Menu\n",
        5);



    }

      
    @Override public void doAction(int option)
    {
        //CropData theCrops = new CropData();
        switch(option) {
            case 1: // display map of the game
                displayMap();
                break;
            case 2: // view or print a list
                viewList();
                break;
            case 3: // move to a new location
                moveToNewLocation();
                break;
            case 4: // Manage the Crops
//                manageCrops();
                //CoprView buyLandView only here for testing.
                // CropView.buyLandView();
                manageCrops();
                break;
            case 5: // back to main menu
              
        }
 

    
    }
 
    public void displayMap()
    {
//    System.out.println("\n"
//                + "          >>>The City Map<<<     \n\n"
//                + "       0     1     2     3     4   \n"
//                + "  0 | ^^^ | === | !!! | ### | ~~~ |\n"
//                + "  1 | $$$ | !!! | ### | ### | ~~~ |\n"
//                + "  2 | !!! | !!! | ### | ### | ~~~ |\n"
//                + "  3 | !!! | !!! | ### | ### | ~~~ |\n"
//                + "  4 | !!! | !!! | ### | ### | ~~~ |\n"
//                + "  \n Map Key:\n"
//                + "  ^^^ - Village\n"
//                + "  !!! - Farmland\n"
//                + "  ~~~ - River\n"
//                + "  === - Granary and Storehouse\n"
//                + "  $$$ - Rulers Court\n"
//                + "  ### - Undeveloped Land");
//        Game theGame = CityOfAaron.getTheGame();     
//        Map theMap = theGame.getTheMap();
//        System.out.println(theMap);
      GameControl theGameControl = new GameControl();
      theGameControl.displayMap();
       

        
    }
  
    public void viewList()
    {
                /**
        *The viewList() method
        *	Purpose: Creates a ViewList object and calls its
        *	displayMenuView ( ) method
        *	Parameters: none
        *	Returns: none
        */

      // Print test output    
//    System.out.println("viewprintList() ");    
//     //Display the Game menu
//        GameMenuView gameMenu = new GameMenuView();
//        gameMenu.displayMenu();
      ListMenuView lv = new ListMenuView();
      lv.displayMenu();
 
     

    }
   
    public void moveToNewLocation()
    {
        int rowPosition, colPosition;
        String locationDescription = "";
        
        Game game = CityOfAaron.getTheGame();
        
        System.out.println("Enter the coordinates of the location you want to move to.\n");
        
        System.out.println("Enter the x-coordinate:");
        
        rowPosition = getValidInt();
        
        System.out.println("Enter the y-coordinate:");
        
        colPosition = getValidInt();
        
        // update row and column position
        GameControl theGameControl = new GameControl();
        theGameControl.setPlayerLocation(rowPosition, colPosition);
        
        //display string the descibes location        
        locationDescription = game.getTheMap().getLocation(rowPosition-1, colPosition-1).getDescription();
        
        System.out.println("\n"+locationDescription);
        
        
    }
  
    public void manageCrops()
    {
      // Print test output    
    System.out.println("manageCrops() ");    
     //Display the Game menu
    CropView cv = new CropView();
    cv.displayMenu();
     
  
    }
    
    public int getValidInt()
    {
        int inputInt = 0;
        do
        {
            inputInt = keyboard.nextInt();
            if(inputInt < 1 || inputInt > 5)
            {
               System.out.println("\nInvalid entry. Value must be between 1 and 5. Try again"); 
            }
        }while(inputInt < 1 || inputInt > 5);
        
        return inputInt;
    
    }

    

}
   
    

