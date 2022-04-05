
public class Exercise2 {

	public static void main(String[] args) {
		int[][] values = {
							{30, 5, 7},
							{10, 2, 9}
						};
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < values[i].length; j++) {
				System.out.print(values[i][j]+ " ");
				sum += values[i][j];
			}
		}
		System.out.println("\n--------\n"+"The sum of values is: "+sum );
	}

}
