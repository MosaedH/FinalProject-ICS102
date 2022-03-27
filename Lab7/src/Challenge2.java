import java.util.Scanner;
public class Challenge2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Count to: \n-------------");
		
		int san = scanner.nextInt(); 
		
		for(int i = 0; i<=san; i++) {
			System.out.println(i);
		}

	}

}
