package lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	public Person() {
		super();

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void writeInfo() throws FileNotFoundException, IOException {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(createFileName()));) {
			oos.writeObject(createList());
			System.out.println("File has been written");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	public ArrayList<?> readInfo(String file) throws FileNotFoundException, IOException {
		// создадим список объектов, которые будем записывать
		ArrayList<Person> newPeople = new ArrayList<Person>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

			newPeople = ((ArrayList<Person>) ois.readObject());
		} catch (Exception ex) {

			System.out.println(ex.getMessage());
		}

		for (Person p : newPeople)
			System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
		return newPeople;
	}

	public boolean equalObjects(ArrayList<?> arr1, ArrayList<?> arr2) {
		return arr1.equals(arr2);		
	}
	
	public ArrayList<?> createList(){
		// создадим список объектов, которые будем записывать
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person("Tom", 30));
		people.add(new Person("Sam", 33));		
		return people;
		
	}
	
	public String createFileName() {
		return "people.txt";
	}
}
