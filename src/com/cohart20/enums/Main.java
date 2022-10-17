package com.cohart20.enums;

enum Beer {
	
	FOSTER(5, "yellowish"), MAGNUM(7, "Orange"), kINGFISHER(4, "black");
	
	int price;
	String color;
	
	Beer(int price, String color) {
		this.price = price;
		this.color = color;
	}
}

enum Month {
	JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);
	
	int days;
	
	Month(int days) {
		this.days = days;
	}
}



public class Main {
	
	public static void main(String[] args) {
		
		Beer b1 = Beer.FOSTER;
		
		System.out.println(b1.price);
		System.out.println(b1.color);
		
	//Beer b = new Beer(12, "34534");//This is illegal which means you can not create object of enum no matter whether it is no-arg constructor ot with parameterized constructor
	
		Month m1 = Month.JANUARY;
		
		System.out.println(m1.days);
		

	}
}


//public class Main {
//
//	enum Direction {//You can declare enum in the class itself and this is legal...
//
//		EAST, WEST, NORTH, SOUTH;
//	}
//	
//	public static void main(String[] args) {
//
//		Direction d = Direction.EAST;//Accessing enum values will be same even if you declare enum inside the class itself
//
//	}
//}


//enum Direction {
//
//
//	EAST, WEST, NORTH, SOUTH;
//}
//
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Direction[] directions = Direction.values();
//
//		for(Direction direction : directions) {
//
//			System.out.println(direction);
//		}
//
//	}
//}


//enum Direction {
//
//	
//	EAST, WEST, NORTH, SOUTH;
//}
//
//
//public class Main {
//
//	public static void main(String[] args) {
//
//	Direction w1 = Direction.WEST;
//	Direction w2 = Direction.EAST;
//	Direction w3 = Direction.NORTH;
//	Direction w4 = Direction.SOUTH;
//	
//	System.out.println(w1);
//	System.out.println(w2);
//	System.out.println(w3);
//	System.out.println(w4);
//
//	}
//
//}


//enum Direction {
//
//	//east, west, north, south;//This is legal but not the right way
//	//East, West, North, South;//This is also legal but again not right way to declare them
//	EAST, WEST, NORTH, SOUTH;//This is legal as well as right way to do it...
//	//All the values of enums are public static and final...
//}
//
//
//public class Main {
//
//	public static void main(String[] args) {
//
//	Direction w = Direction.WEST;//This is how we access the values of Enums. Since values of enums are object/s of the enums such as
//								//if you take Direction enum in which we have defined 4 enums like EAST, WEST, NORTH AND SOUTH SO I can say,
//								//east, west, north and south are the objects of Direction enum and kept or put it in the reference variable
//								//of Direction enum. Moreover, I accessed all the values or constants of enums Direction with the enum name
//								//such as Direction.EAST, Direction.WEST, Direction.North and Direction.SOUTH since the constants/values are public
//								//static and final...
//	
//	System.out.println(w);
//
//	}
//
//}
