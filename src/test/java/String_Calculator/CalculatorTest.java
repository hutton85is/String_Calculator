package String_Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

	//Test input of an empty string
	@Test
	public void test_EmptyString()
	{
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void test_one_value()
	{
		assertEquals(1,Calculator.add("1"));
	}

	@Test
	public void test_multiple_numbers()
	{
		int[] a = {1,2,3};
		assertEquals(6,Calculator.sum(a));
	}
}