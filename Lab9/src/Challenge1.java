
public class Challenge1 {

	public static void main(String[] args) {
		int[] array = {45, 87, 39, 32, 93, 86, 12, 44, 75, 50};
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j ++) {
				if (array[i] > array[j]) {
					System.out.println(array[i]);
				}
			}
		}
	}

}
