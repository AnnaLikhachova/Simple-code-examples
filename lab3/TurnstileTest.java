package lab3;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TurnstileTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		SkipassWeekends skipass = new SkipassWeekends();
	    skipass.setUsed(10);
	    Turnstile turnstile = new Turnstile(); 
	    for(int i=0;i<10;i++)
	    {
	      Assert.assertNotNull(null, turnstile.accessForTicket(skipass));
	    }
	    Assert.assertTrue(turnstile.accessForTicket(skipass));
	}

}
