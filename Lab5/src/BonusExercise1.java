import java.util.Scanner;

public class BonusExercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Price: ");
		double price = scanner.nextDouble();
		
		if(price >= 2000) {
			System.out.println("Price + VAT: " + price * 1.15);
		}else if (price > 1000 && price <= 2000) {
			System.out.println("Price + VAT: " + price * 1.05);
		}else if (price <= 1000) {
			System.out.println(price);
		}else {
			System.out.println("Enter a Price");
		}
		
	}

}
