package lab4;

public class Bus extends Vehicle<Object> {
	String name = "Bus";
	int seats = 24;
	int occupied = 0;

	public Bus() {

	}
	
	public Bus(String name, int seats, int occupied) {
		this.name = name;
		this.seats = seats;
		this.occupied = occupied;
	}

	
	@Override
	public String toString() {
		return "Bus [name=" + name + ", seats=" + seats + ", occupied=" + occupied + "]";
	}

	@Override
	public String boarding(Class<Human> class1) {
		if (occupied < 25) {
			occupied++;
			return "Person is boarded.";
		} else
			try {
				throw new MyException("Exception."+occupied);
			} catch (MyException e) {
				e.printStackTrace();
			}
		return "No seat available.";

	}

	@Override
	public int getMaxSeat() {
		return seats;
	}

	@Override
	public int getOccupied() {
		return occupied;
	}

	@Override
	public String disembarkation(Class<Human> class1) {
		if (occupied > 0) {
			occupied--;
			return "Person is disembarkated.";
		} else
			try {
				throw new MyException("Exception.");
			} catch (MyException e) {
				e.printStackTrace();
			}
		return "No person in the vehicle.";
	}
}
