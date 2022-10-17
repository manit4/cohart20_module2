package com.cohart20.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\lasagna\\FirstAssignment.txt");
		
		FileReader reader = new FileReader(file);
		
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		String line = null;
		
		while((line = bufferedReader.readLine()) != null ) {
			System.out.println(line);
		}
		
		
	}	
}

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//
//public class Main {
//	
//	public static void main(String[] args) throws Exception {
//		
//		File file = new File("C:\\lasagna\\FirstAssignment.txt");
//		
//		FileReader reader = new FileReader(file);
//		
//		BufferedReader bufferedReader = new BufferedReader(reader);
//		
//		System.out.println(bufferedReader.readLine());
//		System.out.println(bufferedReader.readLine());
//		System.out.println(bufferedReader.readLine());
//		System.out.println(bufferedReader.readLine());
//		System.out.println(bufferedReader.readLine());
//		
//	}	
//}


//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//
//public class Main {
//	
//	public static void main(String[] args) throws Exception {
//		
//		File file = new File("C:\\lasagna\\writingData.txt");
//		
//		FileWriter writer = new FileWriter(file);
//		
//		char[] chars = {'I', 'a', 'm', 'd', 'o', 'i', 'n', 'g', 'g', 'o', 'o', 'd'}; 
//		
//		writer.write(chars);
//		
//		writer.flush();
//		writer.close();
//	}	
//}

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//
//public class Main {
//	
//	public static void main(String[] args) throws Exception {
//		
//		File file = new File("C:\\lasagna\\writingData.txt");
//		
//		FileWriter writer = new FileWriter(file);
//		
//		writer.write('c');//here we are writing single character to the file...
//		
//		writer.flush();
//		writer.close();
//	}	
//}


//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//
//public class Main {
//	
//	public static void main(String[] args) throws Exception {
//		
//		File file = new File("C:\\lasagna\\FirstAssignment.txt");
//		
//		FileReader reader = new FileReader(file);
//		
//		int value = 0;
//		
//		while((value = reader.read()) != -1) {
//			System.out.print((char)value);
//		}
//	}	
//}

//import java.io.File;
//import java.io.FileReader;
//
//public class Main {
//	
//	public static void main(String[] args) throws Exception {
//		
//		File file = new File("C:\\lasagna\\FirstAssignment.txt");
//		
//		FileReader reader = new FileReader(file);
//		
//		for(int i = 0; i < file.length(); i++) {
//			System.out.print((char)reader.read());
//		}	
//	}	
//}

//import java.io.File;
//import java.io.FileReader;
//
//public class Main {
//	
//	public static void main(String[] args) throws Exception {
//		
//		File file = new File("C:\\lasagna\\FirstAssignment.txt");
//		
//		FileReader reader = new FileReader(file);
//		
//		char readChar = (char)reader.read();
//		
//		System.out.println(readChar);	
//	}	
//}

//import java.io.File;
//import java.io.FileReader;
//
//public class Main {
//	
//	public static void main(String[] args) throws Exception {
//		
//		File file = new File("C:\\lasagna\\FirstAssignment.txt");
//		
//		FileReader reader = new FileReader(file);
//		
//		int value = reader.read();
//		
//		System.out.println(value);
//		
//		char convertedValue = (char)value;
//		
//		System.out.println(convertedValue);	
//	}	
//}
