package lab4;

public class Vehicle<T> implements Move<T> {
	
	String name;
	int seats;
	int occupied;
	
	@Override
	public String boarding(Human hum) {
		occupied++;
		return "Person is boarded.";	
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
		return "Person is disembarkationed.";
		
		
	}

	public String boarding(Class<Human> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public String disembarkation(Class<Human> class1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	


	
	

}
