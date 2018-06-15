package lab4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class FireEngineTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testBoarding() {
		FireEngine fireengine = new FireEngine();
	    Assert.assertTrue(0 == fireengine.getOccupied());
	    for (int i=0; i<6; i++)
	    {
	    	fireengine.boarding(Human.class);
	      Assert.assertTrue(i + 1 == fireengine.getOccupied());
	    }
	    fireengine.disembarkation(Human.class);
	    Assert.assertTrue(6 == fireengine.getOccupied());
	}

	@Test
	public void testDisembarkation() {
		FireEngine fireengine = new FireEngine();
	    Assert.assertTrue(0 == fireengine.getOccupied());
	    for (int i=0; i<6; i++)
	    {
	    	fireengine.boarding(Human.class);
	      Assert.assertTrue(i + 1 == fireengine.getOccupied());
	    }
	    fireengine.disembarkation(Human.class);
	    Assert.assertTrue(6 == fireengine.getOccupied());
	}
	
	 @Test (expected = Exception.class)
	  public void TestBusException() throws Exception
	  {
		 FireEngine fireengine = new FireEngine();
	    for (int i=0; i<8; i++)
	    {
	    	fireengine.boarding(Human.class);
	    }
	  }

}
