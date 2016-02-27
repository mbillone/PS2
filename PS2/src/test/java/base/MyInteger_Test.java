package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	static MyInteger myTest;
	static MyInteger myInt;
	static MyInteger myNum;
	static MyInteger myVal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		myTest = new MyInteger(1);
		myInt = new MyInteger(18);
		myNum = new MyInteger(1);
		myVal = new MyInteger(3);		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
	}

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void testIsEven() {

                int iIntegerTestValue = 2;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = true;
		boolean bActualResult = instance.isEven();
		assertEquals("testIsEven() failed",bExpectedresult,bActualResult);
	}
	@Test
	public void testIsOdd() {

                int iIntegerTestValue = 3;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = true;
		boolean bActualResult = instance.isOdd();
		assertEquals("testIsOdd() failed",bExpectedresult,bActualResult);
	}
		@Test
		public void testIsPrime() {

	                int iIntegerTestValue = 1;
			MyInteger instance = new MyInteger(iIntegerTestValue);
			boolean bExpectedresult = true;
			boolean bActualResult = instance.isPrime();
			assertEquals("testIsPrime() failed",bExpectedresult,bActualResult);
		}
	@Test
	public void isEvenIntTest(){
		assertFalse(MyInteger.isEven(25));
		assertTrue(MyInteger.isEven(4));
	}
	@Test
	public void isOddIntTest()
	{
		assertTrue(MyInteger.isOdd(7));
		assertFalse(MyInteger.isOdd(10));		
	}
	@Test
	public void isPrimeIntTest()
	{
		assertTrue(MyInteger.isPrime(1));
		assertFalse(MyInteger.isPrime(12));
	}
	@Test
	public void isEvenMyIntegerTestTrue()
	{
		boolean bExpectedresult = true;
		boolean bActualResult = MyInteger.isEven(myInt);
		assertEquals("testIsEven() failed", bExpectedresult, bActualResult);
	}
	@Test
	public void isEvenMyIngeterTestFalse()
	{
		boolean bExpectedresult = false;
		boolean bActualResult = MyInteger.isEven(myTest);
		assertEquals("testIsEven() failed", bExpectedresult, bActualResult);
	}
	@Test
	public void isOddMyIntegerTestTrue()
	{
		boolean bExpectedresult = true;
		boolean bActualResult = MyInteger.isOdd(myTest);
		assertEquals("testIsOdd() failed", bExpectedresult, bActualResult);
	}
	@Test
	public void isOddMyIntegerTestFalse()
	{
		boolean bExpectedresult = false;
		boolean bActualResult = MyInteger.isOdd(myInt);
		assertEquals("testIsOdd() failed", bExpectedresult, bActualResult);
	}
	@Test
	public void isPrimeMyIntegerTestTrue()
	{
		boolean bExpectedresult = true;
		boolean bActualResult = MyInteger.isPrime(myTest);
		assertEquals("testIsPrime() failed", bExpectedresult, bActualResult);
	}
	@Test
	public void isPrimeMyIntegerTestFalse()
	{
		boolean bExpectedresult = false;
		boolean bActualResult = MyInteger.isPrime(myInt);
		assertEquals("testIsPrime() failed", bExpectedresult, bActualResult);
	}
	@Test
	public void equalsTestTrue(){
		boolean bExpectedresult = true;
		boolean bActualResult = myInt.equals(18);
		assertEquals("testisEqual() failed", bExpectedresult, bActualResult);
	}
	@Test
	public void equalsTestFalse(){
		boolean bExpectedresult = false;
		boolean bActualResult = myTest.equals(2);
		assertEquals("testisEqual() failed", bExpectedresult, bActualResult);
	}
	@Test
	public void equalsMyIntegerTestTrue(){
		assertTrue(myTest.equals(myNum));
	}
	@Test
	public void equalsMyIntegerTestFalse(){
		assertFalse(myTest.equals(myVal));
	}
}	


