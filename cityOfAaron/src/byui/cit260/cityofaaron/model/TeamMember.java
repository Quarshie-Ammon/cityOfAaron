/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofaaron.model;

/**
 *
 * @author Saturn
 */
public enum TeamMember {
    
    Ammon("Ammon", "Brother"),
    Cameron("Cameron", "Brother"),
    Ray("Ray", "Brother");

    private String name;
    private String title;

TeamMember(String name, String title){
    this.name = name;
    this.title = title;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TeamMember{" + "name=" + name + ", title=" + title + '}';
    }


}