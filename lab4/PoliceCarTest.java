package lab4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class PoliceCarTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testBoarding() {
		PoliceCar police = new PoliceCar();
	    Assert.assertTrue(0 == police.getOccupied());
	    for (int i=0; i<4; i++)
	    {
	    	police.boarding(Human.class);
	      Assert.assertTrue(i + 1 == police.getOccupied());
	    }
	    police.disembarkation(Human.class);
	    Assert.assertTrue(4 == police.getOccupied());
	}

	@Test
	public void testDisembarkation() {
		PoliceCar police = new PoliceCar();
	    Assert.assertTrue(0 == police.getOccupied());
	    for (int i=0; i<4; i++)
	    {
	    	police.boarding(Human.class);
	      Assert.assertTrue(i + 1 == police.getOccupied());
	    }
	    police.disembarkation(Human.class);
	    Assert.assertTrue(4 == police.getOccupied());
	}
	
	 @Test (expected = Exception.class)
	  public void TestBusException() throws Exception
	  {
		PoliceCar police = new PoliceCar();
	    for (int i=0; i<5; i++)
	    {
	    	police.boarding(Human.class);
	    }
	  }


}
