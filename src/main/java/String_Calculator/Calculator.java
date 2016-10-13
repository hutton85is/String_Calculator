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
		String[] sarr;
		sarr = s.split("[,\\n]");
		
		ArrayList<String> items = new ArrayList<String>(Arrays.asList(sarr));
		items.removeAll(Arrays.asList(null, " ", ""));

		if (items.size() == 0)
		{
			int[] a = new int[1];
			a[0] = 0;
			return a;
		}

		int[] arr = new int[items.size()];

		//enter numbers from string array to integer array
		for (int i = 0; i < items.size(); i++)
		{
			arr[i] = Integer.parseInt(items.get(i));
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