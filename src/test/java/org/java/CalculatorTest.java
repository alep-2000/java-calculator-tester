package org.java;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.java.pojo.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static Calculator c;
		
	@Test
	public void getAddizzioneTest() {
		c = new Calculator(3.4f, 5.4f);
		assertEquals(8.8f, c.getSomma(c.getNum1(), c.getNum2()), "Non ci sono errori" );
	}
	
	@Test
	public void getSottrazioneTest() {
		c = new Calculator(10.5f, 5.5f);
		assertEquals(5f, c.getSottrazione(c.getNum1(), c.getNum2()), "Non ci sono errori" );
	}
	
	@Test
	public void getDivisioneTest() {
		float num1 = 5.5f;
		float num2 = 0;
		c = new Calculator(num1, num2);
		
		assertThrows(Exception.class, 
					()-> c.getDivisione(num1, num2),
					"Eccezione attesa con numero diviso per zero");
	}
	
	@Test
	public void getMoltiplicazioneTest() {
		c = new Calculator(10.5f, 5.5f);
		assertEquals(57.75f, c.getMoltiplicazione(c.getNum1(), c.getNum2()), "Non ci sono errori" );
	}
}
