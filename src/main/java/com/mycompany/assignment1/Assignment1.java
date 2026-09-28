/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1;
import javax.swing.JOptionPane;

/**
 *
 * @author chris
 */
public class Assignment1 {
    public static void main(String[] args) {    
// Store user info

String Username = JOptionPane.showInputDialog(null,"Enter your username");
 // Checks that username is at least 5 characters in length and contains an _
        if (Username != null || Username.length()>= 5 && !Username.contains("_")){
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted; please ensure your username contains an underscore and is no more than 5 characters in length.");
        }

String Password = JOptionPane.showInputDialog(null,"Enter your Password");
 // Check that password is 8 characters in length, a capital letter, a number and a special characters
        if(Password != null || Password.length()>= 8 & !Password.matches(".*[0-9].*") & !Password.matches(".*[A-Z].*") & !Password.matches(".*[^a-zA-Z0-9].*") ){
           JOptionPane.showMessageDialog(null, "Password successfully captured");
        }else {
           JOptionPane.showMessageDialog(null, "Password is not correctly formatted; please ensure your Password contains at least eight characters, a capital letter, a number, and a special chacter.");
        }       

String Phonenumber = JOptionPane.showInputDialog(null, "Enter your phone number");
 // Check that phone number is 10 characters long and contains international country code.
        if(Phonenumber != null && Phonenumber.contains("+27") & Phonenumber.length()>= 10){
           JOptionPane.showMessageDialog(null, "Phone number successfully captured");
        }else {
           JOptionPane.showMessageDialog(null, "Cell phone number incorrectly formatted or does does not contain +27 international code.");
        }
 // Show welcome message with user first name and last name.         
        JOptionPane.showMessageDialog(null, "Welcome, it is great to see you.");
      
       // System.out.println("Hello World!");
    }
}
