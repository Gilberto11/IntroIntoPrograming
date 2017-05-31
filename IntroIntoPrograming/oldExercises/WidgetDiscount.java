import java.util.Scanner;

public class WidgetDiscount {

	public static void main(String[] args) {
		//write a program that asks the user to enter in the number of widgets, the program works out how much the widgets cost based on the following :
		// if they buy less than 100 - 10- euro each
		// if they buy between 100 and 500 - 8 euro each
		// if they buy over 500 - 7 euro each
		
		// declare a Scanner Object
		Scanner input = new Scanner(System.in);
		//declare variables
		int widget;
		//ask the user to enter how many widgets they are buying
		System.out.println("Please enter how many widgets you would like to buy: ");
		//read the widget into variable widget
		widget = input.nextInt();
		//output how much widgets will cost
		
		if (widget <= 100){
			System.out.println("The widgets cost 10 euros");
		} else if (widget >=101 && widget <=500){
			System.out.println("The widgets cost 8 euros");
		} else if (widget >=501){
			System.out.println("The widgets cost 7 euros");
		} else {
			System.out.println("Number of widgets invalid");
			
			
		}

	}

}