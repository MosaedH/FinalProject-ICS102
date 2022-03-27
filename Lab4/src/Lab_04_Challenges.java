import java.util.Scanner;
public class Lab_04_Challenges {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--- Challenge 1 ---\n");
		
		System.out.print("Hello. What is your name? ");
		String name = scanner.nextLine();
	
		System.out.print("Hi, "+ name + " How old are you? ");
		int age = scanner.nextInt();
		
		int add5years = age + 5;
		int sub5years = age - 5;
		
		System.out.println("Did you know that in five years you will be "+ add5years +" years old?");
		System.out.println("And five years age you were "+ sub5years + "! Imagine that");
	
	
		System.out.println("\n --- Challenge 2 ---\n");

		System.out.print("Please enter your height in meters: ");
		double height = scanner.nextDouble();
		System.out.print("Please enter your weight in kg:");
		double weight = scanner.nextDouble();
		
		double BMI = weight / (height * height)
				;
		
		System.out.println("Your BMI is: "+ BMI);
	
	}
	
}
