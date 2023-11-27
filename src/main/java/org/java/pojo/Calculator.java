package org.java.pojo;

public class Calculator {
	private float num1;
	private float num2;
	
	public Calculator(float num1, float num2) {
		setNum1(num1);
		setNum2(num2);
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	public float getSomma(float num1, float num2) {
		System.out.println("Risultato: ");
		return getNum1() + getNum2();
	}
	
	public float getSottrazione(float num1, float num2) {
		System.out.println("Risultato: ");
		return getNum1() - getNum2();
	}
	
	public float getDivisione(float num1, float num2) throws Exception{
		System.out.println("Risultato: ");
		if(num2 == 0) {
			throw new Exception("Non puoi dividere il numero per 0");
		}
		return getNum1() / getNum2();
	}
	
	public float getMoltiplicazione(float num1, float num2) {
		System.out.println("Risultato: ");
		return getNum1() * getNum2();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Calcoli: " + "\n"
				+ "Primo numero: " + getNum1() + "\n"
				+ "Secondo numero: " + getNum2();
	}
}
