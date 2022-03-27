import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This Program is will give you \"The oldest person and the youngest\"");
		System.out.print("Enter first person age:");
		int first_age = scanner.nextInt();
		System.out.print("Enter secand person age:");
		int secand_age = scanner.nextInt(); 
		System.out.print("Enter third person age: ");
		int third_age = scanner.nextInt();
		
		if(first_age > secand_age && first_age > third_age) {
			System.out.println("The oldest is: "+first_age);
		}else if(secand_age > first_age && secand_age > third_age){
			System.out.println("The oldest is: "+secand_age);
		}else if(third_age > secand_age && third_age > first_age) {
			System.out.println("The oldest is: "+third_age);

		}
		if(first_age < secand_age && first_age < third_age) {
			System.out.println("The youngest is: "+first_age);
		}else if(secand_age < first_age && secand_age < third_age){
			System.out.println("The youngest is: "+secand_age);
		}else if(third_age < secand_age && third_age < first_age) {
			System.out.println("The youngest is: "+third_age);

		}
		
	
	}
			
	
}


