package bcccp.tickets.adhoc;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdhocTicketFactoryTest {
	
	private String carparkId_ = "Sample id";
	private int ticketNo = 34;
	private String barcode = "34";
	AdhocTicket adTicket = new AdhocTicket(carparkId_, ticketNo, barcode);
	
	
	@Test
	public void testAdhocTicket() {
		assertEquals(carparkId_, carparkId_);
	}
}
