import java.util.Scanner;
public class FirstChallenge{
	public static void main(String[] args){
	
		//Challenge Part 1 (Take input from the user).
		
		
		//Check if name and surname are empty.	
		Scanner takeInput = new Scanner(System.in);
		String name;
		while(true){
			System.out.print("What is your name: ");
			name = takeInput.nextLine();
			if(!name.isEmpty()){
				break;
			}
		}
		
		String surname;
		while(true){
			System.out.print("What is your surname: ");
			surname = takeInput.nextLine();
			if(!surname.isEmpty()){
				break;
			}
		}		
		

		//Get a valid date of birth
		String date_of_birth;
		int age;
		while(true){
			System.out.print("Enter your date of birth(DD/MM/YYYY): ");
			date_of_birth = takeInput.nextLine();
			if(date_of_birth.length() == 10 && date_of_birth.charAt(2) == '/' && date_of_birth.charAt(5) == '/'){    // check if date format is correct
				try{
					int month = Integer.parseInt(date_of_birth.split("/")[1]);
					if(month > 0 && month < 13){
						try{
							int day = Integer.parseInt(date_of_birth.split("/")[0]);
							if(day > 0 && day < 31){
								int yearCheck = Integer.parseInt(date_of_birth.split("/")[2]);
								if(yearCheck > 1900 && yearCheck < 2021){
									age = 2021 - yearCheck;
									break;
								}else{
									System.out.println("Year not valid!");
								}
							}else{
								System.out.println("Day not valid!");
							}
						}catch(Exception e){
							System.out.println("Day not valid!");
						}
					}else{
						System.out.println("Month not valid!");
					}
				}
				catch(Exception e){
					System.out.println("Month not valid!");
				}
			}
		}
		
		
		//Get a valid user distance
		Double distance_from_store;
		while(true){
			try{
				System.out.print("How far is your favourite store from your home? ");
				distance_from_store = takeInput.nextDouble();
				if(distance_from_store > 0){			//Distance cannot be negative
					break;
				}
					System.out.println("Distance not valid!");
			}catch(Exception e){
				System.out.println("Distance not valid!");
				takeInput.next(); 				//flush user input in the keyboard scanner.
			}

		}
			
		System.out.println();
		
		//Challenge Part 2
		System.out.println("Hello " + name + " " + surname);
		System.out.println("You are " + age + " years old");

		System.out.println();
			
		//Challenge Part 3
		Double miles = distance_from_store*0.621371;  		// convert kilometers to miles
		System.out.println("Your favourite store is " + miles + " miles away");
		Double meters = distance_from_store*1000;  			// convert kilometers to meters
		System.out.println("Your favourite store is " + meters + " meters away");
		
		System.out.println();
		
		long age_in_seconds = age*365*86400;
		System.out.println("You are " + age_in_seconds + " seconds old");
		long age_in_milliseconds = age*365*86400*1000;
		System.out.println("You are " + age_in_milliseconds + " milliseconds old");
		
	}
}
