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
public class Employee extends Hostpital {
        private String address ;
    private String email ; 
    private String mobileNumber;
    private double salary ;


    public Employee(String name,int ID) {
       super(name,ID);
    }

    Employee(String name, int ID, String address, String email, String mobileNumber, double salary) {
        super(name, ID);
        this.address = address;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
    }

    public Employee(){
        
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n"+"address = " + address +
                "\n" +"email = " + email + 
                "\n"+ "mobileNumber = " + mobileNumber + 
                "\n"+ "salary = " + salary ;
    }
    
    
    
}
