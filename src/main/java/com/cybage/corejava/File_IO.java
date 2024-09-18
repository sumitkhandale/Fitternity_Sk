package com.cybage.corejava;

import java.io.File;
import java.io.IOException;

public class File_IO {
	public static void main(String[] args) throws IOException {
		File f = new File("E:\\hello.txt");
		f.createNewFile();
		System.out.println("File is created..");
		if(f.exists()) {
			System.out.println("File delete: "+f.delete());
			System.out.println("File name: "+f.getName());
			System.out.println("File Location: "+f.getAbsolutePath());
			System.out.println("File readable: "+f.canRead());
			System.out.println("File writable: "+f.canWrite());
			System.out.println("File length: "+f.length());
//			System.out.println("File delete: "+f.delete());
		}
	}
}
