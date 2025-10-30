/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import org.hibernate.annotations.CollectionId;

/**
 *
 * @author user
 */
@Entity

public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String names;
    @Column(name = "phone_number")
    private String phonNumber;
    private int age;
    @ManyToMany(mappedBy="customers")
    private Set<Bond> bonds;
    @ManyToMany(mappedBy = "custome")
    private Set<Account> accounts;

    public Customer(int id) {
        this.id = id;
    }

    public Customer() {
    }

    public Customer(int id, String names, String phonNumber, int age, Set<Bond> bonds, Set<Account> accounts) {
        this.id = id;
        this.names = names;
        this.phonNumber = phonNumber;
        this.age = age;
        this.bonds = bonds;
        this.accounts = accounts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Bond> getBonds() {
        return bonds;
    }

    public void setBonds(Set<Bond> bonds) {
        this.bonds = bonds;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
    
}
