package lab3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SkipassSeason extends Skipass{
	private String name = "Ticket for season";
	private int id;
	private boolean statusBlocked;
	
	public SkipassSeason() {
		super();
		setId();
		isStatusBlocked();
	}

	public boolean isStatusBlocked() {
		return statusBlocked;
	}

	public void setStatusBlocked(boolean statusBlocked) {
		this.statusBlocked = statusBlocked;
	}

	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "SkipassSeason [name=" + name + ", id=" + id + ", statusBlocked=" + statusBlocked + "]";
	}

	@Override
	public boolean valid() {
		
		if(id != 0) return true;
		
		GregorianCalendar date = new GregorianCalendar();
		for (int i = 0; i <= date.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			if ((date.get(Calendar.HOUR_OF_DAY) < 9) || (date.get(Calendar.HOUR_OF_DAY) >= 17)) {
				date.add(Calendar.DAY_OF_YEAR, 1);
				continue;
			}
			return true;
		}
		return false;
	}

	@Override
	public int getUsed() {
		return 0;
	}

	@Override
	public void setUsed(int i) {

		
	}
}
