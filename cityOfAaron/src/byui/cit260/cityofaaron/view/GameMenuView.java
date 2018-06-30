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
                viewprintList();
                break;
            case 3: // move to a new location
                moveLocation();
                break;
            case 4: // Manage the Crops
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
  
    public void viewprintList()
    {
      // Print test output    
    System.out.println("viewprintList() ");    
     //Display the Game menu
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayMenu();
     

    }
   
    public void moveLocation()
    {
      // Print test output    
    System.out.println("moveLocation() ");    
     //Display the Game menu
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayMenu();
     

        
        
        
    }
  
    public void manageCrops()
    {
      // Print test output    
    System.out.println("manageCrops() ");    
     //Display the Game menu
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayMenu();
     
  
    }
    
}
