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
public class Administration extends Employee {
       private String position;

    public Administration( String name, int ID ,String position, String address, String email,
            String mobileNumber, double salary) {
        super(name, ID, address, email, mobileNumber, salary);
        this.position = position;
    }

    public Administration() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +"position= " + position ;
    }
    
    
    
}
