import java.util.Scanner;
public class MicroTeaching {

	public static void main(String[] args) {
		// Title: Switch-case statement
		// What is a Switch-case? Select one choice of many choice 
		Scanner scanner = new Scanner(System.in);

		
		int size1 = 29; //29 - 44 - 50
	    	    
	    // switch statement
	    switch (size1) {

	      case 29: System.out.println("Small");
	      	break;

	      case 42: System.out.println("Medium");
	      	break;

	      case 44: System.out.println("Large");
	      	

	      case 48: System.out.println("Extra Large");
	      
	      
	      default: System.out.println("Unknown");
	      
	    }
		
	    int size_2 = 29; //29 - 44
	    
	    // switch statement to check size
	    switch (size_2) {

	      case 29: System.out.println("Small");
	      	break;

	      case 42: System.out.println("Medium");
	      

	      case 44: System.out.println("Large");
	      

	      case 48: System.out.println("Extra Large");
	      
	      
	      default: System.out.println("Unknown");
	      
	    }
	    // Examples:
	    
	    
	    int day = 1;

	    switch (day) {
	      case 1: System.out.println("Monday");
	      
	      case 2:System.out.println("Case 2");
	      	break;
	        
	      case 3: System.out.println("Case 3");

	      default:
	        System.out.println("Default case");
	    }
	    
	    int day1 = 5;

	    switch (day1) {
	      case 1: System.out.println("Sunday");
	      	break;
	      
	      case 2: System.out.println("Monday");
	      	break;
	        
	      case 3: System.out.println("Tuesday");
	      	break;
	      
	      default:
	        System.out.println("Default case");
	        break;
	    }
	    
	}
	
}
