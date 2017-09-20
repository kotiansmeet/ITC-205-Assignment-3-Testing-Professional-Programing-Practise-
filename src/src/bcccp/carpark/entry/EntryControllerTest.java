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
       
    }
