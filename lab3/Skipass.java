package lab3;

public abstract class Skipass {
	public int id;
	public String name;
	public boolean statusBlocked;
	public enum type {Work, Weekend, Season}
	public type specification;
	public int used;
	
	
	public abstract boolean valid();
	public abstract int getUsed();
	public abstract int getId();
	public abstract boolean isStatusBlocked();
	public abstract void setUsed(int i);
	public abstract void setStatusBlocked(boolean statusBlocked);
	

}
