package lab3;

import java.util.HashMap;
import java.util.Map;

public class TicketFactory {

	Map<String,String> information = new HashMap<String,String>();

	
	public void blocked(Skipass ticket) {
		ticket.setStatusBlocked(true);
	}

	public void register(Skipass ticket) {
		ticket.name = Skipass.class.getName();
		information.put(String.valueOf(ticket.id), ticket.toString());
	}
	
	
	public Skipass print(Skipass.type type, String enumeration) {
		if (type == Skipass.type.Work) {
			Skipass ticket = new SkipassWorkdays();

			switch (enumeration) {
			
			case "morning":
				((SkipassWorkdays) ticket).check = SkipassWorkdays.period.morning;
				break;

			case "evening":
				((SkipassWorkdays) ticket).check = SkipassWorkdays.period.evening;
				break;

			case "day":
				((SkipassWorkdays) ticket).check = SkipassWorkdays.period.oneday;
				break;

			case "twodays":
				((SkipassWorkdays) ticket).check = SkipassWorkdays.period.twodays;
				break;
				
			case "fivedays":
				((SkipassWorkdays) ticket).check = SkipassWorkdays.period.fivedays;
				break;
			
			case "ten":
				((SkipassWorkdays) ticket).setUsed(10);
				break;
				
			case "twenty":
				((SkipassWorkdays) ticket).setUsed(20);
				break;

			case "fifty":
				((SkipassWorkdays) ticket).setUsed(50);
				break;

			case "hundred":
				((SkipassWorkdays) ticket).setUsed(100);
				break;

			default:
				return null;
			}

			ticket.specification = type;
			register(ticket);
			return ticket;
		} else if (type == Skipass.type.Weekend) {
			Skipass ticket = new SkipassWeekends();

			switch (enumeration) {
			case "morning":
				((SkipassWeekends) ticket).check = SkipassWeekends.period.morning;
				break;

			case "evening":
				((SkipassWeekends) ticket).check = SkipassWeekends.period.evening;
				break;

			case "day":
				((SkipassWeekends) ticket).check = SkipassWeekends.period.oneday;
				break;

			case "twodays":
				((SkipassWeekends) ticket).check = SkipassWeekends.period.twodays;
				break;
			
			case "ten":
				((SkipassWeekends) ticket).setUsed(10);
				break;
				
			case "twenty":
				((SkipassWeekends) ticket).setUsed(20);
				break;

			case "fifty":
				((SkipassWeekends) ticket).setUsed(50);
				break;

			case "hundred":
				((SkipassWeekends) ticket).setUsed(100);
				break;

			default:
				return null;
			}

			ticket.specification = type;
			register(ticket);
			return ticket;
		} else if (type == Skipass.type.Season) {
			Skipass ticket = new SkipassWeekends();

			switch (enumeration) {
			case "morning":
				((SkipassWeekends) ticket).check = SkipassWeekends.period.morning;
				break;

			case "evening":
				((SkipassWeekends) ticket).check = SkipassWeekends.period.evening;
				break;

			case "day":
				((SkipassWeekends) ticket).check = SkipassWeekends.period.oneday;
				break;

			case "twodays":
				((SkipassWeekends) ticket).check = SkipassWeekends.period.twodays;
				break;
			
			case "ten":
				((SkipassWeekends) ticket).setUsed(10);
				break;
				
			case "twenty":
				((SkipassWeekends) ticket).setUsed(20);
				break;

			case "fifty":
				((SkipassWeekends) ticket).setUsed(50);
				break;

			case "hundred":
				((SkipassWeekends) ticket).setUsed(100);
				break;

			default:
				return null;
			}

			ticket.specification = type;
			register(ticket);
			return ticket;
		}else
			return null;
	}

}
