import java.util.Scanner;

public class PriceCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		double price;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose an option from the menu");
		System.out.println("1. KitKat");
		System.out.println("2. Mars Bars");
		System.out.println("3. Can Coke");
		System.out.println("4. Can Orange");
		System.out.println("5. King Crisps");
		System.out.println("6. Tayto Crisps");
		//read in the users choice
		choice = input.nextInt();
		
		//calculate the price
		
		switch(choice){
		//if choice ==1
		case 1:
			price = 1.20;
			break;
			//if choice ==2
		case 2:
			price = 1.20;
			break;
		case 3:
			
		    price = 1.00;
		    break;
		    
		case 4:
			price = 1.00;
			break;
			
		case 5:
			price = 0.90;
			break;
		case 6:
			price = 0.90;
			break;
			default:
				System.out.println("That is not a valid option");
				price = 0;
				
		}
		System.out.println("The price is " + price);
		
			
			
		}
		
				
				

	}