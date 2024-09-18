package com.cybage.corejava;

import java.io.File;

public class File_Create {
	public static void main(String[] args) {

		File f = new File("E://hello.txt");
		try {
			if (f.createNewFile()) {
				System.out.println("File is created");

			} else {
				System.out.println("File alreday exists.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Happiness is going to gym daily!!!");
		}

	}

}
