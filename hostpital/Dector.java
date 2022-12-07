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
public class Dector extends Employee {
       private String specialty;
       private int rank;
       private Nurse specialNurse;

    public Dector(String specialty, Nurse specialNurse, String address, 
            String email, String mobileNumber, double salary, String name, int ID
    ,int rank ) {
        super( name, ID, address, email, mobileNumber, salary);
        this.specialty = specialty;
        this.specialNurse = specialNurse;
        this.rank=rank;
    }

   

   public Dector(){
       
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

    public Nurse getSpecialNurse() {
        return specialNurse;
    }

    public void setSpecialNurse(Nurse specialNurse) {
        this.specialNurse = specialNurse;
    }

    @Override
    public String toString() {
        return super.toString() 
                + 
                "\n"+"specialty = " + specialty + 
                 "\n" + "the rank of the dector is = " +rank +
                  "\n"+ "*********** the info about the special nurse ***********"+
                "\n" +"the info about the special Nurse =" + specialNurse 
                +"\n"
                ;
    }

 
    
    
       
    
}
