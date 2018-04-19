package polynomial;

import math.Polynomial;

public class Test {
	public static void main(String[] args) {
		LinearPolynomial[] lineararray= new LinearPolynomial[5];
		
		for(int i=0; i<lineararray.length; i++)
		{
			lineararray[i]=new LinearPolynomial(i+1, i+2);
			
		}
			
		for (Polynomial polynomial : lineararray) 
		{
			System.out.println(polynomial);
		}
		drawPolynomialTable(lineararray[4]);
	}
	
	public static void drawPolynomialTable(Polynomial polynomial)
	{
		for(double i=0.1; i <=1; i+=0.1)
		{
			System.out.println(polynomial.calculate(i));
		}
	}
}
