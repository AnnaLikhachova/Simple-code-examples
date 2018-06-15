package lab4;

public class MainGo {

	public static void main(String[] args) {

		Human<Fireman> fireman = new Human<Fireman>();

		Vehicle<PoliceCar> policecar = new Vehicle<PoliceCar>();
		System.out.println(policecar.boarding(fireman));
		
		Policeman policeman = new Policeman();
		FireEngine fireengine = new FireEngine();
		
		System.out.println(fireengine.boarding(policeman));
	}

}
