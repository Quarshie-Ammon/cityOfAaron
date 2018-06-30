/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.view;

    import byui.cit260.cityofaaron.model.*; 
    import byui.cit260.cityofaaron.control.*;
    import java.util.Scanner;
    import cityofaaron.CityOfAaron;

public class CropView {
    // Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);
    
    // Get references to the Game object and the CropData object 
    private static Game theGame = CityOfAaron.getTheGame(); 
    private static CropData cropData = theGame.getCrop();
    
    /**
    *	The buyLandView method
    *	Purpose: interface with the user input for buying land
    *	Parameters: none
    *	Returns: none
    */
    public static void buyLandView()
    {
        // Get the cost of land for this round. 
        int price = CropControl.calcLandCost();
        
        // Prompt the user to enter the number of acres to buy 
        System.out.format("Land is selling for %d bushels per acre.%n",price); 
        System.out.print("How many acres of land do you wish to buy? ");
        
        // Get the user’s input and save it. 
        int toBuy;
        toBuy = keyboard.nextInt();
        
        // Call the buyLand( ) method in the control layer to buy the land
        CropControl.buyLand(toBuy, price, cropData);
    }
    
    /**
    *	The feedPeopleView method
    *	Purpose: interface with the user input for feeding people
    *	Parameters: none
    *	Returns: none
    */
    public static void feedPeopleView()
    {
        
        // Prompt the user to enter the number of bushels to set aside  
        System.out.print("How many bushels of grain do you want to give to the people? ");
        
        // Get the user’s input and save it. 
        int wheatForPeople;
        wheatForPeople = keyboard.nextInt();
        
        // Call the feedPeople( ) method in the control layer to set aside wheat
        int wheatSetAside;
        wheatSetAside = CropControl.feedPeople(wheatForPeople, cropData);
        System.out.print("Wheat set aside to feed the people: " + wheatSetAside);
    }
    
    
    /**
    *	The runCropsView method()
    *	Purpose: runs the Hamurabi game
    *	Parameters: none
    *	Returns: none
    */
    
    public static void plantCropsView()
    {
       //Prompt the user to enter the number of acres of land to plant with wheat
        System.out.println("How many acres of land would you like to plant with wheat?");
        
        //Get the user's input and save it
        int acresPlanted;
        acresPlanted = keyboard.nextInt();
        
        //Call the plantCrops() method in the control layer to set aside land for planting
        int acresReserved = CropControl.plantCrops(acresPlanted, cropData);
        System.out.print("Acres of land to be planted: " + acresReserved);    
    }
    
    public static void runCropsView()
    {
    // call the buyLandView( ) method 
    buyLandView();
    feedPeopleView();
    plantCropsView();
    
    // add calls to the other crop view methods
    // as they are written
    }



}
