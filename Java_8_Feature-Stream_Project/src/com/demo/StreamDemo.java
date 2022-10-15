package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,80,40,20,100));
		
		//1- filter
		List<Integer> l1 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		//2- mapping
		List<Integer> l2 = list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("\n");
		System.out.println(l2);
		
		//3- collect
		List<Integer> l3 = list.stream().filter(i->i<30).collect(Collectors.toList());
		System.out.println("\n");
		System.out.println(l3);
		
		//4- count()
		long count = list.stream().filter(i->i>30).count();
		System.out.println("\n"+count);
		
		//5- sorted
		//Natural order
		List<Integer> l4 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("\nSorted List - "+l4);
		//Using comparator
		List<Integer> l5 = list.stream().sorted((i1,i2)-> (i1>i2)?1 : (i1<i2)?-1 : 0).collect(Collectors.toList());
		System.out.println("Sorted List - "+l5);
		//Using comparable
		List<Integer> l6 = list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Sorted List - "+l6);
		
		//6- min max methods
		int min = list.stream().min((i1,i2)-> i1.compareTo(i2)).get();
		int max = list.stream().max((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println("\nMinimum Element : "+min);
		System.out.println("Maximum Element : "+max);
		
		//7- forEach
		list.stream().forEach(i-> System.out.println(i));
		System.out.println("\n");
		list.stream().forEach(System.out::println);
		
		//8- toArray
		Integer arr[] = list.stream().toArray(Integer[]::new);
		System.out.println("\n");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
		//9- Stream.Of
		Stream s = Stream.of(list);
		s.forEach(System.out::println);
		
		System.out.println("\n");
		
		Stream s1 = Stream.of(10,100,1000,10000);
		s1.forEach(System.out::println);

	}
}
