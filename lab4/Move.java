package lab4;

public interface Move<T> {

	public String boarding(Human hum);
	
	public int getMaxSeat();
	
	public int getOccupied();
	
	public String disembarkation(Human hum);

}
