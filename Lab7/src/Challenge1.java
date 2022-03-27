import java.util.Scanner;
public class Challenge1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("I will add up the numbers you give me.");
		
		int sum = 0;
		int i = 1;
		while (i <= 5) {
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();
			sum = sum + num;
			System.out.println("The total so far is: "+sum);
			System.out.println("----------------");
			i++;
			System.out.println("The total is: " + sum);
			
		}
		
	}

}
