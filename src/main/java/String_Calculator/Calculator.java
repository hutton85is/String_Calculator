package String_Calculator;

import java.util.*;

public class Calculator
{
	//recive integer array and return their sum
	public static int sum(int ... a)
	{
		int result = 0;
		//summing all elements of an array
		for (int i = 0; i < a.length; i++)
		{
			result += a[i];
		}
		return result;
	}

	//split string into integer array
	public static int[] strtoint(String s)
	{

		int[] arr = new int[1];
		if (s == "")
		{
			arr[0] = 0;
		}
		else
		{
			arr[0] = Integer.parseInt(s);
		}
		return arr;
	}

	//recieve numbers as text, and return their sum
	public static int add(String text)
	{
		if (text == "")
		{
			return 0;
		}
		int result = Integer.parseInt(text);
		return result;
	}
}