package com.cohart20.collection;

//In HashMap, keys are unique but values are not...

import java.util.HashMap;

import com.cohart20.pojo.User;

public class Collection_14Oct {//This is the example of adding multiple values which it will comfortable take...
	public static void main(String[] args) {
		
		HashMap<Integer, String> data = new HashMap<Integer, String>();
		
		data.put(1, "Falguni");
		
		data.put(2, "Ali");
		data.put(3, "Angella");
		data.put(4, "Ali");
		
		System.out.println("the size is "+data.size());
		
		System.out.println(data.get(2));
		System.out.println(data.get(4));
		
	}
}


//import java.util.HashMap;
//
//import com.cohart20.pojo.User;
//
//public class Collection_14Oct {//This is the example of trying to add mulitple keys but will ended up replacing the previous entry with the new entry... 
//	public static void main(String[] args) {
//		
//		HashMap<Integer, String> data = new HashMap<Integer, String>();
//		
//		data.put(1, "Falguni");
//		
//		data.put(4, "Ali");
//		data.put(3, "Angella");
//		
//		System.out.println(data.get(4));
//		
//		data.put(4, "Danielle");//Since keys are unique in Map' implementation classes and here I am trying to give the key which is already
//								//saved with Ali as value. So if you try to put any entry with the repeating key so it wont deny even to see 
//								//but this new enetry with the duplicate key will over-write or replace the previous entry with the new value if
//								//new entry has new value in it. As you can see in the same example that "Ali" as value stored with key as "4"
//								//and after that I tried to save "Danielle" as value but with the duplicate key which Ali has already blocked.
//								//So Danielle will replace the Ali as value...
//		
//		System.out.println(data.get(4));
//	}
//}


//import java.util.HashMap;
//
//import com.cohart20.pojo.User;
//
//public class Collection_14Oct {
//	public static void main(String[] args) {//This is the example of key as String and value as String...
//		
//		HashMap<Integer, User> users = new HashMap<Integer, User>();
//		
//		User user1 = new User("Hafeez", "Haider");
//		User user2 = new User("Ali", "Mohommad");
//		User user3 = new User("Danielle", "Abc");
//		
//		users.put(1000, user1);
//		users.put(1001, user2);
//		users.put(1002, user3);
//	}
//}

//import java.util.HashMap;
//
//public class Collection_14Oct {
//	public static void main(String[] args) {//This is the example of key as String and value as String...
//		
//		HashMap<String, String> candidates = new HashMap<String, String>();
//		
//		candidates.put("Danielle", "Cohart20");
//		candidates.put("Ali", "Cohart21");
//		candidates.put("Hafeez", "Cohart20");
//		
//		System.out.println(candidates.get("Ali"));	
//	}
//}

//import java.util.HashMap;
//
//public class Collection_14Oct {
//	public static void main(String[] args) {//This is the example of key as Integer and value as String...
//		
//		HashMap<Integer, String> candidates = new HashMap<Integer, String>();
//		
//		candidates.put(1, "Falguni");
//		candidates.put(2, "Ali");
//		candidates.put(3, "Angella");
//		
//		candidates.put(4, "Danielle");
//		
//		System.out.println(candidates.get(3));//This get method takes key as an argument. So I passed 3 and got Angella in return...
//		System.out.println(candidates.get(100));//This 100 key does not exist in Hashmap and returned me null...
//	}
//}


//import java.util.HashMap;
//
//public class Collection_14Oct {//below is the program in which you made HashMap without generic and which is not the right way to create 
//								//any collection...
//	
//	public static void main(String[] args) {
//		
//		HashMap data = new HashMap();
//		
//		data.put(1, "Falguni");
//		data.put("Falguni", "Patel");
//		
//		data.put(false, 1000);		
//	}
//}


//import java.util.ArrayList;
//
//import com.cohart20.pojo.Candidate;
//
//public class Collection_14Oct {
//	
//	public static void main(String[] args) {
//		
//		Candidate c1 = new Candidate(1, "Falguni");
//		Candidate c2 = new Candidate(2, "Ali");
//		Candidate c3 = new Candidate(3, "Gedas");
//		Candidate c4 = new Candidate(4, "Judith");
//		
//		ArrayList<Candidate> candidates = new ArrayList<Candidate>();
//		
//		candidates.add(c1);   candidates.add(c2);  candidates.add(c3);   candidates.add(c4);
//		
//		for(Candidate candidate : candidates) {
//			
//			System.out.println("You Roll Number is "+candidate.getRollNo()+ " and the Name is " +candidate.getName());
//		}	
//	}
//}

//import java.util.ArrayList;
//
//public class Collection_14Oct {//Map Interface and its implementation classes say I take data in the form of key-value pair...
//								//So before moving to HashMap, we should know the other options even though other options are little tricky 
//								//and complex. Below is the task which we need to do..
//	
//	//So I have 4 candidates holding their RollNumbers and Names such as ---
//	//RollNo 1 belongs to candidate Name Falguni
//	//RollNo 2 belongs to candidate Name "Judith"
//	//RollNo 3 belongs to candidate Name "Ali"
//	//RollNo 4 belongs to candidate Name "Hafeez"
//	//So I created 2 ArrayList, one is holding all the roll numbers and another is holding all the names. And I could have chosen HashSet at
//	//place of ArrayList but I did not since I want both the collections for RollNos and names to maintain the order but HashSet wont fit 
//	//in this situation and below is the implemented code.....and this is one of the way without HashMap. Check the another way above or in next
//	//program
//	
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> rollNumbers = new ArrayList<Integer>();
//		ArrayList<String> names = new ArrayList<String>();
//		
//		rollNumbers.add(1);   rollNumbers.add(2);   rollNumbers.add(3);    rollNumbers.add(4);
//		names.add("falguni");    names.add("Ali");   names.add("Gedas");    names.add("Hafeez");
//		
//		for(int i = 0; i < rollNumbers.size(); i++) {
//			
//			System.out.println("Your Roll No is "+rollNumbers.get(i)+" and your Name is "+names.get(i));
//		}	
//	}
//}

//import java.util.HashSet;
//
//public class Collection_14Oct {
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
//		names.add("Jabril");
//		
//		for(String value : names) {
//			System.out.println(value);
//		}	
//		
//		names.remove("Ali");
//		
//		System.out.println("=============after removal===========");
//		
//		for(String value : names) {
//			System.out.println(value);
//		}
//	}
//}


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
