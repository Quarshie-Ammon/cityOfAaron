/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.view;

import byui.cit260.cityofaaron.model.CropData;
//import byui.cit260.cityofaaron.model.Game;
//import byui.cit260.cityofaaron.model.Player;
import java.io.Serializable;
import java.util.Scanner;
//import java.util.Scanner;

/**
 *
 * @author Saturn
 */
public class ListMenuView extends MenuView implements Serializable{
    Scanner keyboard = new Scanner(System.in);
    private String theMenu; 
    private int max;
/**
 * The ListMenuView constructor
 * Purpose: Initialise the list menu data
 * Parameters: none
 * Returns: none
 */    
 // =====================================
    public ListMenuView(){
        
        super( "\n" +
              "************************************\n" +
              "*     CITY OF AARON: LIST MENU     *\n" +
              "************************************\n" +
              " 1 - List or view the animals in the storehouse\n" +
              " 2 - List or view the tools in the storehouse\n" +
              " 3 - List or view the provisions in the storehouse\n" +
              " 4 - List or view the authors of this game\n" +
              " 5 - Back to Main Menu\n",
        5);
    }
    
    /**
     * The doAction method
     * Purpose: performs the selected action
     * Parameters: none
     * Returns: none
     * @param option
     */
    // =====================================
    @Override public void doAction(int option){
        switch (option){
            case 1: //list of animals in store house
                viewAnimals();
                break;
            case 2: //list of tools in storehouse
                viewTools();
                break;
            case 3: //list of provisions in storehouse
                viewProvisions();
                break;
            case 4: //list of game authors
                viewAuthors();
                break;
            case 5: //back to Main Menu
                   
        }    
    }
    
    /**
     * The viewAnimals method
     * Purpose: Displays a list of animals in the storehouse
     * Parameters: none
     * Returns: none
     */
    // =====================================================
    public void viewAnimals(){
        System.out.println("Display a list of animals in storehouse");
    }
    
   /**
     * The viewAnimals method
     * Purpose: Displays a list of animals in the storehouse
     * Parameters: none
     * Returns: none
     */
    // =====================================================
    public void viewTools(){
        System.out.println("Display a list of tools in storehouse");
    }
    
    /**
     * The viewAnimals method
     * Purpose: Displays a list of animals in the storehouse
     * Parameters: none
     * Returns: none
     */
    // =====================================================
    public void viewProvisions(){
        System.out.println("Display a list of provisions in storehouse");
    }
    
    /**
     * The viewAuthors method
     * Purpose: Displays a list of animals in the storehouse
     * Parameters: none
     * Returns: none
     */
    // =====================================================
    public void viewAuthors(){
        System.out.println("Display a list of authors of the game.");
    }
}
