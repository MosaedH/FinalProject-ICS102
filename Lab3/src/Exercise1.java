/*
 * Title: increment and decrement operators + String Methods
 * LAB "3"
 * Student name: Mosaed Saud Alhmwan
 * Student ID: 202007161
 */

public class Exercise1 {

	public static void main(String[] args) {
//		int value1 = 5;
//		int value2 = 6;
//		int result = value2 + ++value1;
//		int result1 = value2 + value1;
		
//		++value "Add and print"
//		value++ "Print and add"
		
		
//		System.out.println(value1--);
//		System.out.println(--value1);
//		System.out.println(--value1);
//		System.out.println(value1);

//		System.out.println("Result= " + result);
//		System.out.println("Value1= " + value1);
//		System.out.println("Result1= " + result1++);
//		System.out.println("Result1= " + result1);
	
	
//		String name1 = "Hello ";
//		String name2 = "I am Mosaed";
//		String name3 = "I love Programming in java";
//		String name4;
//		String name5 = "           Mos  aed              ";
//		String name6 = "mosaed";
//		String name7 = "Mosaed";
		

//		System.out.println(name1.length());
//		name4 = name1 + name2;
//		System.out.println(name4);
//		System.out.println(name1.toLowerCase());
//		System.out.println(name1.toUpperCase());
//		System.out.println(name5.trim());
//		System.out.println(name3.indexOf("Programming"));
//		System.out.println(name3.lastIndexOf("in"));
//		System.out.println(name6.equals(name7));
//		System.out.println(name6.equalsIgnoreCase(name7));
//		System.out.println(name3.substring(7, 18));
		
		
//		Lab Exercise 1
		System.out.println("--------Exercise1--------");
		int num = 10;
		
		System.out.println (++num);
		System.out.println (num);
		System.out.println (num++);
		System.out.println (num);
		System.out.println (--num);
		System.out.println (num--);
		System.out.println (num);
		
//		Lab Exercise 2
		System.out.println("--------Exercise2--------");

		String str1 = "  I Love ";
		String str2 = "Programming ";
		String str3 = "in Java. ";
		String str4 = "I am learning computer programming in Java";
		String str5;
		System.out.println("Length method of str1: "+ str1.length());
		str5  =str1 + str2 + str3;
		System.out.println("concatenate of str1, str2, str3: " + str5);
		str2 = str2.toLowerCase();
		System.out.println("toLowerCase method: " +str2);
		str2 = str2.toUpperCase();
		System.out.println("toUpperCase method: " + str2);
		System.out.println("index of Java in str3: "+str3.indexOf("Java"));
		System.out.println("Trim method:4"+str1.trim());
		System.out.println("Substring method: "+ str4.substring(14, 34));
		
//		Lab Challenge1
		System.out.println("--------Challenge1--------");
		
		String name = "Mosaed Alhmwan";
		int year = 2025;
		System.out.println("My name is "+name+" and I will graduate in "+year);
		
//		Lab Challenge2
		System.out.println("--------Challenge2--------");
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight;
		double myWeight;
		
		myName = "Mohammad Ali";
		myAge = 21; // not a lie
		myHeight = 165; // cm
		myWeight = 75.5; // kgs
		myEyes = "Brown";
		myTeeth = "White";
		myHair = "Black";
		double result = myAge + myHeight + myWeight;
		
		System.out.println( "Let's talk about " + myName + "." );
		System.out.println( "He's " + myHeight + " cm tall." );
		System.out.println("He's "+myWeight +" kg heavy.\nActually that's not too heavy.");
		System.out.println("He's got "+myEyes+" eyes and "+myHair+" hair.\nHis teeth are usually "+myTeeth+" depending on the coffee.");
		System.out.println("If we add "+myAge+", "+myHeight+", and "+myWeight+" we get "+ result);
		
	}


}
