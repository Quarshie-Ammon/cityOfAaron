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
    import java.io.*;
    import exceptions.CropException;


public class CropView extends MenuView implements Serializable {
    protected final static Scanner keyboard = new Scanner(System.in);
    private String theMenu; 
    private int max;
    
    // Get references to the Game object and the CropData object 
    private static Game theGame = CityOfAaron.getTheGame(); 
    private static CropData cropData = theGame.getCrop();
    
    /**
*	The MainMenuView constructor
*	Purpose: Initialize the menu data
*	Parameters: none
*	Returns: none
*/
// ===================================
public CropView()
{
    super("\n" +
        "**********************************\n" +
        "* CITY OF AARON: Crop Control  *\n" +
        "**********************************\n\n" +
        "	1 - Buy Land\n" +
        "        2 - Sell Land\n" +
        "	3 - Pay offerings\n" + 
        "        4 - Feed People\n" + 
        "        5 - Plant crops\n" +
        "	6 - Show number of people starved\n"+
        "        7 - Run crops view\n"+
        "        8 - Display Crop Report\n"+
        "        9 - Return\n",
    9);
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
                buyLandView();
                break;
            case 2: // View Whereis Viry of Aaron
                sellLandView();
                break;
            case 3: // View Map Help
                payOfferingsView();
                break;
            case 4: // View move help
              feedPeopleView();
                break;
            case 5: // View lists help
              plantCropsView();  
                break;
             case 6: 
              showStarvedView();  
                break;
             case 7: 
              runCropsView();  
                break;
             case 8: 
              displayCropReport();  
                break;             
             case 9: //exit back main menu
            
 
        }
    }  
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
//        System.out.print("How many acres of land do you wish to buy? ");

        int toBuy;
        boolean paramsNotOkay;
        do
        {
            paramsNotOkay = false;
            System.out.print("\nHow many acres of land do you wish to buy? ");
            toBuy = keyboard.nextInt();
            try
             {
                CropControl.buyLand(toBuy, price, cropData);    
                }
                catch(CropException e)
                   {
                     System.out.println("I am sorry master, I cannot do this.");
                     System.out.println(e.getMessage()); 
                     paramsNotOkay = true;
                   }	
        } while(paramsNotOkay);

        
        // Get the user’s input and save it. 
//        int toBuy;
//        toBuy = keyboard.nextInt();
        
        // Call the buyLand( ) method in the control layer to buy the land
//        CropControl.buyLand(toBuy, price, cropData);
    }
    
      /**
    *	The sell LandView method
    *	Purpose: interface with the user input for selling land
    *	Parameters: none
    *	Returns: none
    */
    public static void sellLandView(){
        System.out.print("sellLAndView method /n");
    }
    
    /**
    *	The pay offerings method
    *	Purpose: interface with the user to pay offerings
    *	Parameters: none
    *	Returns: none
    */
        public static void payOfferingsView(){
        System.out.print("payOfferingsView method /n");
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
        //System.out.print("How many bushels of grain do you want to give to the people? ");
        
        // Get the user’s input and save it. 
        int wheatForPeople;
                        
        boolean paramsNotOkay;
        do
        {
            paramsNotOkay = false;
            System.out.print("\nHow many bushels of grain do you want to give to the people? ");
            wheatForPeople = keyboard.nextInt();
            try
             {
                CropControl.feedPeople(wheatForPeople, cropData);    
                }
                catch(CropException e)
                   {
                     System.out.println("I am sorry master, I cannot do this.");
                     System.out.println(e.getMessage()); 
                     paramsNotOkay = true;
                   }	
        } while(paramsNotOkay);
        //wheatForPeople = keyboard.nextInt();
        
        // Call the feedPeople( ) method in the control layer to set aside wheat
//        int wheatSetAside;
//        int wheatSetAside = CropControl.feedPeople(wheatForPeople, cropData);
        System.out.print("Wheat set aside to feed the people: " + wheatForPeople + "\n");
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
//        System.out.println("How many acres of land would you like to plant with wheat?");
        
        //Get the user's input and save it
        int acresPlanted;
        boolean paramsNotOkay;
        do
        {
            paramsNotOkay = false;
            System.out.print("\nHow many bushels of grain do you want to give to the people? ");
            acresPlanted = keyboard.nextInt();
            try
             {
                CropControl.plantCrops(acresPlanted, cropData);    
                }
                catch(CropException e)
                   {
                     System.out.println("I am sorry master, I cannot do this.");
                     System.out.println(e.getMessage()); 
                     paramsNotOkay = true;
                   }	
        } while(paramsNotOkay);
        
//        acresPlanted = keyboard.nextInt();
        
        //Call the plantCrops() method in the control layer to set aside land for planting
//        int acresReserved = CropControl.plantCrops(acresPlanted, cropData);
        System.out.print("Acres of land to be planted: " + acresPlanted + "\n");    
    }
  
       /**
    *	The showStarvedView method
    *	Purpose: to show number of starved report
    *	Parameters: none
    *	Returns: none
    */
    public static void showStarvedView(){
        System.out.print("showStarvedView method /n");
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
    
        /**
    *	The sell LandView method
    *	Purpose: interface with the user input for selling land
    *	Parameters: none
    *	Returns: none
    */
    public static void displayCropReport(){
        System.out.print("displayCropReport method /n");
    }


}
