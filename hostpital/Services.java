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
public class Services extends Hostpital {
    
    private double price;
    private Dector DectorHowProvdeServices;

    // here will come the name and the id and the price of the service 
    public Services(double price, String name, int ID , Dector DectorHowProvdeServices) {
        super(name, ID);
        this.price = price;
        this.DectorHowProvdeServices= DectorHowProvdeServices;
    }

   
   
    public Dector getDectorHowProvdeServices() {
        return DectorHowProvdeServices;
    }

    public void setDectorHowProvdeServices(Dector DectorHowProvdeServices) {
        this.DectorHowProvdeServices = DectorHowProvdeServices;
    }

    
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "info about the services"+ "\n"+
                super.toString() +  "\n"+" the price of the servies = " + price  +
                    "\n"+ "*********** the decotor who provide the serives ***********"+
                "\n" + DectorHowProvdeServices;
    }
    
    
    
    
}
