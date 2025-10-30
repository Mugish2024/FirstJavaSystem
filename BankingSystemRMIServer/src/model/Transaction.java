/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class Transaction {
  @Id
  private int id;
  @Column(name="transaction_date", nullable = false)
  private Date transactionDate;
  private Double amount;
  @Enumerated(Enu)
  private ETransactionType type;
}
