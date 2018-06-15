package lab4;

public class PoliceCar extends Vehicle<Object>{
	String name = "PoliceCar";
	int seats = 4;
	int occupied=0;	
	
	public PoliceCar() {

	}
	
	public PoliceCar(String name, int seats, int occupied) {
		super();
		this.name = name;
		this.seats = seats;
		this.occupied = occupied;
	}

	@Override
	public String toString() {
		return "PoliceCar [name=" + name + ", seats=" + seats + ", occupied=" + occupied + "]";
	}

	@Override
	public String boarding(Human hum) {
		
		if(occupied<6) {
			if(hum instanceof Policeman) {
				occupied++;
				return "Fireman is boarded.";			
			}else return "Person is not a fireman and can not be boarded.";
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
		if(occupied>0) {
			if(hum instanceof Policeman) {
				occupied--;
				return "Policeman is disembarkated.";			
			}else return "Person is not a policeman and can not be disembarkated.";
		} else
			try {
				throw new MyException("Exception.");
			} catch (MyException e) {
				e.printStackTrace();
			}
		return "No person in the vehicle.";	
		
	}
}
