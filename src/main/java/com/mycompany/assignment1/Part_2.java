/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Part_2 {

    public static void main(String[] args) {
        //Declaration for Assignment1
        try (// Assignment1 continued
                Scanner input = new Scanner(System.in)) {

            String username = JOptionPane.showInputDialog(null, "Enter Username");
            String Password = JOptionPane.showInputDialog(null, "Enter Password");
            String phone = JOptionPane.showInputDialog(null, "Enter Phone number");
            String JSON_FILE = JSON_FILE = "messages_stored.json";

            boolean isloggedIn;
            isloggedIn = true;

            if (isloggedIn = true) {

// Show welcome message
                System.out.println("Welcome to QuickChat.");

// User has a choice to choose between 3 options.
                int option;
                option = 0;
                while (option != 3) {
                    System.out.println("Choose option");
                    System.out.println("1 - Send Messages"); // user can only write 250 words.
                    System.out.println("2 - Show recently sent messages"); // show previous messages
                    System.out.println("3 - Quit");
                    System.out.print("Enter choice: ");

                    option = input.nextInt();
                    String nextLine = input.nextLine(); // Enter message on next line

                    switch (option) {
                        case 1 -> {
                            System.out.print("How many messages do you wish to enter? ");
                            int count = input.nextInt();
                            input.nextLine();
                            for (int i = 0; i < count; i++) {
                                System.out.print("Enter Message ID: ");
                                String id = input.nextLine();
                                System.out.print("Enter Recipient: ");
                                String recipient = input.nextLine();
                                System.out.print("Enter Message Content: ");
                                String msg = input.nextLine();
                                //Choose option for message
                                System.out.println("Options: 1=Send, 2=Disregard, 3=Store");
                                System.out.print("Choose option: ");
                                int choice = input.nextInt();
                                switch (choice) {
                                    case 1 -> {
                                        System.out.println("Message successfully sent");
                                        // Show details of the message
                                        System.out.println("Message ID: " + id);
                                        System.out.println("Recipient: " + recipient);
                                        System.out.println("Message: " + msg);
                                    }
                                    case 2 -> {
                                        System.out.println("Press 0 to delete the message");
                                        System.out.print("Confirm");
                                        int confirm = input.nextInt();
                                        if (confirm == 0) {
                                            System.out.println("Message deleted."); //Show message deleted.
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("Message successfully stored");
                                        System.out.println("(Stored in JSON file format)"); //Store message to send later.
                     
                                    }
                                    default -> System.out.println("Invalid choice.");
                                }
                            }
                        }
                        case 2 ->
                            System.out.print("Coming Soon...");
                        case 3 ->
                            System.out.print("Exitng application...");
                    }
                }

            }
        }
    }
}
