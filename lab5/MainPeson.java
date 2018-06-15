package lab5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainPeson {

	public static void main(String[] args) {
		
		Person person = new Person();
		try {
			System.out.println(person.equalObjects(person.createList(),person.readInfo(person.createFileName())));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
