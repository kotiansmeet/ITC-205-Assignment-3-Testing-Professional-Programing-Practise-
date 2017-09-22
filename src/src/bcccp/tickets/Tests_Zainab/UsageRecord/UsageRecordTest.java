package bcccp.tickets.season;


//Importing junit packagesfor unit testing
import static org.junit.Assert.*;

import org.junit.Test;


//Defining test class for UsageRecords testing
public class UsageRecordTest {
	
	
  	//Assigning values to variables for testing
  	String id = "Sample Ticket ID";
	long startTime = 1700;
	long endTime = 1230;
	UsageRecord uRec = new UsageRecord(id,startTime);
	
	
	//Test for usage records
	@Test
	public void testUsageRecord() {
		assertEquals(uRec.ticketId, id);
	}
	
	//test for finalising time
	@Test
	public void testFinalise() {
		uRec.finalise(endTime);
		assertEquals(uRec.endDateTime, endTime);
	}
	
	//test for start time
	@Test
	public void testGetStartTime() {
		assertEquals(uRec.startDateTime, uRec.getStartTime());
	}
	
	//test for end time
	@Test
	public void testGetEndTime() {
		assertEquals(uRec.endDateTime, uRec.getEndTime());
	}
	
	//test for season ticket ID validation
	@Test
	public void testGetSeasonTicketId() {
		assertEquals(uRec.ticketId, uRec.getSeasonTicketId());
	}
	
	//Test to check enetered string values
	@Test
	public void testToString() {
		String expectedString = "Usage : startDateTime : " + startTime + ", endDateTime: " + endTime;
		uRec.endDateTime = endTime;
		assertEquals(uRec.toString(), expectedString);
	}
}
