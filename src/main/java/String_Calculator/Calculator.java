package String_Calculator;

import java.util.*;

public class Calculator
{
	//recieve integer array and return their sum
	public static int sum(int ... a)
	{
		if (a.length == 1)
		{
			return a[a.length-1];
		}
		return a[0]  + sum(Arrays.copyOfRange(a,1,a.length));
	}

	//if negative numbers exist, throw an exception
	public static void is_it_negative(int ... arr)
	{
		int[] neg = Arrays.stream(arr).filter(x -> x < 0).toArray();
		if (neg.length > 0)
		{
			throw new IllegalArgumentException
			("Negatives not allowed: " + Arrays.toString(neg));
		}
	}

	//split string into integer array
	public static int[] strtoint(String s)
	{
		//Create a list containing a split string where "," and "\\n" is found
		String splitter = "[,\n]";
		//if string starts with "//" then assign the next character as new delimiter
		if (s.startsWith("//"))
		{
			splitter = "[" + s.substring(2,3) + "\\" + "n]";
			System.out.println(s);
			s = s.substring(2,s.length());
		}

		ArrayList<String> items = new ArrayList<String>
		(Arrays.asList(s.split(splitter)));

		items.removeAll(Arrays.asList(null, ""));

		//if empty string is the input return zero
		if (items.size() == 0)
		{
			int[] a = {0};
			return a;
		}

		//creating an integer array out of numbers from string array
		int[] arr = new int[items.size()];
		for (int i = 0; i < items.size(); i++)
		{
			arr[i] = Integer.parseInt(items.get(i));
			//number cannot be greater than 1000
			if (arr[i] > 1000)
			{
				arr[i] = 0;
			}
		}

		//checking for a negative number
		is_it_negative(arr);

		return arr;
	}

	//recieve numbers as text, and return their sum
	public static int add(String text)
	{
		return sum(strtoint(text));
	}
}