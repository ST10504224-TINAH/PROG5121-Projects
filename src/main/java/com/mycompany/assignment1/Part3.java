/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author chris
 */
public class Part3 {
// Part 3 continuation of Part 1 and 2
    
  // List of arrays
    public static ArrayList<String> sentList = new ArrayList<>();
    public static ArrayList<String> storedList = new ArrayList<>();
    public static ArrayList<String> disregardedList = new ArrayList<>();
    public static ArrayList<String> allMessagesList = new ArrayList<>();
    public static ArrayList<String> messageIDsList = new ArrayList<>();
    public static ArrayList<String> messageHahes = new ArrayList<>();
    public static ArrayList<String> recipients = new ArrayList<>();
    public static ArrayList<String> senders = new ArrayList<>();

    // Track items in the array
    public static int sentCount = 0;
    public static int disregardCount = 0;
    public static int storedCount = 0;
    public static int totalCount = 0;
    static Object allMessages;
    static Object messageHashes;
    static Object messageIDs;
    
    // Use this whenever a message is sent, stored, or disregarded
    public static void addMessage(String id, String sender, String recipient, String message, String flag, String[] addMessage) {
        if (flag.equalsIgnoreCase("Sent")) {
            String[] sentMessages = addMessage;
            sentMessages[sentCount] = message;
            sentCount++;
        } else if (flag.equalsIgnoreCase("Stored")) {
            String[] storedMessages = null;
            storedMessages[storedCount] = message;
            storedCount++;
        } else if (flag.equalsIgnoreCase("Disregard")) {
            String[] disregardedMessages = null;
            disregardedMessages[disregardCount] = message;
            disregardCount++;
            return; 
        }
        String[] messageIDs = null;
        
         // Store details for Sent & Stored messages
        messageIDs[totalCount] = id;
        String[] senders = null;
        senders[totalCount] = sender;
        String[] recipients = null;
        recipients[totalCount] = recipient;
        String[] messageHashes = null;
        messageHashes[totalCount] = createMessageHash(id, message);
        totalCount++;
    }

    public static String createMessageHash(String id, String message) {
        String[] words = message.trim().split(" ");
        String[] first = words;
        String last = words[words.length - 1];
        return (id.substring(0, 2) + ":" + totalCount + ":" + Arrays.toString(first) + last).toUpperCase();
    }
    
}
