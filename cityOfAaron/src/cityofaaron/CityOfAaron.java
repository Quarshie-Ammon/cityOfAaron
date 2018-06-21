/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import byui.cit260.cityofaaron.model.Location;
import byui.cit260.cityofaaron.model.Player;
import byui.cit260.cityofaaron.model.TeamMember;
import byui.cit260.cityofaaron.model.CropData;
import byui.cit260.cityofaaron.control.TestInventory;
import byui.cit260.cityofaaron.view.MainMenuView;
import byui.cit260.cityofaaron.view.CropView;
import byui.cit260.cityofaaron.model.Game;

/**
 *
 * @author Saturn
 */
public class CityOfAaron {

    // variable for keeping a reference to the Game object 
    private static Game theGame = null;
    
    public static void main(String[] args) throws Exception {
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
     }
    
    private static Game currentGame = null;
    
    public static Game getCurrentGame() {
        return currentGame;
}

    public static void setCurrentGame(Game theGame) {
        currentGame = theGame;
    }
    
}
