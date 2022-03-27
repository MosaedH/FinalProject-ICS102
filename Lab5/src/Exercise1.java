import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Grade: ");
		double grade = scanner.nextDouble();
		
		
		if( grade >= 0 && grade < 60) {
			System.out.println("Your Grade is \"F\"");
		}else if(grade >=60 && grade < 65){
			System.out.println("Your Grade is \"D\"");
		}else if(grade >=65 && grade < 70){
			System.out.println("Your Grade is \"D+\"");
		}else if(grade >=70 && grade < 75){
			System.out.println("Your Grade is \"C\"");	
		}else if(grade >=75 && grade < 80){
			System.out.println("Your Grade is \"C+\"");
		}else if(grade >=80 && grade < 85){
			System.out.println("Your Grade is \"B\"");
		}else if(grade >=85 && grade < 90){
			System.out.println("Your Grade is \"B+\"");
		}else if(grade >=90 && grade < 95){
			System.out.println("Your Grade is \"A\"");
		}else if(grade >=95 && grade <= 100){
			System.out.println("Your Grade is \"A+\"");
		}else {
			System.out.println("Enter a Grade!!");
		}
		
		
	}


}

