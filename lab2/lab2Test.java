package lab2;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class lab2Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindNumberNull() {
		int a = enterDigit();
		int expectedResult = 17;
		int result = lab2.findNumberNull(a);
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	void testFindNumberOne() {
		int a = enterDigit();
		int expectedResult = 23;
		int result = lab2.findNumberOne(a);
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	void testFindSimple() {
		int a = enterDigit();
		int expectedResult = 3;
		int result = lab2.findSimple(a);
		Assert.assertEquals(expectedResult, result);
	}
	
	private int enterDigit() {
		int a = 25;
		return a;
	}

}
