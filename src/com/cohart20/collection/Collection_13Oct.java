package com.cohart20.collection;

import java.util.ArrayList;

public class Collection_13Oct {

	public static void main(String[] args) {


		
		
	}


}

//First write the POJO class for Employees with attributes as empId, fName, lName, email, salary with al the setters and getters,
//parameterized constructor as well as no-arg since no-arg constructor is advised to have even though you do not use it..
//Create 4-5 Employees objects and keep it in the ArrayList. And then, you have to display all the Employees details with their Bonus amount...
//terms to calculate the bonus amount- if user workX is less than 2 years then bonus amount should be 50% of the salary
//if the workX is more than 2 years then the calculated bonus amount would be 100%... 


//import java.util.ArrayList;
//
//public class Collection_13Oct {
//
//	public static void main(String[] args) {
//
//
//		ArrayList<Integer> values = new ArrayList<Integer>();//here I am creating ArrayList object as limited to only Integer...That mean
//														//ArrayList can hold only String elements else will receive syntax error. So
//														// its a good practice to make any Collection with generic type like String
//												//Integer, Human, Polo....
//		
//		values.add(6546);
//		
//		values.add(9879);
//		
//		values.add(23132);
//		
//		for(int i = 0; i < values.size(); i++) {//This is classic for loop
//			
//			System.out.println(values.get(i));
//		}
//		
//		//=================Enhanced for loop for collection iteration=========
//		
//		for(int value : values) {
//			System.out.println(value+10);
//		}
//		
//	}
//
//
//}
//import java.util.ArrayList;
//
//public class Collection_13Oct {
//
//	public static void main(String[] args) {
//
//
//		ArrayList<String> values = new ArrayList<String>();//here I am creating ArrayList object as limited to only String...That mean
//														//ArrayList can hold only String elements else will receive syntax error. So
//														// its a good practice to make any Collection with generic type like String
//														//Integer, Human, Polo....
//
////		values.add(1212); //this line is illegal here since I have created ArrayList object generic String so I must not add any other type
//							//of data...
////
////		values.add(true);//This is illegal also
//
//		values.add("Gedas");     values.add("Adam");
//
//		for(int i = 0; i < values.size(); i++) {
//
//			System.out.println(values.get(i));
//		}
//
//		values.set(1, "Ali");//set(int index, Element e) is used to replace op over-write the element in the middle of the 
//								//ArrayList since the first argument of the set() method takes index and the second argument as the 
//								//Element which you wish to add. So it will take the place of the pre-occupied index by over-writing it.... 
//
//		for(int i = 0; i < values.size(); i++) {
//
//			System.out.println(values.get(i));
//		}
//	}
//}

//import java.util.ArrayList;
//
//public class Collection_13Oct {
//
//	public static void main(String[] args) {
//
//
//		ArrayList values = new ArrayList();
//
//		values.add(1212);   
//
//		values.add(true);
//
//		values.add("Gedas");     values.add("Adam");
//
//		for(int i = 0; i < values.size(); i++) {
//
//			System.out.println(values.get(i));
//		}
//
//		values.set(1, "Ali");//set(int index, Element e) is used to replace op over-write the element in the middle of the 
//								//ArrayList since the first argument of the set() method takes index and the second argument as the 
//								//Element which you wish to add. So it will take the place of the pre-occupied index by over-writing it.... 
//
//		for(int i = 0; i < values.size(); i++) {
//
//			System.out.println(values.get(i));
//		}
//	}
//}


//import java.util.ArrayList;
//
//public class Collection_13Oct {
//
//	public static void main(String[] args) {
//
//
//		ArrayList values = new ArrayList();
//
//		values.add(1212);   
//
//		values.add(true);
//
//		values.add("Gedas");     values.add("Adam");
//
//		for(int i = 0; i < values.size(); i++) {
//
//			System.out.println(values.get(i));
//		}
//
//		values.add(1, "Ali");//add(int index, Element e) is overloaded method which is used to add the element in the middle of the 
//								//ArrayList since the first argument of the add() method takes index and the second argument as the 
//								//Element which you wish to add. So it will take the place of the pre-occupied index and the previous 
//								//pre-cccupying element will move or shift one step back with all the subsequent elements in the list... 
//
//		for(int i = 0; i < values.size(); i++) {
//
//			System.out.println(values.get(i));
//		}
//	}
//}

//import java.util.ArrayList;
//
//public class Collection_13Oct {
//	
//	public static void main(String[] args) {
//		
//		
//		ArrayList values = new ArrayList();
//		
//		values.add(1212);   
//		
//		values.add(true);
//		
//		values.add("Gedas");     values.add("Adam");
//		
////		System.out.println(values.get(0));//Instead of saying sysout over and over, I would prefer loop to work for me since there is 
////		System.out.println(values.get(1));//repetition of task here...Below is the loop to iterate through all the elements of ArrayList
////		System.out.println(values.get(2));
////		System.out.println(values.get(3));
//		
//		for(int i = 0; i < values.size(); i++) {
//			
//			System.out.println(values.get(i));
//		}
//		
//		
//		
//		
//	}
//}


//import java.util.ArrayList;
//
//public class Collection_13Oct {
//	
//	public static void main(String[] args) {
//		
//		
//		ArrayList values = new ArrayList();
//		
//		values.add(1212);   
//		
//		values.add(true);
//		
//		System.out.println(values.get(0));//get() takes int as an argument which means you have to specify the index of ArrayList from
//											//which you wish to fetch data...
//		System.out.println(values.get(1));
//	}
//}


//import java.util.ArrayList;
//
//public class Collection_13Oct {
//	
//	public static void main(String[] args) {
//		
//		
//		ArrayList values = new ArrayList();
//		
//		values.add(1212);   
//		
//		values.add(true);
//		
//		System.out.println(values.size());
//		
//		Integer i = new Integer(1212);
//		
//		values.remove(i);//By this remove(), I want specific element to be removed but not by its index. And I can not give any number 
//						//straight to the argument of remove() since it will be considered that you wish to remove element by its index 
//							//not by the value. So I created the Wrapper class Object first and then I passed to the remove(Object o)
//							//method argument... 
//		
//		System.out.println(values.size());
//	}
//}


//import java.util.ArrayList;
//
//public class Collection_13Oct {
//	
//	public static void main(String[] args) {
//		
//		
//		ArrayList values = new ArrayList();
//		
//		values.add("David");        values.add("Judith");
//		
//		values.add(121212);    values.add(false);
//		
//		System.out.println(values.size());
//		
//		values.remove(1);//remove method is overloaded that means in ArrayList class, you will have 2 remove methods with the same name
//						// but with different argument...
//		
//		System.out.println(values.size());
//	}
//}



//import java.util.ArrayList;
//
//public class Collection_13Oct {
//	
//	public static void main(String[] args) {
//		
//		
//		ArrayList values = new ArrayList();//ArrayList is ordered or all the implementation classes of List interface are ordered such as
//											//ArrayList, Vector and LinkedList...
//		
//		values.add("David");        values.add("Judith");
//		
//		values.add(121212);    values.add(false);
//		
//		System.out.println(values.size());
//		
//		System.out.println(values.isEmpty());
//		
//		values.clear();//clear() is used to delete or empty all the elements of ArrayList....
//		
//		System.out.println(values.isEmpty());	
//	}
//
//}
