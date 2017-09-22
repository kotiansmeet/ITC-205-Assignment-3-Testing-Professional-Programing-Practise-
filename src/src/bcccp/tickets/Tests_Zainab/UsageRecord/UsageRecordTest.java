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
}
