package com.cybage.corejava;

public class GBP {
	public static void main(String[] args) {
		try {
			throw new TestException("This is my custom exception!!!");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
//			System.out.println(e);
//			e.printStackTrace();
		}
	}
}
