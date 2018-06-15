package lab1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lab1Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLessThanAvarage() {
		String[] strings = mockStringArray();
		String[] expectedResult = new String[1];
		expectedResult[0] = "Hello";
		String[] result = lab1.Lab1.lessThanAvarage(strings);
		Assert.assertArrayEquals(expectedResult, result);
	}

	@Test
	public void testFindAvarage() {
		String[] strings = mockStringArray();
		int expectedResult = 4;
		int result = lab1.Lab1.findAvarage(strings);
		assertEquals(expectedResult, result);
	}

	@Test
	public void testLess() {
		String[] strings = mockStringArray();
		String[] expectedResult = new String[1];
		expectedResult[0] = "Hello";
		String result = lab1.Lab1.less(strings);
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testMore() {
		String[] strings = mockStringArray();
		String[] expectedResult = new String[1];
		expectedResult[0] = "Вы поможете мне разобраться в нем?";
		String result = lab1.Lab1.more(strings);
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testMinSymbol() {
		String strings = stringForCharArray();
		String expectedResult = "he";
		String result = lab1.Lab1.minSymbol(strings);
		Assert.assertEquals(expectedResult, result);
	}

	private String[] mockStringArray() {
		String[] strings = new String[3];
		strings[0] = "This is the most incradable occasion I have ever dealt with.";
		strings[1] = "Вы поможете мне разобраться в нем?";
		strings[2] = "Hello";
		return strings;
	}
	
	private String stringForCharArray() {
		String  strings = new String("This was his first time he saw sunrise ");
		return strings;
	}

}
