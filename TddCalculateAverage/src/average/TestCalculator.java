package average;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testAverage() {
		Calculator calculator = new Calculator();
		calculator.addElement(1);
		calculator.addElement(2);
		calculator.addElement(1000);
		
		System.out.println(calculator.average());
		assertEquals(334.33, calculator.average(), .01);
	}

}
