
package bcccp.tickets.season;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsageRecordFactoryTest {
	
	//Assigning values to variables
	String id = "Sample Ticket ID";
	long startTime = 1700;
	long endTime = 1230;
	UsageRecord uRec = new UsageRecord(id,startTime);
	
	//test for usagerecord
	@Test
	public void testUsageRecord() {
		assertEquals(uRec.ticketId, id);
	}
	
}
