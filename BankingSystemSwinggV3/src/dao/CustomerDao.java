/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Customer;

/**
 *
 * @author user
 */
public class CustomerDao {
private String jdbcurl = "jdbc:postgresql://localhost/:5432/banking";
private String dbUsername = "root";
private String dbPassword = "12345";


public int registerCustomer(Customer custObj){

try{
    Connection con = DriverManager.getConnection(jdbcurl,dbUsername,dbPassword);
    String sql = "INSERT INTO customer (nid.names.phone_number,age,account_number) VALUES (?,?,?,?,?)";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1,custObj.getNid());
    pst.setString(2,custObj.getNames());
    pst.setString(3,custObj.getPhoneNumber());
    pst.setInt(4,custObj.getAge());
    pst.setString(5,custObj.getAccountNumber());
    
    int rowAffected = pst.executeUpdate();
    
    con.close();
    return rowAffected;
}catch(Exception ex){
ex.printStackTrace();

}
    return 0;
}
public int UpdateCustomer (Customer custObj){
    
    try{
        Connection con = DriverManager.getConnection(jdbcurl, dbUsername, dbPassword);
         String sql = "UPDATE customer SET  names =? , account_number=? , phone_number=? , age = ? WHERE Nid =? ";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, custObj.getNames());
        pst.setInt(2, custObj.getAge());
        pst.setString(3, custObj.getPhoneNumber());
        
        pst.setString(4, custObj.getAccountNumber());
       
        int rowAffected = pst.executeUpdate(); 
    return rowAffected;
    }
        
    catch(Exception ex){
   
ex.printStackTrace();
        }
    
    
    return 0;
}

public int DeleteCustomer(Customer custObj){
    
    try{
        Connection con = DriverManager.getConnection(jdbcurl,dbUsername,dbPassword);
    String sql ="DELETE FROM customer WHERE nid=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,custObj.getNid());
        int rowAffected;
        rowAffected = pst.executeUpdate();
        
        return rowAffected;
    
    }catch(Exception ex){
    ex.printStackTrace();
    
    
    }
    
    return 0;


}

public int SearchById(Customer custObj){

try{

Connection con = DriverManager.getConnection(jdbcurl,dbUsername,dbPassword);
String sql = "SELECT FROM CUSOTOMER WHERE nid = ?";

PreparedStatement pst = con.prepareStatement(sql);
pst.setString(1,custObj.getAccountNumber());

int rowAffected = pst.executeUpdate();
return rowAffected;
}catch(Exception ex){
ex.printStackTrace();
}
    return 0;

   



}

public List<Customer> DisplayAllCustomer (){
    try {
        Connection con = DriverManager.getConnection(jdbcurl,dbUsername,dbPassword);
         
        String sql = "SELECT * FROM customer ";
        PreparedStatement pst = con.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         List<Customer> customerList = new ArrayList<>();
      
    }catch(Exception ex){
    ex.printStackTrace();
    }
    
    return null;
}
}