/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostpital;

import java.util.ArrayList;

/**
 *
 * @author munirhkhaled
 */
public class Patient extends Hostpital implements PatientInterface {
    
    private String address ;
    private String email ; 
    private String mobileNumber; 
    private char typeAorB;
       ArrayList<Services> listOfServices;

    public Patient(String address, String email, String mobileNumber, char typeAorB, String name, int ID, ArrayList<Services> listOfServices) {
        super(name, ID);
        this.address = address;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.typeAorB = typeAorB;
        
        //in this case we need to create a new object in the main
        
        // or i'm not sure .. here we dont need to create a new obj create in the main
             this.listOfServices = listOfServices;
        
        newPrice_Based_On_typeAorB( listOfServices);
    }
    

    public Patient() {
     super();
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

    public char getTypeAorB() {
        return typeAorB;
    }

    public void setTypeAorB(char typeAorB) {
        this.typeAorB = typeAorB;
    }

    public ArrayList<Services> getListOfServices() {
        return listOfServices;
    }

    public void setListOfServices(ArrayList<Services> listOfServices) {
        this.listOfServices = listOfServices;
    }

    
    public String printTheList (ArrayList<Services> listOfServices){
        // the date yype ListOfServies is diffrent form listOfServices
   String ListOfServies = " ";
   for (Services s  :listOfServices){
    ListOfServies += s.toString();
    ListOfServies += "\n";
   }
   return ListOfServies;
    }
    
    

    public String toString() {
        return "\n"+ "*********** ALL INFO ABOUT THE PATIENT ***********"+
               "\n"+ super.toString() + "\n"+ "address=" + address + 
                "\n"+ "email=" + email + 
                "\n"+ "mobileNumber=" + mobileNumber +
                "\n"+ "typeAorB=" + typeAorB +
       "\n"+ "*********** list of services ***********"+
            "\n"+printTheList(listOfServices)
                ;
    }
    
    
    
  //all methods form me 
     public void newPrice_Based_On_typeAorB(ArrayList<Services> listOfServices){
      
          double newPrice=0;
          
       
      for (Services s  :listOfServices){
     if (typeAorB == 'A' || typeAorB == 'a'){
      newPrice = s.getPrice() - ( s.getPrice()*0.25);
      s.setPrice(newPrice);}
      
      if (typeAorB == 'B' || typeAorB == 'b'  ){
         newPrice = s.getPrice();
      s.setPrice(newPrice);}
        
             }
      if (typeAorB != 'A' && typeAorB != 'a' && typeAorB != 'B' && typeAorB !='b' )
      {System.out.println("invaild selection ");}
     }
    
    /*public void addServices(ArrayList<Services> listOfServices){
        for(Services i:listOfServices){
         double p= i.getPrice();
          
        }*/
    }
    

