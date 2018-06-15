package lab3;

import java.util.HashMap;
import java.util.Map;

public class Turnstile {

	Map<String,Integer> denies = new HashMap<String,Integer>();
	Map<String,Integer> permissions = new HashMap<String,Integer>();

	public boolean accessForTicket(Skipass ticket) {

		
		if (ticket.statusBlocked == false && ticket.valid() == true) {
			permissions.put(String.valueOf(ticket.id), 1);
			ticket.setUsed(ticket.getUsed()-1);
			System.out.println("Access is granted.");
			return true;
		} else {
			denies.put(String.valueOf(ticket.id), 1);
			System.out.println("Access is denied.");
			return false;
		}
	}

	public String dataAllInformation(TicketFactory ticket) {
		return ticket.toString();
	}

	public String dataTypes(TicketFactory ticket) {
		return TicketFactory.class.getName();
	}

}
