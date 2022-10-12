package com.cohart20.collection;

import java.util.ArrayList;

//Good thing about using Collection classes are mentioned below:
//1) It size increases and shrinks dynamically
//2) It has all the utility methods such as if you want all the elements sorted, choose respective class such as HashSet or Set' interface
	//implementation classes or you you wish to maintain order (in short, save elements in the order they were inserted) you should go
	//for ArrayList or List' implementation classes...Other methods like if you wish to clear out or delete all the elements from the 
	//collection so just use the method "clear()", it will delete all the elements from the collection, or if you want to check the
	//size of any collection means how many elements are already saved then use method "size", or if you want to check whether specific 
	//data or element is already present or not then you should use method "contains()" and the return type of contains() is boolean

public class Collection_12Oct {
	
	public static void main(String[] args) {

		ArrayList salaries = new ArrayList();//If you wish to create a collection in which you care more about the order then you should go
											//for List Interface' implementation class. That means, you will get the elements saved in the
											//order they were inserted...In this program , I created ArrayList Collection object and unlike
											//array, I did not specify the size of the ArrayList so it will expand or Shrink dynamically...
		
		salaries.add(3000);// add() of ArrayList is used to add element
		salaries.add(2500);
		salaries.add(6500);
		salaries.add(4300);
		salaries.add("Falguni");//If you notice, all the statements have yellow lone underneath. Just for the information, these yellow lines are
									//not errors but warning which will not effect the program output so you can ignore as of now but will fix
									//this warning yellow lines later...
		salaries.add(false);
		salaries.add(56.87);
		
		salaries.add(3000);// I am adding 3000 again in the ArrayList and I will not complain since ArrayList does not care about duplicates
							// however, it cares only about the order(insertion order)....	
		
		System.out.println(salaries.size());//size() is used to find the no of elements stored in the ArrayList...
		
		System.out.println(salaries.isEmpty());//isEmpty is used to check whether we have any element in the ArrayList or not...
		
		System.out.println(salaries.contains(3000));//contains is the method which is used to check whether some data, element or item
													//is present or not...
		
	}		
}


