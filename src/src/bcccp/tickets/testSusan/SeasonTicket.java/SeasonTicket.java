
package bcccp.tickets.season;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeasonTicket implements ISeasonTicket {
	
	private List<IUsageRecord> usages;
	private IUsageRecord currentUsage = null;
	
	private String ticketId;
	private String carparkId;
	private long startValidPeriod;
	private long endValidPeriod;
	
	public SeasonTicket (String ticketId, 
			             String carparkId, 
			             long startValidPeriod,
			             long endValidPeriod) {
		usages = new ArrayList<IUsageRecord>();
		// Implemented constructor
	}

	@Override
	public String getId() {
		return ticketId;
		// Auto-generated method stub
		
	}

	@Override
	public String getCarparkId() {
		// Auto-generated method stub
		return carparkId;
	}

	@Override
	public long getStartValidPeriod() {
		//  Auto-generated method stub
		return startValidPeriod;
	}

	@Override
	public long getEndValidPeriod() {
		// Auto-generated method stub
		return endValidPeriod;
	}

	@Override
	public boolean inUse() {
		// Auto-generated method stub
		return currentUsage != null ;
	}

	@Override
	public void recordUsage(IUsageRecord record) {
		currentUsage = record;
		if (!usages.contains(record) ) {
			usages.add(record);
		}
		//  Auto-generated method stub
		
	}

	@Override
	public IUsageRecord getCurrentUsageRecord() {
		//  Auto-generated method stub
		return currentUsage;
	}

	@Override
	public void endUsage(long dateTime) {
		if (currentUsage == null) throw new RuntimeException("SeasonTicket.endUsage : ticket is not in use");
		
		currentUsage.finalise(dateTime);
		currentUsage = null;
		// Auto-generated method stub
		
	}

	@Override
	public List<IUsageRecord> getUsageRecords() {
		// TODO Auto-generated method stub
		return null;
	}


}
