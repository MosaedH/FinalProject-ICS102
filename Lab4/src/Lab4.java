import java.util.Scanner;
public class Lab4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---- Lab Exercise 1 ----\n"); // Lab Exercise 1 Start
		
		System.out.print("Enter the fisrt number: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The sum is " + sum); // Lab Exercise 1 End
		
		
		System.out.println("\n---- Lab Exercise 2 ----\n"); // Lab Exercise 2 Start
		scanner.nextLine(); // We have to make scanner empty to make our code run

		
		System.out.print("Enter Your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter You age: ");
		short age = scanner.nextShort();
		
		System.out.print("Enter Your ID: ");
		int ID = scanner.nextInt();
		
		System.out.print("Are you repeating the Java course (true / false)? ");
		boolean java = scanner.nextBoolean();
	
		System.out.println("\n--- Student Information ---\n");
		
		System.out.println(name + " is " + age + " years old and has ID " + ID);
		System.out.println("is he repeating the Java course? " + java);
	
	
	}

}
