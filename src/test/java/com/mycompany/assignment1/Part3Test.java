/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.assignment1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author chris
 */
public class Part3Test {
    
    public Part3Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
        
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addMessage method, of class Part3.
     */
     @Test
    public void testSentMessagesPopulated() {
        assertEquals(2, Part3.sentList.size());
        assertEquals("Did you get the cake?", Part3.sentList.get(0));
        assertEquals("It is dinner time !", Part3.sentList.get(1));
    }

    @Test
    public void testDisplayLongestMessage() {
        String expResult = "Where are you? You are late! I have asked you to be on time.";
        //String result = Part3.displayLongestMessage();
        //assertEquals(expResult, result);
    }
     @Test
    public void testSearchByMessageID() {
        //String result = Part3.searchByMessageID("0838884567");
        //assertTrue(result.contains("It is dinner time !"));
    }

    @Test
    public void testSearchByRecipient() {
        String expResult = "Where are you? You are late! I have asked you to be on time.\nOk, I am leaving without you.";
        Object result = null;
        //String result = Part3.Recipient("+27838884567");
        assertEquals(expResult, result);
    }

    @Test
    public void testDeleteByHash() {
        // Test Message 2 is at index 1 in messageHashes
       // String hashToDelete = Part3.messageHashes.;
        String expResult = "Message \"Where are you? You are late! I have asked you to be on time.\" successfully deleted.";
        String result = null;
        //result = Part3.deleteByHash(hashToDelete);
        assertEquals(expResult, result);
    }
}
