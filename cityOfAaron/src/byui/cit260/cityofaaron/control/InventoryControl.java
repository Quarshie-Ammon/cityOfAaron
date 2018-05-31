/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.control;
import byui.cit260.cityofaaron.model.*;
import static byui.cit260.cityofaaron.model.CropData.calcLandCost;
 import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Saturn
 */
public class InventoryControl {
    
    public static void buyLand(int landPrice, int acresToBuy, CropData cropData){
        CropData cropData1 = new CropData();
        int landPrice = cropData1.calcLandCost;
        System.out.println("How many acres of new land do you want to buy?");
        
        Scanner keyboard = new Scanner(System.in);
        acresToBuy = keyboard.nextInt();
        
        if(acresToBuy < 1){
            System.out.println("How many acres of new land do you want to buy?");
            acresToBuy = keyboard.nextInt();
        }
        
        
        int wheatInStore = cropData1.getWheatInStore();
        if((wheatInStore < (acresToBuy * landPrice)) || (wheatInStore < 0)){
            System.out.println("Not enough wheat!");
            System.out.println("How many acres of new land do you want to buy?");
        }
    }
    
}
