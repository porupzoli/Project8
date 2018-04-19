package polynomial;

import math.Polynomial;

public class LinearPolynomial implements Polynomial {

	private double a;
	private double b;
	
	
	public LinearPolynomial(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double calculate(double x) {
		return a*x+b;
	}
	
	

	public String toString() {
		return "y=" +a  + "x+" + b +""  ;
	}

	public int getDegree() {
		return 1;
	}

}
