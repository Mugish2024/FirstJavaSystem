/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class Customer {
    private String names;
    private String Nid;
    private Integer age ;
    private String phoneNumber;
    private String accountNumber;

    public Customer() {
    }

    public Customer(String names, String Nid, Integer age, String phoneNumber, String accountNumber) {
        this.names = names;
        this.Nid = Nid;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getNid() {
        return Nid;
    }

    public void setNid(String Nid) {
        this.Nid = Nid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
}
