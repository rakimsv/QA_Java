import org.junit.Test;

import com.nationwide.calculator.Calculator;

import static org.junit.Assert.assertEquals;
public class Calculator_Test {
@Test
public void multiplicationTest() {
	Calculator calc = new Calculator();
	assertEquals("Multiply failed",8,calc.multiply(2,4));
	}
@Test
public void addTest() {
	Calculator calc = new Calculator();
	assertEquals("Add failed",15,calc.add(7,8));
	}
@Test
public void subtractTest() {
	Calculator calc = new Calculator();
	assertEquals("Subtract failed",4,calc.subtract(8,4));
	}
@Test
public void divideTest() {
	Calculator calc = new Calculator();
	assertEquals("Divide failed",3,calc.divide(15,5));
	}
}