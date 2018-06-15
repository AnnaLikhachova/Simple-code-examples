package lab4;

public class Car extends Vehicle<Object> {
	String name = "Car";
	int seats = 4;
	int occupied = 0;

	public Car() {
	
	}

	public Car(String name, int seats, int occupied) {
		this.name = name;
		this.seats = seats;
		this.occupied = occupied;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", seats=" + seats + ", occupied=" + occupied + "]";
	}

	@Override
	public String boarding(Human hum) {
		if (occupied < 4) {
			occupied++;
			return "Person is boarded.";
		} else
			try {
				throw new MyException("Exception.");
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
	public String disembarkation(Human hum) {
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
