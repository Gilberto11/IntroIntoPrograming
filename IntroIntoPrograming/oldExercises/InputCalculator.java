
import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		// write a program that asks the user to enter 2 numbers - use double
		// read in the 2 numbers, displays on menu 1. add numbers 2.sub...
		
		// Scanner Object
		
		Scanner input = new Scanner(System.in);
		
		//declare variables
		double result, x, y;
		int choice;
		
		//ask the user to enter a number
		System.out.println(" Please enter first number: ");
		//read in the number into the variable
		x = input.nextDouble();
		
		//ask the use to enter second number;
		
		System.out.println("Please enter second number: ");
		
		y = input.nextDouble();
		
		System.out.println("Please choose on option from the menu");
		System.out.println("1. Add Numbers");
		System.out.println("2. Subtract Numbers");
		System.out.println("3. Multiply Numbers");
		System.out.println("4. Divide Numbers");
		System.out.println("5. Mod Numbers");
		System.out.println("6. Average of the Numbers");
		
		//read in the user`s choices
		
		choice = input.nextInt();
		
		// calculating
		
		switch (choice){
		
		case 1:
			result = x + y;
			break;
			
		case 2:
			result = x - y;
			break;
			
		case 3:
			result = x * y;
			break;
			
		case 4:
			result = x / y;
			break;
			
		case 5:
			result = x % y;
			break;
			
		case 6:
			result = (x + y) / 2;
			
			break;
			default:
				System.out.println("The numbers entered are invalid");
				result = 0;
				
		}
		
		System.out.println("The result is: " + result);
		// calculate all operations.
				
		
		

	}

}
