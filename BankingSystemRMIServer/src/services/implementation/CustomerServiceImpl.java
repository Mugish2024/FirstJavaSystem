/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.implementation;

import dao.CustomerDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Customer;
import service.CustomerService;

/**
 *
 * @author user
 */
public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerService{

    public CustomerServiceImpl() throws RemoteException {
    }
private CustomerDao customerDao = new CustomerDao();
    @Override
    public Customer createCustomer(Customer theCustomer) throws RemoteException {
    return customerDao.registerCustomer(theCustomer);
    
    }

    

    @Override
    public Customer deleteCustomer(Customer theCustomer) throws RemoteException {
   return customerDao.deleteCustomer(theCustomer); 
    }

    @Override
    public Customer searchCustomerById(Customer theCustomer) throws RemoteException {
    return customerDao.findCustomerById(theCustomer);
    }

    @Override
    public List<Customer> findAllCustomer(Customer theCustomer) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
