/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.view;

import java.util.Scanner;

    public class ListView extends MenuView{
        Scanner keyboard = new Scanner(System.in);
        private String theMenu; 
        private int max;
        
        public ListView () {
            super("\n" +
            "**********************************\n" +
            "* CITY OF AARON:	LIST MENU	*\n" +
            "**********************************\n" + 
            " 1 - View the development team\n" +
            " 2 - View a list of animals\n" +
            " 3 - View a list of tools\n" +
            " 4 - View a list of provisions\n" + 
            " 5 - Return to the game menu\n",
            5);
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
                listTeam();
                break;
            case 2: // View Whereis Viry of Aaron
                listAnimals();
                break;
            case 3: // View Map Help
                listTools();
                break;
            case 4: // View move help
              listProvisions();
                break;
            case 5: //exit back main menu
            
 
        }        
    }
    
    public void listTeam()
    {
        System.out.println("List team option selected.");
    }
    
    public void listAnimals()
    {
        System.out.println("List Animals option selected.");
    }
    
    public void listTools()
    {
        System.out.println("List tools option selected.");
    }
    
    public void listProvisions()
    {
        System.out.println("List Provisions option selected.");
    }
    
    }
