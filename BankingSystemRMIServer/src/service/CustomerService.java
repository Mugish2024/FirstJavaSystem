/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Customer;

/**
 *
 * @author user
 */
public interface CustomerService extends Remote {
    
     Customer createCustomer (Customer theCustomer ) throws RemoteException;
    
    Customer updateCustomer (Customer theCustomer) throws RemoteException;
    Customer deleteCustomer (Customer theCustomer) throws RemoteException;
    Customer searchCustomerById  (Customer theCustomer) throws RemoteException;
    List <Customer>  findAllCustomer (Customer theCustomer) throws RemoteException;
}
