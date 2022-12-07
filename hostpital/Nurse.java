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
public class Nurse extends Employee {
    
     private String specialty;
       private int rank;

    public Nurse(String specialty, String address, String email, 
           String mobileNumber, double salary, String name, int ID
    , int rank ) {
        super(name, ID, address, email, mobileNumber, salary);
        this.specialty = specialty;
         this.rank=rank;
    }

    public Nurse() {
     
    }
    
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }


    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n"+"specialty=" + specialty + 
                 "\n" + " the rank of the nurse is " +rank ;
    }
    
    
     
}
