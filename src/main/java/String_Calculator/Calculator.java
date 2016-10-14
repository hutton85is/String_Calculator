package String_Calculator;

import java.util.*;

public class Calculator
{
	//recive integer array and return their sum
	public static int sum(int ... a)
	{
		if (a.length == 1)
		{
			return a[a.length-1];
		}
		return a[0]  + sum(Arrays.copyOfRange(a,1,a.length));
	}

	//split string into integer array
	public static int[] strtoint(String s)
	{
		//Create a list containing a split string where "," and "\\n" is found
		ArrayList<String> items = new ArrayList<String>(Arrays.asList(s.split("[,\\n]")));
		items.removeAll(Arrays.asList(null, ""));

		//if empty string is the input return zero
		if (items.size() == 0)
		{
			int[] a = {0};
			return a;
		}

		//enter numbers from string array to integer array
		int[] arr = new int[items.size()];
		for (int i = 0; i < items.size(); i++)
		{
			arr[i] = Integer.parseInt(items.get(i));
		}

		int[] neg = Arrays.stream(arr).filter(x -> x < 0).toArray();
	
		if (neg.length > 0)
		{
			throw new IllegalArgumentException
			("Negatives not allowed: " + Arrays.toString(neg));
		}
		
		return arr;
	}

	//recieve numbers as text, and return their sum
	public static int add(String text)
	{
		return sum(strtoint(text));
	}
}
