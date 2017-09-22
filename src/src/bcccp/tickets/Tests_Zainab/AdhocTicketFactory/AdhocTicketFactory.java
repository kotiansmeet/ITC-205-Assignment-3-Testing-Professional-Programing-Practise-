package bcccp.tickets.adhoc;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdhocTicketFactoryTest {
	
	private String carparkId = "Sample id";
	private int ticketNo = 34;
	private String barcode = "Sample Barcode";
	AdhocTicket adTicket = new AdhocTicket(carparkId, ticketNo, barcode);
	
	
	@Test
	public void testAdhocTicket() {
		assertEquals(adTicket.getCarparkId(), ticketNo, barcode);
	}
	
}
