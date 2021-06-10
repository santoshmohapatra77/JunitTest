package myCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void add() {
		
		Calculate addNum = new Calculate();
		int result = addNum.addNumber(10,20);
		assertEquals(30, result);

	}

}
