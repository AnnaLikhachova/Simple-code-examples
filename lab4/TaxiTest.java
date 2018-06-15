package lab4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TaxiTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testBoarding() {
		Taxi taxi = new Taxi();
	    Assert.assertTrue(0 == taxi.getOccupied());
	    for (int i=0; i<4; i++)
	    {
	    	taxi.boarding(Human.class);
	      Assert.assertTrue(i + 1 == taxi.getOccupied());
	    }
	    taxi.disembarkation(Human.class);
	    Assert.assertTrue(6 == taxi.getOccupied());
	}

	@Test
	public void testDisembarkation() {
		FireEngine fireengine = new FireEngine();
	    Assert.assertTrue(0 == fireengine.getOccupied());
	    for (int i=0; i<4; i++)
	    {
	    	fireengine.boarding(Human.class);
	      Assert.assertTrue(i + 1 == fireengine.getOccupied());
	    }
	    fireengine.disembarkation(Human.class);
	    Assert.assertTrue(4 == fireengine.getOccupied());
	}
	
	 @Test (expected = MyException.class)
	  public void TestBusException() throws Exception
	  {
		 FireEngine fireengine = new FireEngine();
	    for (int i=0; i<5; i++)
	    {
	    	fireengine.boarding(Human.class);
	    }
	  }

}
