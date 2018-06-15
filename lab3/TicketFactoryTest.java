package lab3;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicketFactoryTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		TicketFactory ticket = new TicketFactory();
	    Skipass skipass;
	    skipass = ticket.print(Skipass.type.Work, "night");
	    Assert.assertEquals(skipass, null);
	    skipass = ticket.print(Skipass.type.Weekend, "ten");
	    Assert.assertNotEquals(skipass, null);
	    Assert.assertNotEquals(skipass.getId(), 0);
	    ticket.blocked(skipass);
	    Assert.assertEquals(skipass.isStatusBlocked(), true);
	            
	    }
	}

