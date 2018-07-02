/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.model;
import java.io.Serializable;

/**
 *
 * @author silver
 */
public class ListItem implements Serializable {
    private String name;
    private int number;
    
    public ListItem(String name, int number){
       this.name = name;
       this.number = number;
    }

    public ListItem(String ammon_Quarshie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
