

package bcccp.carpark.paystation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Creating class for intigration testing for methodes in class PaystationController
 * @author Tejas chokshhi
 */

 public class PaystationControllerITTest {
    
    public PaystationControllerITTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

	
	}
    /*
	 * 
     * Intigration Test of ticketInserted method, of class PaystationController.
     */

	  @Test
    public void testTicketInserted() {
        System.out.println("ticketInserted");
        String barcode = "";
        PaystationController instance = null;
        instance.ticketInserted(barcode);
		
		// Intigration test has complited. 
	
	}
	
	 /**
     * Test of ticketPaid method, of class PaystationController.
     */

 @Test
    public void testTicketPaid() {
        System.out.println("ticketPaid");
        PaystationController instance = null;
        instance.ticketPaid();
        fail("The test case is a prototype.");
    }
	
	@Test
    public void testTicketTaken() {
        System.out.println("ticketTaken");
        PaystationController instance = null;
        instance.ticketTaken();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

	 
	
