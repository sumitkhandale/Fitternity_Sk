package com.cybage.corejava;

public class Energy {
	public static void main(String[] args) {
		
//		int s = 100 , k = 200 ;
//		System.out.println("Before Swapping : "+s + " "+k);
//		
//		s = s + k;
//		k = s - k;
//		s = s  - k;
//		System.out.println("After Swapping : "+s + " "+k);
		
		int a = 150 , b = 200 ,temp=0;
		
		System.out.println("Before Swapping : "+a + " "+b);
		temp = a ; 
		a = b;
		b = temp ; 
		System.out.println("After Swapping : " +a + " "+b);
	}
}
