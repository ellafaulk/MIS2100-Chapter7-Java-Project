package Faulk.Ella.Chapter7.Java.Project;


public class SimpleMath {
	public double numerator;
	public double denominator;

	public double divide(double numerator,double denominator) {
		if(denominator==0) {
			throw new ArithmeticException();
	}
		double result = numerator/denominator;
		return result;
	}
}
