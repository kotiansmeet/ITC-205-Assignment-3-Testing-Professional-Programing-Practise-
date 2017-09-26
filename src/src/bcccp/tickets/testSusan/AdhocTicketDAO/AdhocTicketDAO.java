

package bcccp.tickets.adhoc;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AdhocTicketDAO  implements IAdhocTicketDAO  {

	private Map<String, IAdhocTicket> currentTickets;
	private IAdhocTicketFactory adhocTicketFactory_;
	private int currentTicketNo;


	
	
	public AdhocTicketDAO(IAdhocTicketFactory adhocTicketfactory) {
		this.adhocTicketFactory_ = adhocTicketFactory;
		currentTickets = new HashMap<>();
	}
	
		
		



	@Override
	@test
	//test to make the ticket
	public IAdhocTicket createTicket(String carparkId) {
	    IAdhocTicket ticket = adhocTicketFactory_.make(carparkId, ++currentTicketNo);
	    currentTickets.put(ticket.getBarcode(), ticket);
	    return ticket;
		// TODO Auto-generated method stub
		
	}



	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		// added Auto-generated method stub
		return currentTickets.get(barcode);
	}



	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		// Added Auto-generated method stub
		return Collections.unmodifiableList(new ArrayList<IAdhocTicket>(currentTickets.values()));	
		}

	
	
}
