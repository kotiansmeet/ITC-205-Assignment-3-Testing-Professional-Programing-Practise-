package bcccp.tickets.season;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsageRecordTest {
  
  String id = "Sample Ticket ID";
	long startTime = 1700;
	long endTime = 1230;
	UsageRecord uRec = new UsageRecord(id,startTime);
	
	@Test
	public void testUsageRecord() {
		assertEquals(uRec.ticketId, id);
	}
	
	@Test
	public void testFinalise() {
		uRec.finalise(endTime);
		assertEquals(uRec.endDateTime, endTime);
	}
	
	@Test
	public void testGetStartTime() {
		assertEquals(uRec.startDateTime, uRec.getStartTime());
	}
}
