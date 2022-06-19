package carParkingSystem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class carParkingSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int parkNum  = 0;
		int location = 0;
		String bookTime = "";
		double hour  = 1;
		int another1 = 0;
		
		// Start ----- Welcome and choose
		
		for(int i = 1; i > 0;) {  //  This loop for valid input
			System.out.println("Welcome to Car parking");
			System.out.println("It's a system That Will pick up parking for your car ");
			System.out.println("-------------------------");
			
			System.out.println("To choose a Location  [Enter: 1]");
			System.out.println("To exit               [Enter: 2]");
			System.out.println("Who wrote this code ? [Enter: 3]");
			System.out.print("-------------------------\nEnter: ");
			int choose = scanner.nextInt();
			// End ----- Welcome and choose		
			// Start ----- Choose a Location
			if (choose == 1) {
				System.out.println("-------------------------\nThese are the Location available in Hail:");
				System.out.println("Hail University  [Enter: 1]");
				System.out.println("Othaim Mall      [Enter: 2]");
				System.out.println("Hail Square      [Enter: 3]");
				System.out.println("Garden Mall      [Enter: 4]");
				System.out.println("Oqdh             [Enter: 5]");
				System.out.print("-------------------------\nEnter: ");
				location = scanner.nextInt();
				
				  // End ----- Choose a Location
				  // Start ----- Choose a parking number
	
					System.out.println("-------------------------\nChoose your parking number:");
					switch (location) {
					case 1: System.out.print("First parking     [Enter: 1]\nSecond parking    "
							+ "[Enter: 2]\nThird parking     [Enter: 3] \n-------------------------\nEnter: "); parkNum = scanner.nextInt(); i-=i; 
					break;
					case 2: System.out.print("First parking     [Enter: 1]\nSecond parking    "
							+ "[Enter: 2]\nThird parking     [Enter: 3] \n-------------------------\nEnter: "); parkNum = scanner.nextInt(); i-=i;
					break;
					case 3: System.out.print("First parking     [Enter: 1]\nSecond parking    "
							+ "[Enter: 2]\nThird parking     [Enter: 3] \n-------------------------\nEnter: "); parkNum = scanner.nextInt(); i-=i;
					break;
					case 4: System.out.print("First parking     [Enter: 1]\nSecond parking    "
							+ "[Enter: 2]\nThird parking     [Enter: 3] \n-------------------------\nEnter: "); parkNum = scanner.nextInt(); i-=i;
					break;
					case 5: System.out.print("First parking     [Enter: 1]\nSecond parking    "
							+ "[Enter: 2]\nThird parking     [Enter: 3] \n-------------------------\nEnter: "); parkNum = scanner.nextInt(); i-=i;
					break;
					default : System.out.println("Please enter a valid input\n-------------------------");
					}
					// End ----- Choose a parking number
	
				}else if(choose == 2){
					System.out.println("Good bey");
					System.exit(0);
				}else if (choose == 3){          // Start ----- About me
					System.out.println("");
					System.out.println("Name: Mosaed Saud Alhmwan");
					System.out.println("Student ID: 202007161");
					System.out.println("Email: Mosaed.Alhmwan@gmail.com");
					System.out.println("For More Informations Check Mysite: https://Mosaed.me");
					System.out.println("Github: MosaedH \n\n-------------------------\n");
					// End ----- About me
				}else {
					System.out.println("Please enter a valid input\n-------------------------");
					i++;
				}
			}
		
		// Start ----- ArrayList
		ArrayList<String> timesF = new ArrayList<>(Arrays.asList("1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "24:00"));
		ArrayList<String> timesS = new ArrayList<>(Arrays.asList("1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "24:00"));
		ArrayList<String> timesT = new ArrayList<>(Arrays.asList("1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "24:00"));
		ArrayList<String> timesThatRemoved = new ArrayList<>(Arrays.asList());
		// End ----- ArrayList
		
		// Start ---- Available Time, Choose a Time
		for(int another = 1; another > 0;) {
		
			if (parkNum == 1) {
				System.out.println("-------------------------\n"+"These are the times are available in FIRST Park to Book a Car Park:");
				System.out.println("How long will the car be in parking\n");
				System.out.println("Enter the hour that will be reserved for your car\n");
				for (int i = 0; timesF.size() > i; i++) {
					System.out.print(timesF.get(i)+", ");
				}
			}else if (parkNum ==2){
				System.out.println("-------------------------\n"+"These are the times are available in SECOND Park to Book a Car Park:");
				System.out.println("How long will the car be in parking\n");
				System.out.println("Enter the hour that will be reserved for your car\n");
				for (int i = 0; timesS.size() > i; i++) {
					System.out.print(timesS.get(i)+", ");
				}
			}else if (parkNum ==3){
				System.out.println("-------------------------\n"+"These are the times are available in THIRD Park to Book a Car Park:");
				System.out.println("How long will the car be in parking\n");
				System.out.println("Enter the hour that will be reserved for your car\n");
				for (int i = 0; timesT.size() > i; i++) {
					System.out.print(timesT.get(i)+", ");
					
				}
			}else {
				System.out.println("Please enter a valid input0\n-------------------------");
			}		
			System.out.println("");
			System.out.print("-------------------------\nBook The hour : ");
		
			// Start ----- Remove a time from ArrayList and add the removed time in another list
			bookTime = scanner.next();
			if(!bookTime.contains(":")) {
				System.out.println("Wrong time please inter correct time");
				bookTime = scanner.next();
			}else {
				if (parkNum == 1) {
					timesF.remove(bookTime);
					timesThatRemoved.add(bookTime);
				}else if (parkNum == 2) {
					timesS.remove(bookTime);
					timesThatRemoved.add(bookTime);
				}else if (parkNum == 3) {
					timesT.remove(bookTime);
					timesThatRemoved.add(bookTime);
				}
			}
			
			// End ----- Remove a time from ArrayList and add the removed time in another list
			// End ---- Available Time, Choose a Time
			for (another1 = 1; another1 > 0;) {
			System.out.println("-------------------------\nTo book another hour   [Enter: 1]");
			System.out.println("Continue for check     [Enter: 2]");
			System.out.print("-------------------------\nEnter: ");
			another = scanner.nextInt();
				if (another == 1) {
					hour++;
					another++;
					another1--;
				}else if (another == 2) {
					another-=another;
					another1-=another1;
				}else {
					System.out.println("Please enter a valid input\n-------------------------");
					another1++;
				}
			}
		}
		
		
		// Start ----- To replace a int to String of location, replace index to value of ArrayList
		String locationString = "Hail University";
		if (location == 1) {
			locationString  = "Hail University";
		}else if (location == 2) {
			 locationString = "Othaim Mall";
		}else if (location == 3) {
			 locationString = "Hail Square";
		}else if (location == 4) {
			 locationString = "Garden Mall";
		}else if (location == 5) {
			 locationString = "Oqdh";
		}
		
		
		
		// End ----- To replace a int to String of location, replace index to value of ArrayList
		
//		String bookTimeBill = "";
//		 for (int i = 0; timesThatRemoved.size() > 0; i++) {
//			bookTimeBill = (timesThatRemoved.get(i).toString());
//		}
//		System.out.println(bookTimeBill);
		
		
		// Start ----- Bill 
		System.out.println("-----------------Bill----------------");
		System.out.println("           Location: "+ locationString   );
		System.out.println("           Park Number: " + parkNum      );
		System.out.println("           Time is: "+ timesThatRemoved     );
		System.out.println("           Service price: " + (hour * 60) +"SR");
		System.out.println("-------------------------------------");
		// End ----- Bill 
		System.out.println("           *Special Thanks For Dr.Saad*");
		scanner.close();
		System.exit(0);

	}
	 
	
}
