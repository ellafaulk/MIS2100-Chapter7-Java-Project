package Faulk.Ella.Chapter7.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void testThatZeroNumeratorRetunsZero() {
		SimpleMath math1 = new SimpleMath();
		assertEquals(0, math1.divide(0,7),0.001);
	}
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath math2 = new SimpleMath();
		assertEquals(0.25, math2.divide(1,4),0.001);
	}
	@Test(expected=ArithmeticException.class)
	public void testThatZZaroDenominatorThrowsException() {
		SimpleMath math3 = new SimpleMath();
		math3.divide(6,0);
	}
}
