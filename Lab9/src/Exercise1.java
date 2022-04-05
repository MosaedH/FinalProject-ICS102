
public class Exercise1 {

	public static void main(String[] args) {

		int[] numbers = {5, 11, 6, 2, 9, 16};
		int sum  = 0;
		for (int i = 0 ; i < numbers.length ; i++) {
			System.out.println(numbers[i]);
			sum  += numbers[i];
		}
		System.out.println("--------\n"+"The sum of numbers is: "+sum );
	}

}
