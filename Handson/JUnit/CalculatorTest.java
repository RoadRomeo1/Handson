package junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAddition() {
		Calculator c=new Calculator();
		System.out.println("Inside testAddition Method...");
       assertEquals(5, c.addition(2, 3));
	 }

	@Test
	public void testSubstraction() {
		Calculator c=new Calculator();
		System.out.println("Inside testSubstractio  Method...");
		assertEquals(20,c.substraction(100,80));
	}

	}
