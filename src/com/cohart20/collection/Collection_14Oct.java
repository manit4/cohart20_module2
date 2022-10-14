package com.cohart20.collection;

import java.util.HashSet;

public class Collection_14Oct {
	
	public static void main(String[] args) {
		
		HashSet<String> names = new HashSet<String>();
		
		names.add("Falguni");
		names.add("Adam");
		names.add("Judith");
		names.add("Ali");
		names.add("Gedas");
		names.add("Jabril");
		
		for(String value : names) {
			System.out.println(value);
		}	
		
		names.remove("Ali");
		
		System.out.println("=============after removal===========");
		
		for(String value : names) {
			System.out.println(value);
		}
	}
}


//import java.util.HashSet;
//
//public class Collection_14Oct {//We have studied one of the implementation class of List which is ArrayList. List Interface and its 
//								//implementation classes say that we are ordered but not sorted that means you will get the elements back
//								//in the order they were inserted...
//								//Today, we are learning one of the implementation classes of Set interface which is HashSet...And the
//								//unique thing about Set and its implementation classes is "It does not support duplicacy" and Set is 
//								//also not ordered that means "you will never get your elements back in the order they were inserted...
//	
//	public static void main(String[] args) {
//		
//		HashSet<String> names = new HashSet<String>();
//		
//		names.add("Falguni");
//		names.add("Adam");
//		names.add("Judith");
//		names.add("Ali");
//		names.add("Gedas");
//		
//		System.out.println(names.size());
//		
//		names.add("Angela");
//		
//		System.out.println(names.size());
//		
//		names.add("Adam");//Element "Adam" will not be inserted again since Adam is already inserted and HashSet does not allow duplicate elements.... 
//		
//		System.out.println(names.size());	
//	}
//}
