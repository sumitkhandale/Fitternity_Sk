package com.cybage.corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class K1 {
	public static void main(String[] args) {

		//1.Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
//		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
//		list.stream().filter(q->q%2==0).forEach(deepika->System.out.println(deepika));
		
		
		
		//2.Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		//List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		//myList.stream().map(w->w+"").filter(s->s.startsWith("1")).forEach(System.out::println);
		
		//3.How to find duplicate elements in a given integers list in java using Stream functions?
		
//		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,98,15);
//		Set<Integer> set = new HashSet();
//		myList.stream().filter(s->!set.add(s)).forEach(deepika->System.out.println(deepika));
		
		
		//4.Given the list of integers, find the first element of the list using Stream functions?
		//List<Integer> myList = Arrays.asList(25,54,32,19,12,10,15,8,49,25,98,98,32,15);
		//myList.stream().findFirst().ifPresent(sumit->System.out.println(sumit));
		
		
		//5.Given a list of integers, find the total number of elements present in the list using Stream functions?
//		   List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15,54,32,19,25,77,45,18,67,98,19,20,46);
//		   long count = myList.stream().count();
//		   System.out.println("Total no of elements present in the list is : " + count);
		
		//6.Write a Java 8 program to concatenate two Streams?
		
//		List<String> list1 = Arrays.asList("Java", "8");
//        List<String> list2 = Arrays.asList("explained", "through", "programs");
//        
//        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
//        
//        concatStream.forEach(s->System.out.println(s + " "));
		
		//7.Given a list of integers, find the maximum value element present in it using Stream functions?
		//List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		//int max = myList.stream().max(Integer::compare).get();
		//System.out.println("Maximum value element present in given list is : " + max);
		
		
		//8.Given a list of integers, sort all the values present in it using Stream functions?
//		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//		 myList.stream().sorted().forEach(swami->System.out.println(swami));
		
		//9.Given a list of integers, sort all the values present in it in descending order using Stream functions?
		
//		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//		 myList.stream().sorted(Collections.reverseOrder()).forEach(Shraddha->System.out.println(Shraddha));
		
		
		//10.
		
		String originalStr = "Sumit";
		String rev = "";
		for(int i = 0;i<originalStr.length();i++) {
			rev = rev + originalStr.charAt(i);
//			System.out.println(rev);
		}
		System.out.println(rev);
	}
}
