package lab4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BusTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testBoarding() {
		Bus bus = new Bus();
	    Assert.assertTrue(0 == bus.getOccupied());
	    for (int i=0; i<24; i++)
	    {
	      bus.boarding(Human.class);
	      Assert.assertTrue(i + 1 == bus.getOccupied());
	    }
	    bus.disembarkation(Human.class);
	    Assert.assertTrue(24 == bus.getOccupied());
	}

	@Test
	public void testDisembarkation() {
		Bus bus = new Bus();
	    Assert.assertTrue(0 == bus.getOccupied());
	    for (int i=0; i<25; i++)
	    {
	      bus.boarding(Human.class);
	      Assert.assertTrue(i + 1 == bus.getOccupied());
	    }
	    bus.disembarkation(Human.class);
	    Assert.assertTrue(23 == bus.getOccupied());
	}
	
	 @Test (expected = Exception.class)
	  public void TestBusException() throws Exception
	  {
	    Bus bus = new Bus();
	    for (int i=0; i<25; i++)
	    {
	      bus.boarding(Human.class);
	    }
	  }

}
