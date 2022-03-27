import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("This program will tell you if you hava DN");
		System.out.print("Enter number of classes held: ");
		double held = scanner.nextInt();
		System.out.print("Enter number of classes attended: ");
		double attended = scanner.nextInt();
		
		double result = ((attended/held)*100);
			
		
		if (result >= 75 && result <= 100) {
			System.out.println("Excellent! You are allowed to sit for the exam");
		}else if (result <75 && result > 0){
			System.out.println("Sorry! Your grade is DN. You are not allowed to sit for the exam");
		}else {
			System.out.println("Enter a right values");
		}
		
	}
		
		
}

