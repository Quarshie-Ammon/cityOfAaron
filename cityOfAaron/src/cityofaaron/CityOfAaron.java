/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import byui.cit260.cityofaaron.model.Player;
import byui.cit260.cityofaaron.model.TeamMember;

/**
 *
 * @author Saturn
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Aaron");
        
        String playerOneName = playerOne.getName();
        
        System.out.println("Player Name = " + playerOneName );
        
        String teamMemberName = TeamMember.Ammon.getName();
        
        System.out.println("Team Member = " + teamMemberName);
    }
    
}
