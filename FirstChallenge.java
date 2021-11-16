import java.util.Scanner;
public class FirstChallenge{
	public static void main(String[] args){
	
		//Challenge Part 1 (Take input from the user).	
		Scanner myObject = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name = myObject.nextLine();
		System.out.print("What is your surname: ");
		String surname = myObject.nextLine();
		System.out.print("Enter your date of birth(DD/MM/YYYY): ");
		String date_of_birth = myObject.nextLine();
		System.out.print("How far is your favourite store from your home? ");
		Double distance_from_store = myObject.nextDouble();
		
		System.out.println();
		
		//Challenge Part 2
		System.out.println("Hello " + name + " " + surname);
		String year = date_of_birth.split("/")[2];  //Get year of birth from date of birth
		int age = 2021 - Integer.parseInt(year); //Convert the string year to integer to subtract
		System.out.println("You are " + age + " years old");

		System.out.println();
			
		//Challenge Part 3
		Double miles = distance_from_store*0.621371;  // convert kilometers to miles
		System.out.println("Your favourite store is " + miles + " miles away");
		Double meters = distance_from_store*1000;  // convert kilometers to meters
		System.out.println("Your favourite store is " + meters + " meters away");
		int age_in_seconds = age*365*86400;
		System.out.println("You are " + age_in_seconds + " seconds old");
		int age_in_milliseconds = age*365*86400*1000;
		System.out.println("You are " + age_in_seconds + " milliseconds old");
		
	}
}
