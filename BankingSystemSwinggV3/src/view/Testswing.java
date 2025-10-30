/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static javax.swing.DropMode.ON;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class Testswing {
    public static void main(String[] args) {
        JFrame waterContainer = new JFrame ();
        waterContainer.setTitle ("JIBU");
        waterContainer.setSize(500, 700);
       waterContainer.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        JButton addbtn = new JButton();
        addbtn.setText("ADD");
        waterContainer.setVisible(true);
        
       
        
    }
    
}
