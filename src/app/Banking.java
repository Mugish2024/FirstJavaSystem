
package app;


import java.sql.*;
import java.util.Scanner;


public class Banking {
    public static void main (String Args[]){
        Scanner sc = new Scanner(System.in);
        boolean condition = true;
        String natioanalid;
        String names;
        int age;
        String phoneNumber;
        String accountNumber;
        
        String db_url = "jdbc:mysql://localhost:3306/banking";
        String username = "root";
        String passwd = "12345";
        
        while(condition){
        
            System.out.println("=====================");
            System.out.println("   BANKING SYSTEM    ");
            System.out.println("=====================");
            System.out.println("1. Register a Customer ");
            System.out.println("2. Update Customer information");
            System.out.println("3. Find the Customer by a national id");
            System.out.println("4. Delete the Customer ");
            System.out.println("5. FInd all Customer ");
            System.out.println("0. Exit");
            System.out.println("--------------------------");
            System.out.println("Choose: ");
            int choice = sc.nextInt();
            String option;
            switch(choice){
             case 1:
                 System.out.println("Customer registration selected");
                 System.out.println("-------------------------------");
                 System.out.println("Emter your National ID: ");
                 
                 natioanalid = sc.next();
                 
                 
                 System.out.println("Enter your Names      : ");
                 
                 names = sc.next();
                 
                 
                 System.out.println("Emter your Age        : ");
                 
                 age = sc.nextInt();
                 System.out.println("Emter your Phone No   : ");
                 
                 phoneNumber = sc.next();
                 System.out.println("Emter your Account  No: ");
                 accountNumber = sc.next();
                 
                 // step 0: surround with try and catch
                 try{
                 // step 1: Create the connection
       
               Connection con = DriverManager.getConnection(db_url, username, passwd);
                 // step 2 : create the statement 
                 Statement st = con.createStatement();
                 // step 3: Excute the statement
                 String sql = "INSERT INTO customer (nid, names, age, phone_number, account_number)  VALUES ('"+natioanalid+"','"+names+"',"+age+",'"+phoneNumber+"','"+accountNumber+"')";
                 int rawAffected = st.executeUpdate(sql);
                 // step 4: close connection
                con.close();
                if(rawAffected > 0){
                    System.out.println("Data Inserted !");
                }else{
                    System.out.println("Data not inserted");
                }
                 }catch(Exception ex){
                 ex.printStackTrace();
                 }
                 System.out.println("Enter yes or no to contune");
                System.out.println("Enter yes or no to proceed");
                 option = sc.next();
                 if(option.equalsIgnoreCase("yes")){
                condition = true;
               
                }else if (option.equalsIgnoreCase("NO")){
                condition = false;
                
                }else{
                    System.out.println("Wrong Choice");
                    condition = false;
                }
                 break;
             case 2:
                 System.out.println("Choice two selected");
                 option = sc.next();
                if(option.equalsIgnoreCase("yes")){
                condition = true;
               
                }else if (option.equalsIgnoreCase("NO")){
                condition = false;
                
                }else{
                    System.out.println("Wrong Choice");
                    condition = false;
                }
                 break;
             case 3:
                 System.out.println("Choice three selected");
                 option = sc.next();
                if(option.equalsIgnoreCase("yes")){
                condition = true;
               
                }else if (option.equalsIgnoreCase("NO")){
                condition = false;
                
                    System.out.println("Wrong Choice");
                    condition = false;
                }
                 break;
             case 4:
                 System.out.println("Choice four selected");
                 option = sc.next();
                if(option.equalsIgnoreCase("yes")){
                condition = true;
               
                }else if (option.equalsIgnoreCase("NO")){
                condition = false;
                
                }else{
                    System.out.println("Wrong Choice");
                    condition = false;
                }
                 break;
             case 5:
                 System.out.println("choice five selected");
                 System.out.println("Enter Yea to continue or No to quit!");
                 option = sc.next();
                if(option.equalsIgnoreCase("yes")){
                condition = true;
               
                }else if (option.equalsIgnoreCase("NO")){
                condition = false;
                
                }else{
                    System.out.println("Wrong Choice");
                    condition = false;
                }
                 break;
             case 0:
                 System.out.println("Thank you for using the system");
               //  condition = false;
                System.exit(0);
                 break;
                 
             default:
                 System.out.println("invalid choice");
                 System.out.println("Enter Yea to continue or No to quit!");
                option = sc.next();
                if(option.equalsIgnoreCase("yes")){
                condition = true;
               
                }else if (option.equalsIgnoreCase("NO")){
                condition = false;
                
                }else{
                    System.out.println("Wrong Choice");
                    condition = false;
                }
                        
                 
         
        }
        }      
    }
}  

    
    
