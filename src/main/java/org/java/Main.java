package org.java;

import org.java.pojo.Calculator;

public class Main {
	public static void main(String[] args) {
		Calculator calcolo = new Calculator(3.7f, 9.8f);
		
		System.out.println(calcolo);
		System.out.println(calcolo.getSomma(3.8f, 10.23f));
		System.out.println(calcolo.getSottrazione(2.4f, 8.9f));
		System.out.println(calcolo.getDivisione(4.3f, 7.9f));
		System.out.println(calcolo.getMoltiplicazione(3.5f, 8.9f));
	}
}
