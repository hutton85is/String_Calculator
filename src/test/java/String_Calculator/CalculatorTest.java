package String_Calculator;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

	//Test : input of an empty string
	@Test
	public void test_add_EmptyString()
	{
		assertEquals(0, Calculator.add(""));
	}

	//Test : input of a single value
	@Test
	public void test_add_one_value()
	{
		assertEquals(1,Calculator.add("1"));
	}

	//Test : obtaining result of addition of 
	//a single element in an array
	@Test
	public void test_sum_zero()
	{
		int[] a = {0};
		assertEquals(0,Calculator.sum(a));
	}

	//Test : summing three elements of an array
	@Test
	public void test_sum_multiple_numbers()
	{
		int[] a = {1,2,3};
		assertEquals(6,Calculator.sum(a));
	}

	//Test : turn empty string into an integer array
	@Test
	public void test_strtoint_emptyvalue()
	{
		int[] arr = {0};
		assertArrayEquals(arr,Calculator.strtoint(""));
	}

	//Turn string with one number to array
	@Test
	public void test_strtoint_onenumber()
	{
		int[] arr = {1};
		assertArrayEquals(arr,Calculator.strtoint("1"));
	}

	//Test : turn string with two numbers "1,2" to integer array
	@Test
	public void test_strtoint_twonumbers()
	{
		int[] arr = {1,2};
		assertArrayEquals(arr,Calculator.strtoint("1,2"));
	}

	//Test : turn string with 4 numbers "1,2,0,4"=[1,2,0,4] to integer array
	@Test
	public void test_strtoint_fournumbers()
	{
		int[] arr = {1,2,0,4};
		assertArrayEquals(arr,Calculator.strtoint("1,2,0,4"));
	}

	//Test : turn string inclduing new line to integer array "1,\n2,3" = [1,2,3]
	@Test
	public void test_strtoint_newline()
	{
		int[] arr = {1,2,3};
		assertArrayEquals(arr,Calculator.strtoint("1,2\n,3"));
	}

	//Test : test add function with "1,2,4"
	@Test
	public void test_add_multiplenumbers()
	{
		assertEquals(7,Calculator.add("1,2,4"));
	}

	//Test : test add function with "\n4,2,3\n,1,0"
	@Test
	public void test_add_newline()
	{
		assertEquals(10,Calculator.add("\n4,2,3\n,1,0"));
	}
}
