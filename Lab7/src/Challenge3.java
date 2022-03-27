import java.util.Scanner;
public class Challenge3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int total = 0;
		
		System.out.println("Q1) What is the capital of Spain?");
		System.out.println("\t1) Melbourne");
		System.out.println("\t2) Paris");
		System.out.println("\t3) Madrid");
		
		
		
		int Q1 = scanner.nextInt();
		switch(Q1) {
		case 1: System.out.println("That's right!"); total++;
		break;
		case 2: System.out.println("Sorry this is not true");
		break;
		case 3: System.out.println("Sorry this is not true");
		}
		System.out.println("---------------------------");
		
		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
		System.out.println("\t1)Yes");
		System.out.println("\t2)No");
		
		int Q2 = scanner.nextInt();
		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
		switch(Q2) {
		case 1: System.out.println("That's right!"); total++;
		break;
		case 2: System.out.println("Sorry, \"cat\" is a string. int can only store numbers.");
		}
		System.out.println("---------------------------");

		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("\t1) 5");
		System.out.println("\t2) 11");
		System.out.println("\t3) 15/3");
		
		int Q3 = scanner.nextInt();
		System.out.println("Q3) What is the result of 9+6/3?");
		switch(Q3) {
		case 1: System.out.println("Sorry this is not true");
		break;
		case 2: System.out.println("That's correct"); total++;
		break;
		case 3: System.out.println("Sorry this is not true");
		}
		System.out.println("---------------------------");

		
		
		
		System.out.println("Overall, you got "+total+" out of 3 correct.\r\n"+ "Thanks for taking the quiz");
	}

}

