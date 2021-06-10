package myCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class subtractTest {

	@Test
	public void sub() {

		Calculate sub = new Calculate();
		int result = sub.subtractNumber(30, 20);
		assertEquals(10, result);
		
	}

}
