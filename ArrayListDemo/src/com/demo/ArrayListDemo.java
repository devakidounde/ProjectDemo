package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>(Arrays.asList("Java","C#","C++","Angular","Python"));
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
