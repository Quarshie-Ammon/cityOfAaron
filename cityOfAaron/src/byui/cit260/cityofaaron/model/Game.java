/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Saturn
 */
public class Game implements Serializable{
    
    private String thePlayer;
    private Player player;
    private Map theMap;
    private CropData cropData;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;


    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
    public Game() {
    }

    public String getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(String thePlayer) {
        this.thePlayer = thePlayer;
    }
    
    /**
*	the getCrops() method
*	Purpose: get a reference to the crop object
*	Parameters: none
*	Returns: a reference to a crop object
*/
public CropData getCrop()
{
return cropData;
}

/**
*	the setCrops() method
*	Purpose: store a reference to a crop object
*	Parameters: a reference to a crop object
*	Returns: none
*/
public void setCrop(CropData cropRef)
{
cropData = cropRef;
}


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.thePlayer);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "thePlayer=" + thePlayer + ", player=" + player + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        return true;
    }

    public void setCropData(CropData theCrops) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMap(Map theMap) {
        this.theMap = theMap;
    }
    
    public Map getTheMap() {
        return theMap;
    } 
    
    public void setAnimals(ArrayList<ListItem> animals) {
    	
    	this.animals = animals;
    	
    }
    
    public ArrayList<ListItem> getAnimals() {
    	
    	return animals;
    	
}
    
    public void setTools(ArrayList<ListItem> tools) {
    	
    	this.tools = tools;
    	
    }
    
    public ArrayList<ListItem> getTools() {
    	
    	return tools;
    	
}
    
    
}


