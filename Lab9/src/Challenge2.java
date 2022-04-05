import java.util.Scanner;
public class Challenge2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = {45, 39, 32, 12, 44, 50, 26, 42, 16, 20};
		
		
		//Start --- Print array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] +", ");
		}
		//End --- Print array
		
		//Start --- Enter a checker value
		System.out.println("\n-------------");
		System.out.print("Value to find: ");
		int check = scanner.nextInt();
		//End --- Enter a checker value
		
		// Start ---- Check the number if it's in array
		for (int i = 0; i < array.length ; i++) {
			if(check == array[i]) {
				System.out.println("-------------\n" + check + " is in the array.");
				break;
			}else {
				System.out.println("-------------\n" + check + " is not in the array.");
				break;
			}
		}
		// End ---- Check the number if it's in array

	}

}
