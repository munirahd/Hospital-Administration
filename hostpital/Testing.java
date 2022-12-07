/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostpital;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author munirhkhaled
 */
public class Testing {
    
      public static void main(String[] args) throws IOException  {

        
     
        Scanner read= new Scanner (System.in); 
        /*  pleas paset the file path in your computer*/
         File file = new File("/Users/munirhkhaled/NetBeansProjects/Hostpital/admins/HeadOFHosybital.txt");
       ArrayList<Administration> staff = new ArrayList<>();
        ArrayList<Employee> list_of_Employee = new ArrayList<>();
       ArrayList<Patient> list_of_patient= new ArrayList<>();
       ArrayList<Services>list_of_services= new ArrayList<>();
//here is the excption if the object file dosen't exsit     
/* >>>>> */ try {
              Scanner readFile = new Scanner (file);
            }
    /* if the excption did happen 
    we will create new file insted 
   .. to be fullid form the user */
     /* >>>>> */catch (FileNotFoundException ex) {
           fullAdmins(staff);
           }

     

  
// now we will read form the user the name of the admin 
 int check = 0  ;
while (check != 1){
       // full collection of the Administration STAFF
     System.out.println("if you want to enter the number of admin that you wanna read form the file"
             + " PLEASE ENTER ONE 1 ");
      System.out.println("if you want to read the whole file"
              + " PLEASE ENTER TWO 2 ");
     int choies = read.nextInt();
     if (choies == 1 || choies == 2 ){
 read_file_AND_fill_List_admins(staff , file , choies ); 
 
  System.out.println("enter the name of the admin you want to serach for ");
  String name = read.next();
  System.out.println("enter the ID of the admin ");
  int ID = read.nextInt();

for (Administration a : staff ){
if (a.getName().equalsIgnoreCase(name)){
    check = 1 ;
System.out.print("admin is found ");
the_main_Selections(list_of_Employee,list_of_patient,list_of_services);
}
}
}
      
 if (choies < 1 || choies > 2 )  {System.out.println(" invaild choies  ");}   
}



    }
     
      
      
      
      
      
      
      
      
      
      
 
      
      
      
      // all methods to clean and minmize the main 
      
      //////////////////////////////////////////////////////////////////////////
      // 1 FIRST METHOD
      //////////////////////////////////////////////////////////////////////////
   
      
      
  public static void fullAdmins( ArrayList<Administration> staff)  throws IOException {
     
          Scanner read= new Scanner (System.in); 
         System.out.println("this file is ematy please full it manually ");
           
              File file = new File("Admins.txt");
           PrintWriter writeFile = new PrintWriter(file);
           
           System.out.println("enter the number of admnis you want  ");
           int numAdmins = read.nextInt();
           // the loop to be fulled with all the info to be needed 
           for (int i =1 ; i<=numAdmins ; i++){
                  System.out.println("enter the info for the " + i + " please  ");
                  
            System.out.println(" enter the name  ");
            String name = read.next();
           writeFile.print(name);
           
           System.out.println(" enter the ID  ");
            int ID = read.nextInt();
           writeFile.print(ID);
           
           System.out.println(" enter the postition like, CEO , CMO ...  ");
            String position = read.next();
           writeFile.print(position);
           
           System.out.println(" enter the address ..  ");
            String address = read.next();
           writeFile.print(address);
           
            System.out.println(" enter the Email ..  ");
            String email = read.next();
           writeFile.print(email);
           
            System.out.println(" enter the mobile number  ..  ");
            String mobileNumber = read.next();
           writeFile.print(mobileNumber);
           
            System.out.println(" enter the salary  ..  ");
            double salary = read.nextDouble();
           writeFile.print(salary);
           
             Administration newAdmin =  new  Administration( name, ID , position, 
          address, email,mobileNumber, salary) ;
  staff.add(newAdmin);
    }
          
         }
  
    //////////////////////////////////////////////////////////////////////////
      // 2 SECONED METHOD
      //////////////////////////////////////////////////////////////////////////
 
   public static ArrayList<Administration> 
        read_file_AND_fill_List_admins( ArrayList<Administration> staff , File file , int choies )  
                throws IOException {
   Scanner read= new Scanner (System.in);
   Scanner readFile= new Scanner (file);
   
    /*    imprtant note 
   the file has the data as shown :-
   name String
   ID intger 
   position String 
   address String 
   email String 
   mobile number String
   salary Double    */
    
    
if (choies == 1 ){
    
   System.out.println("pelase enter the number of admins you WANNA read form the file ");
    int numberAdmins = read.nextInt();
    
    if (numberAdmins > 3 ){ System.out.println("the number of admins is invaild "
            + " please enter number less than  3 " ) ;
           numberAdmins = read.nextInt()  ;}
    
    for (int i = 1 ; i <= numberAdmins ; i++){
       
   String name = readFile.nextLine();
   String ID0 = readFile.nextLine(); // here int
   String position = readFile.nextLine();
   String address = readFile.nextLine();
   String email = readFile.nextLine();
   String mobileNumber = readFile.nextLine(); 
   String salary0 = readFile.nextLine(); // here is double 
   
  int ID = Integer.parseInt(ID0);
  Double salary = Double.parseDouble(salary0);

  
  Administration newAdmin =  new  Administration( name, ID , position, 
          address, email,mobileNumber, salary) ;
  staff.add(newAdmin);
            }
            }
            
   if (choies == 2 ) {        
       
  while (readFile.hasNext()){
       String name = readFile.nextLine();
   String ID0 = readFile.nextLine(); // here int
   String position = readFile.nextLine();
   String address = readFile.nextLine();
   String email = readFile.nextLine();
   String mobileNumber = readFile.nextLine(); 
   String salary0 = readFile.nextLine(); // here is double 
   
  int ID = Integer.parseInt(ID0);
  Double salary = Double.parseDouble(salary0);
  
    
  Administration newAdmin =  new  Administration( name, ID , position, 
          address, email,mobileNumber, salary) ;
  staff.add(newAdmin);
    }
            }   
 
    if (choies != 1 && choies != 2 ){System.out.println("invaild choies !!");}

    System.out.println("the size of the staff list is  " + staff.size());
  
   return staff; }
  
        
       //////////////////////////////////////////////////////////////////////////
      // 3 THIRD METHOD
      //////////////////////////////////////////////////////////////////////////
   public static void the_main_Selections( ArrayList<Employee> list_of_Employee, ArrayList<Patient> list_of_patient,ArrayList<Services> list_of_Services  ){
          Scanner read= new Scanner (System.in);
           int Selection = 1 ;
          while (Selection != 4 && Selection < 4 && Selection > 0  ){
          
    System.out.println("\n"+"enter the number of opertion that you want to perform :- "
            + "\n " + "1. Staff selection screen "
     + "\n " + "2. Patient selection screen "
            + "\n " +"3. Service selection screen "
            + "\n"+"4. EXIT");
    Selection = read.nextInt();
    
    if (Selection == 1 ){staff_selection(list_of_Employee,list_of_patient,list_of_Services);}
    if (Selection == 2 ){patient_selection(list_of_Employee,list_of_patient,list_of_Services );}
    if (Selection == 3 ){service_selection(list_of_Employee,list_of_patient,list_of_Services);}   
          }
   if(Selection==4){System.out.println("Exit ");}
   if (Selection > 4 || Selection < 0 ){ System.out.println("the Selection you enterd is not found  ");}
   }     
   
   
   //////////////////////////////////////////////////////////////////////////
      // 4 METHOD if user enter the staff selection Screen
      //////////////////////////////////////////////////////////////////////////
   public static void staff_selection(ArrayList<Employee> list_of_Employee, ArrayList<Patient> list_of_patient,ArrayList<Services> list_of_Services ){
       Scanner read= new Scanner (System.in);
      int Selection = 0 ;
       int a1 = 0;
       int a2 = 0;
      while (Selection<1 || Selection>3){
    System.out.println("\n"+"select one of the following  :- "
            + "\n " + "1. Add employee  "
     + "\n " + "2. print emplyee info "
            + "\n"+"3. EXIT");
    Selection = read.nextInt();}
      
      // case statement in case the user want to add employy
   if (Selection == 1){
        System.out.println("\n"+"select one of the following  :- "
            + "\n " + "1. Add DECTOR  "
     + "\n " + "2. Add NURSE "
            + "\n"+"3. Add ADMIN");
            int option_of_employee = read.nextInt();
            
        System.out.println("enter the number of emplyee you want .. " );
        int number_of_Employee = read.nextInt();
        
         for (int i =0 ; i<number_of_Employee ; i++){
           a1++;
                  System.out.println("enter the info for the " + a1 + " employee please  ");
                  
            System.out.println(" enter the name  ");
            String name = read.next();
         
           System.out.println(" enter the ID  ");
            int ID = read.nextInt();
        
           System.out.println(" enter the address ..  ");
            String address = read.next();
           
            System.out.println(" enter the Email ..  ");
            String email = read.next();
           
            System.out.println(" enter the mobile number  ..  ");
            String mobileNumber = read.next();
           
            System.out.println(" enter the salary  ..  ");
            double salary = read.nextDouble();

          Employee  newEmployee;

          // if the user chios dector do the follwing 
        if (option_of_employee == 1){
            System.out.println(" enter specialty of the decotor  ..  ");
            String specialty = read.next();
               System.out.println(" enter the RANK of the decotor  ..  ");
            int rank = read.nextInt();
            
            // now we will fill the nurse object 
            System.out.println(" now you will enter the info about the special nurse"
                    + "\n"+"that will work whit the decoter ");
              System.out.println(" enter the NAME of the special Nurse ..  ");
                 String nameN = read.next();
                 
                  System.out.println(" enter her / his the ID  ");
            int ID_N = read.nextInt();
            
             System.out.println(" enter her / his the address ..  ");
            String addressN  = read.next();
            
             System.out.println(" enter her / his the Email ..  ");
            String emailN = read.next();
            
             System.out.println(" enter her / his the mobile number  ..  ");
            String mobileNumberN = read.next();
            
            System.out.println(" enter her / his the salary  ..  ");
            double salaryN = read.nextDouble();
           
            System.out.println(" enter her / his specialty ..  ");
            String specialtyN = read.next();
            
               System.out.println(" enter her / his RANK  ..  ");
            int rankN = read.nextInt();
            
            Nurse specialNurse =  new Nurse(specialtyN , addressN , emailN ,
            mobileNumberN , salaryN , nameN , ID_N , rankN );
            
            // now create the dector object 
           newEmployee   =  new Dector (specialty,specialNurse, address , email ,  
          mobileNumber , salary , name , ID ,rank ) ; 
        list_of_Employee.add(newEmployee);
        }
           
           // if the user chios NURSE do the follwing 
           if (option_of_employee == 2 ){
            System.out.println(" enter her / his specialty ..  ");
            String specialtyNURSE = read.next();
            
               System.out.println(" enter her / his RANK  ..  ");
            int rankNURSE = read.nextInt();
            
             newEmployee   =  new Nurse (specialtyNURSE , address , email ,  
          mobileNumber , salary , name , ID ,rankNURSE ) ;
              list_of_Employee.add(newEmployee);
           }
           
             // if the user chios ADMIN do the follwing 
            if (option_of_employee == 3 ){
             System.out.println(" enter the admin postioin  ..  ");
            String position = read.next();
            newEmployee   = new Administration ( name, ID , position, 
          address, email,mobileNumber, salary ) ;
             list_of_Employee.add(newEmployee);
            } 
            
            if (option_of_employee != 1 && option_of_employee != 2 && option_of_employee != 3 )
            {System.out.println("INVAILD option ");}
        } //end of for loop
        } // end of if (selsction == 1 ) when the user want to add any kinf of employee
        
       // case statement in case the user want to print employy information 
   if (Selection == 2){
          System.out.println("\n"+"select one of the following  :- "
            + "\n " + "1. PRINT DECTORS  "
     + "\n " + "2. PRINT NURSES "
            + "\n"+"3. PRINT ADMINS ");
            int option_of_employee = read.nextInt();
            
for (int i=0; i<list_of_Employee.size() ; i++){
  a2++; 
if (option_of_employee == 1 &&  list_of_Employee.get(i) instanceof Dector){ 
    Dector onlyOne = (Dector) list_of_Employee.get(i); 
      System.out.println("*********** "+a2+" dector ************ ");
System.out.println(onlyOne); 
System.out.println("********************************* ");} 
if (option_of_employee == 2 &&  list_of_Employee.get(i) instanceof Nurse){ 
      Nurse onlyOne = (Nurse) list_of_Employee.get(i); 
      System.out.println("***********  "+a2+" nurse ************ ");
System.out.println(onlyOne); 
System.out.println("********************************* ");}
if (option_of_employee == 3 &&  list_of_Employee.get(i) instanceof Administration){ 
      System.out.println("*********** "+a2+" amdin ************ ");
     Administration onlyOne = ( Administration) list_of_Employee.get(i); 
System.out.println(onlyOne);
  System.out.println("********************************* ");}
  if (option_of_employee != 1 && option_of_employee != 2 && option_of_employee != 3 )
            {System.out.println("INVAILD option ");}
   }
   }
   
       if (Selection == 3) {the_main_Selections(list_of_Employee,list_of_patient,list_of_Services);}
       
    } // end of the employee / staff selection form the main 
   
   
   
   
     //////////////////////////////////////////////////////////////////////////
      // 5 METHOD if user enter the patient selection Screen
   
      //////////////////////////////////////////////////////////////////////////
   public static void patient_selection(ArrayList<Employee> list_of_Employee, ArrayList<Patient> list_of_patient,ArrayList<Services> list_of_Services ){
     Scanner read= new Scanner (System.in);
     
      int selection = 0 ;
      int a1 = 0; 
      
     
      while (selection<1 || selection>4){
    System.out.println("\n"+"select one of the following  :- "
            + "\n " + "1. Add new patients  "
     + "\n " + "2. print patients info "
            +"\n"+"3.print the patient bill"
            + "\n"+"4. EXIT");
    selection = read.nextInt();}
   
   if(selection==1){   
   System.out.println("enter the number of the patient you want .. " );
        int number_of_patient = read.nextInt();
        int number_of_services;
        
         for (int i = 0 ; i<number_of_patient ; i++){
             a1++;
             
          ArrayList<Services>   listOfServices =   new ArrayList<>();
                  System.out.println("enter the info for the " + a1 + " patient please  ");
   
    System.out.println(" enter the name  ");
            String name = read.next();
         
           System.out.println(" enter the ID  ");
            int ID = read.nextInt();
        
           System.out.println(" enter the address ..  ");
            String address = read.next();
           
            System.out.println(" enter the Email ..  ");
            String email = read.next();
           
            System.out.println(" enter the mobile number  ..  ");
            String mobileNumber = read.next();
           
           System.out.println("enter the type of patient A or B");
           char type = read.next().charAt(0);
           
           
           System.out.println("enter the number of services");
           number_of_services=read.nextInt();
          for (int j =0 ; j<number_of_services ; j++) { 
              
           System.out.println("");
           
           System.out.println("enter the name of services");   
             String nameS=read.next();
             
             System.out.println("enter the ID of  services");
             int IDs= read.nextInt();
             
           System.out.println("enter the price of services");
           double price=read.nextDouble();
           
           System.out.println("enter the name of the decotor for the services " );
           String nameD=read.next();
               System.out.println("enter the id of the decotor  for the services "  );
           int IDd= read.nextInt();
           ////////////////////////////////////////////////////////////////////
           
           System.out.println(" enter the address of the dector  ");
            String addressD = read.next();
           
            System.out.println(" enter the Email of the dector ");
            String emailD = read.next();
           
            System.out.println(" enter the mobile number of the dector  ");
            String mobileNumberD = read.next();
           
            System.out.println(" enter the salary of the dector ..  ");
            double salaryD = read.nextDouble();
            
             System.out.println(" enter specialty of the decotor  ..  ");
            String specialty = read.next();
               System.out.println(" enter the RANK of the decotor  ..  ");
            int rankD = read.nextInt();
            
            // now we will fill the nurse object 
            System.out.println(" now you will enter the info about the special nurse"
                    + "\n"+"that will work whit the decoter ");
              System.out.println(" enter the NAME of the special Nurse ..  ");
                 String nameN = read.next();
                 
                  System.out.println(" enter her / his the ID  ");
            int ID_N = read.nextInt();
            
             System.out.println(" enter her / his the address ..  ");
            String addressN  = read.next();
            
             System.out.println(" enter her / his the Email ..  ");
            String emailN = read.next();
            
             System.out.println(" enter her / his the mobile number  ..  ");
            String mobileNumberN = read.next();
            
            System.out.println(" enter her / his the salary  ..  ");
            double salaryN = read.nextDouble();
           
            System.out.println(" enter her / his specialty ..  ");
            String specialtyN = read.next();
            
               System.out.println(" enter her / his RANK  ..  ");
            int rankN = read.nextInt();
            
            Nurse specialNurse =  new Nurse(specialtyN , addressN , emailN ,
            mobileNumberN , salaryN , nameN , ID_N , rankN );
            
            ////////////////////////////////////////////////////////////////////
           Dector D= new Dector(specialty , specialNurse , addressD, 
            emailD , mobileNumberD , salaryD , nameD, IDd
    , rankD );
           Services a=new Services(price,nameS,IDs,D);
           
           listOfServices.add(a);
          }
           Patient p= new Patient(address, email,  mobileNumber, type,  name,  ID, listOfServices);
            list_of_patient.add(p);
           
   }
   }
    
   if(selection==2){
       
       for (Patient p : list_of_patient){
        System.out.println(p); 
       }
 
   }
   
   if(selection==3){
      
        System.out.println("the patient bill");
        for (Patient p : list_of_patient ){
             double total = 0 ;
        for (Services s : p.getListOfServices() ){
       total += s.getPrice();
        System.out.println(p);
        System.out.println("the total price for all servces is " + total);
        }
        }
         
   }
   
   
   if(selection==4){
       the_main_Selections(list_of_Employee,list_of_patient,list_of_Services);
   }
   
 
     
   }
   
   
   
   
   
     //////////////////////////////////////////////////////////////////////////
      // 6 METHOD if user enter the service selection Screen
      //////////////////////////////////////////////////////////////////////////
   public static void service_selection(ArrayList<Employee> list_of_Employee, ArrayList<Patient> list_of_patient,ArrayList<Services> list_of_Services ){
        Scanner read= new Scanner (System.in);
         int selection = 0 ;
         int a1 = 0 ; 
        
         while (selection<1 || selection>4){
    System.out.println("\n"+"select one of the following  :- "
            + "\n " + "1. Add new services  "
     + "\n " + "2. print the services info "
            +"\n"+"3.print the dector services "
            + "\n"+"4. EXIT");
    selection = read.nextInt();} 
         
          if(selection==1){   
   System.out.println("enter the number of the services you want to add .. " );
        int number_of_services = read.nextInt();
       
         for (int i =0 ; i<number_of_services ; i++){
        a1++;
                  System.out.println("enter the info for the " + a1 + " service please  ");
   
    System.out.println(" enter the name of the service  ");
            String name = read.next();
         
           System.out.println(" enter the ID of the service ");
            int ID = read.nextInt();
        
         System.out.println(" enter the price of the service ");
            double price = read.nextDouble();
           
            
            
             System.out.println("now enter the info about the dector who provide the service" );
            
            System.out.println(" enter the name of the dector ");
            String nameD = read.next();
         
           System.out.println(" enter the ID of the dector ");
            int IDD = read.nextInt();
        
           System.out.println(" enter the address of the dector  ");
            String address = read.next();
           
            System.out.println(" enter the Email of the dector ");
            String email = read.next();
           
            System.out.println(" enter the mobile number of the dector  ");
            String mobileNumber = read.next();
           
            System.out.println(" enter the salary of the dector ..  ");
            double salary = read.nextDouble();
            
             System.out.println(" enter specialty of the decotor  ..  ");
            String specialty = read.next();
               System.out.println(" enter the RANK of the decotor  ..  ");
            int rank = read.nextInt();
            
            // now we will fill the nurse object 
            System.out.println(" now you will enter the info about the special nurse"
                    + "\n"+"that will work whit the decoter ");
              System.out.println(" enter the NAME of the special Nurse ..  ");
                 String nameN = read.next();
                 
                  System.out.println(" enter her / his the ID  ");
            int ID_N = read.nextInt();
            
             System.out.println(" enter her / his the address ..  ");
            String addressN  = read.next();
            
             System.out.println(" enter her / his the Email ..  ");
            String emailN = read.next();
            
             System.out.println(" enter her / his the mobile number  ..  ");
            String mobileNumberN = read.next();
            
            System.out.println(" enter her / his the salary  ..  ");
            double salaryN = read.nextDouble();
           
            System.out.println(" enter her / his specialty ..  ");
            String specialtyN = read.next();
            
               System.out.println(" enter her / his RANK  ..  ");
            int rankN = read.nextInt();
            
            Nurse specialNurse =  new Nurse(specialtyN , addressN , emailN ,
            mobileNumberN , salaryN , nameN , ID_N , rankN );
            
            
           Dector DectorHowProvdeServices  =  new Dector (specialty,specialNurse, address , email ,  
          mobileNumber , salary , nameD , IDD ,rank ) ; 
           
        Services newServices = new Services( price, name, ID , DectorHowProvdeServices);
        list_of_Services.add(newServices);
           }   
   }
          
    if(selection==2){
    for (Services s : list_of_Services ){
     System.out.println(s);
    }
    }   
     
    
   if(selection==3) {
       
       int check = 0  ;
       
while(check != 1){
     System.out.println("enter the id of the dector you to serach for ");
       int ID = read.nextInt();
   for (Services s : list_of_Services ){
       
   if (s.getDectorHowProvdeServices().getID()==ID){
      check = 1; 
   System.out.println(s.getDectorHowProvdeServices());
   }
   else { System.out.println("invaild id number please try again  ");}
   }
   
   }
   }
   
    
   if(selection==4){
       the_main_Selections(list_of_Employee,list_of_patient,list_of_Services);
   }
   

   
}
   
   
   
}