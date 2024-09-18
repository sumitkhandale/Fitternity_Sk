package com.cybage.corejava;

public class Fogg {
	public static void main(String[] args) {
		String str = "shraddha";
		String rev = "";
		for(int i = 0;i<str.length();i++) {
			rev = str.charAt(i)  + rev;
			
		}
		System.out.println(rev);
	}
}
