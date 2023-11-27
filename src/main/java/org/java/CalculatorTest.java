package org.java;

import org.java.pojo.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static Calculator c;
	
	@BeforeEach
	public static void setup() {
		c = new Calculator(3.4f, 5.8f);
	}
	

}
