/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import model.Account;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author user
 */
public class AccountDao {
    public Account registerAccount (Account theAccount){
    try{
        
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(theAccount);
        tr.commit();
        ss.close();
        return theAccount;
                
                
    }catch(Exception ex){
    ex.printStackTrace();
    }
    return null;
    }

public Account deleteAccount (Account theAccount){
    try{
        
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.delete(theAccount);
        tr.commit();
        ss.close();
        return theAccount;
                
                
    }catch(Exception ex){
    ex.printStackTrace();
    }
    return null;
    }

private Account findAccountById (Account theAccount){
        
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Account acc = (Account) ss.get(Account.class, theAccount.getId());
                ss.close();
                return cust;
        
    }catch(Exception ex ){
    ex.printStackTrace();
    }
       
    
    
    
    
    
    
    return null;


}
}
