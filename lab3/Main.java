package lab3;

public class Main {

	public static void main(String[] args) {
		SkipassWeekends pass = new SkipassWeekends();
		System.out.println(pass.getId());
		TicketFactory ticket = new TicketFactory();
		ticket.blocked(pass);
		System.out.println(pass.isStatusBlocked());
		
	}

}
