/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import model.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author user
 */
public class CustomerDao {
    public Customer registerCustomer (Customer theCustomer){
    try{
        
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(theCustomer);
        tr.commit();
        ss.close();
        return theCustomer;
                
                
    }catch(Exception ex){
    ex.printStackTrace();
    }
    return null;
    }

public Customer deleteCustomer (Customer theCustomer){
    try{
        
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.delete(theCustomer);
        tr.commit();
        ss.close();
        return theCustomer;
                
                
    }catch(Exception ex){
    ex.printStackTrace();
    }
    return null;
    }

private Customer findCustomerById (Customer theCustomer){
        
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Customer cust = (Customer) ss.get(Customer.class, theCustomer.getId());
                ss.close();
                return cust;
        
    }catch(Exception ex ){
    ex.printStackTrace();
    }
       
    
    
    
    
    
    
    return null;


}
}
