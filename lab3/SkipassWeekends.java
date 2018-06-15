package lab3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SkipassWeekends extends Skipass {
	private String name = "Ticket for weekends";
	private int id;
	private int used;
	private boolean statusBlocked;
	

	public SkipassWeekends() {
		super();
		setId();
		isStatusBlocked();
	}

	public enum period {
		number, morning, evening, oneday, twodays, fivedays
	}

	public period check;

	
	
	@Override
	public String toString() {
		return "SkipassWeekends [name=" + name + ", id=" + id + ", used=" + used + ", statusBlocked=" + statusBlocked
				+ "]";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		id=(int) (Math.random()*100000);
	}

	public int getUsed() {
		return used;
	}

	public void setUsed(int used) {
		this.used = used;
	}

	
	public boolean isStatusBlocked() {
		return statusBlocked;
	}

	public void setStatusBlocked(boolean statusBlocked) {
		this.statusBlocked = statusBlocked;
	}

	@Override
	public boolean valid() {

		if(id != 0) return true;
		
		GregorianCalendar date = new GregorianCalendar();
		switch (check) {
		case number:
			if (used <= 0)
				return false;
			return true;

		case morning:
			if ((date.get(Calendar.HOUR_OF_DAY) < 9) || (Calendar.HOUR_OF_DAY >= 13))
				return false;
			return true;

		case evening:
			if ((date.get(Calendar.HOUR_OF_DAY) < 13) || (date.get(Calendar.HOUR_OF_DAY) >= 17))
				return false;
			return true;

		case oneday:
			if ((date.get(Calendar.HOUR_OF_DAY) < 9) || (date.get(Calendar.HOUR_OF_DAY) >= 17))
				return false;
			return true;

		case twodays:
			for (int i = 0; i < 2; i++) {
				if ((date.get(Calendar.HOUR_OF_DAY) < 9) || (date.get(Calendar.HOUR_OF_DAY) >= 17)) {
					date.add(Calendar.DAY_OF_YEAR, 1);
					continue;
				}
				return true;
			}
			return false;

		default:
			return false;

		}
	}


}
