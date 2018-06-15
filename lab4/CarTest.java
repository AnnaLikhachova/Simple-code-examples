package lab4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class CarTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testBoarding() {
		Car car = new Car();
	    Assert.assertTrue(0 == car.getOccupied());
	    for (int i=0; i<4; i++)
	    {
	    	car.boarding(Human.class);
	      Assert.assertTrue(i + 1 == car.getOccupied());
	    }
	    car.disembarkation(Human.class);
	    Assert.assertTrue(6 == car.getOccupied());
	}

	@Test
	public void testDisembarkation() {
		Car car = new Car();
	    Assert.assertTrue(0 == car.getOccupied());
	    for (int i=0; i<4; i++)
	    {
	    	car.boarding(Human.class);
	      Assert.assertTrue(i + 1 == car.getOccupied());
	    }
	    car.disembarkation(Human.class);
	    Assert.assertTrue(4 == car.getOccupied());
	}
	
	 @Test (expected = Exception.class)
	  public void TestBusException() throws Exception
	  {
		 Car car = new Car();
	    for (int i=0; i<5; i++)
	    {
	    	car.boarding(Human.class);
	    }
	  }

}
