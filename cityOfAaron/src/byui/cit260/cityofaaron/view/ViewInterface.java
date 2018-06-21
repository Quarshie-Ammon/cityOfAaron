/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.view;

/**
 * The ViewInterface class - part of the view layer
 * Object of this class manages methods common to all menu view classes
 * aAuthor: Ammon Quarshie, Cameron Milstead, Raymond Mullins
 * Date last modified: June 21, 2018
 */
    public interface ViewInterface
    {
    public void displayMenu();
    public int getMenuOption(); 
    public void doAction(int option);
    }

