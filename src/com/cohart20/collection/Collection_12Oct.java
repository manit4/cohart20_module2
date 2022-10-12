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



//#1 Prompt message- Press 1 to Register, press 2 for Log-in and Press 0 for terminate the program
//if user presses 1, then you should prompt message- "Press 1 to Register as Admin and press 2 to register as Normal User
	//Irrespective of what he gives you either 1 or 2, you should takes his/her details like username, password, firstName, lastName,
	//email, phone and make sure that username is unique in a table as a primary key. mIf multiple users give same username while 
	//registering then you should prompt the message back that "username is already taken, please choose another" and ask again to give
	//details that means this regsitration process should go into loop until registration is successful...and user should sent back to the main
	//menu which is "Prompt message- Press 1 to Register, press 2 for Log-in and Press 0 for terminate the program"
//#2 if user presses 2, then prompt the message- "you wish to login as Admin the press 1 or 2 for Normal User!!
	//if user presses 1, you should ask you press 1 to display all the books present or press 2 to create book or 0 to terminate the program
	//if presses 1, you should display all the books available in the database
	//if presses 2, you should ask all the books information which admin wishes to add in the database like bookid, bookname, authorname, description
	//after the book is added, you should prompt this message- "press 1 to display all the books present or press 2 to create book or 0 to terminate the
	//program or 4 to go back to the main menu"







