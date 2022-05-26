import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 5555;
		assertEquals(expected, actual);
	}
	@Test
	public void testSubtract() {
		int a = 1000;
		int b = 999;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testMultiply() {
		int a = 1111;
		int b = 8;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		int expected = 8888;
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide() {
		int a = 9999;
		int b = 1111;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 9;
		assertEquals(expected, actual);
	}
	@Test(expected=ArithmeticException.class)
	public void testDivide1() {
		int a = 9999;
		int b = 0;

		Calculator cal = new Calculator();
		int actual = cal.divide1(a, b);
		
	}



	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}



}
