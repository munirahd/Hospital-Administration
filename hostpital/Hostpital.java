/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostpital;

/**
 *
 * @author munirhkhaled
 */
public class Hostpital {
 
  private String name ;
  private int ID ;

    public Hostpital(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public Hostpital() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "{" + "name = " + name + ", ID = " + ID + "}" ;
    }
    
    
    
    
}
