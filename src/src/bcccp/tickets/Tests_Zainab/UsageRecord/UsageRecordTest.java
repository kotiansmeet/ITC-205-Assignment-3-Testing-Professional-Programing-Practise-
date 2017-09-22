package bcccp.tickets.season;


//Importing junit packagesfor unit testing
import static org.junit.Assert.*;

import org.junit.Test;


//Defining test class for UsageRecords testing
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
	
	@Test
	public void testGetEndTime() {
		assertEquals(uRec.endDateTime, uRec.getEndTime());
	}
	
	@Test
	public void testGetSeasonTicketId() {
		assertEquals(uRec.ticketId, uRec.getSeasonTicketId());
	}
	
	@Test
	public void testToString() {
		String expectedString = "Usage : startDateTime : " + startTime + ", endDateTime: " + endTime;
		uRec.endDateTime = endTime;
		assertEquals(uRec.toString(), expectedString);
	}
}
