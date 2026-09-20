/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpoe;
import javax.swing.JOptionPane;
/**
 *
 * @author chris
 */
public class ProgPOE {
    // We are creating a method to create an account to add username, password and South African phone number
    public static void main(String[] args) {
        
// Store the user info
 
        String username = JOptionPane.showInputDialog(null, "Enter Username");
        // Ask user to enter username.
        if(username != null & username.length()>= 5 & !username.contains("_") ){
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        }else {JOptionPane.showMessageDialog(null, "Username is not correctly formatted; please ensure your username contains an underscore and is no more than five characters in length.");
        }
        
        String password = JOptionPane.showInputDialog(null, "Enter Password");
        // Ask user to enter password. 
        if(password != null & password.length()>= 8 & !password.matches(".*[0-9].*") & !password.matches(".*[A-Z].*") & !password.matches(".*[^a-zA-Z0-9].*") ){
            JOptionPane.showMessageDialog(null, "Password successfully captured");
        }else {JOptionPane.showMessageDialog(null, "Password is not correctly formatted; please ensure your Password contains at least eight characters, a capital letter, a number, and a special chacter.");
        }
        
        String phone = JOptionPane.showInputDialog(null, "Enter Phone number");
      // Ask user to enter phone number. 
        if(phone != null & phone.contains("+27") & phone.length()>= 10 ){
            JOptionPane.showMessageDialog(null, "Cell phone number successfully added");
        }else {JOptionPane.showMessageDialog(null, "Cell phone number incorrectly formatted or does not contain international code.");  
        }
        
    }
}
