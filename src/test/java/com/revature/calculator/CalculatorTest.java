package com.revature.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {
	private Calculator c;

	@BeforeEach
	public void preliminary() {
		System.out.println("*** BeforeEach ***");
		c = new Calculator();
	}
	@AfterEach
	public void post() {
		System.out.println("*** AfterEach ***");		
	}
	
	@Test
	public void addTest() {
		System.out.println("*** Add Test ***");
		assertEquals(10,c.add(4,6));
	}
	@Test
	public void subtractTest() {
		System.out.println("*** Subtract Test ***");
		assertEquals(-2,c.subtract(4,6));
	}
	@Test
	public void multiplyTest() {
		System.out.println("*** Multiply Test ***");
		assertEquals(24,c.multiply(4,6));
	}
	@Test
	public void divideTest() {
		System.out.println("*** Divide Test ***");
		assertEquals(0,c.divide(4,6));
	}
	@BeforeAll
	public static void start() {
		System.out.println("*** Starting ***");
	}
	@AfterAll
	public static void end() {
		System.out.println("*** Ending ***");
	}
}
