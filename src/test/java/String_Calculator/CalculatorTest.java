package is.ru.stringcalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

	//Test input of an empty string
	@Test
	public void testEmptyString()
	{
		assertEquals(0, Calculator.add(""));
	}
}