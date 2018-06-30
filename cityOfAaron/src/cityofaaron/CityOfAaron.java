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

    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        CityOfAaron.theGame = theGame;
    }
private static Game theGame;

    
    public static void main(String[] args) throws Exception {
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
     }
    
//    private static Game currentGame;
//    
//    public static Game getCurrentGame() {
//        return currentGame;
//}
//
//    public static void setCurrentGame(Game theGame) {
//        currentGame = theGame;
//    }

    
}
