/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcccp.carpark.entry;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *
 * Test claas for EntryCantroller.java
 *
 * @author User
 */
 public class EntryControllerTest
 {
    
    public EntryControllerTest() 
	{
    }
    
    @BeforeClass
    public static void setUpClass() 
	{
    }
    
    @AfterClass
    public static void tearDownClass()
	{
    }
	
    
    @Before
    public void setUp()
	{
    }
    
    @After
    public void tearDown()
	{
    }
	
	 /**
     * Test of carEventDetected method, of class EntryController.
	 
     */
	   @Test
    public void testCarEventDetected() {
        System.out.println("carEventDetected");
        String detectorId = "";
        boolean carDetected = false;
        EntryController instance = null;
        instance.carEventDetected(detectorId, carDetected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

	 /**
     * Test of buttonPushed method, of class EntryController.
     */
	 
	  @Test
    public void testButtonPushed() {
        System.out.println("buttonPushed");
        EntryController instance = null;
        instance.buttonPushed();        
      
    }
	/**
     *Unit testing of Ticketsertedserted method, of class EntryController.
     */
	   @Test
    public void testTicketInserted() 
	{
        System.out.println("ticketInserted");
        String barcode = "";
        EntryController instance = null;
        instance.ticketInserted(barcode);
        // TODO review the generated test code and remove the default call to fail.
	}

	 /**
     * Unit Testing of ticketTaken method, of class EntryController.
     */
	 @Test
    public void testTicketTaken() {
        System.out.println("ticketTaken");
        EntryController instance = null;
        instance.ticketTaken();
		
        // Passed ("The test case is a prototype.");
    }
	
	 /**
     * Unit Testing of notifyCarparkEvent method, of class EntryController.
     */
	 @Test
    public void testNotifyCarparkEvent() {
        System.out.println("notifyCarparkEvent");
        EntryController instance = null;
		 instance.notifyCarparkEvent();
        // Unit Testing of notifyCarparkEvent method.
      
    }
    
}

	 