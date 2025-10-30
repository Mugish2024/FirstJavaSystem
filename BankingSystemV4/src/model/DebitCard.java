/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "debit_card")
public class DebitCard {
    @Id
    private int id;
    @Column(name = "card_number", nullable = false)
    private String cardNumber;
    
    private Boolean active;
    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
    
          
   
    
}
