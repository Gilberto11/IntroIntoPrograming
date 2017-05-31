import java.util.Scanner;

public class MilestoKmAndKmtoMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice;
		System.out.println("Please choose an option from the menu");
		System.out.println("1. Get Average");
		System.out.println("2. Convert Distance");
		System.out.println("3. Convert Currency");
		
		choice = input.nextInt();
		switch(choice){
		case 1:
			getAverage();
			break;
		case 2:
			convertDistance();
			break;
		case 3:
			convertCurrency();
			break;
			default:
				System.out.println("Sorry that is not a valid option");
				
		}
		

	}
	public static void getAverage(){
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the first number: ");
	
	double x = input.nextDouble();
	System.out.println("Please enter the second number ");
	double y = input.nextDouble();
	double result = ( x + y) /2;
	System.out.println(" The result is: " + result);
	
}
public static void convertDistance(){
	Scanner input = new Scanner(System.in);
	int choice;
	double miles, km;
	System.out.println("Please choose an option from the menu");
	System.out.println("1. Convert from miles to KM");
	System.out.println("2. Convert from Km to miles");
	
	choice = input.nextInt();
	switch (choice){
	case 1:
		miletoKM();
		break;
	case 2:
		kmtoMiles();
		break;
		default:
			System.out.println("That is not a valid option");
			
		
	}
	
	
	
}
public static void miletoKM(){
Scanner input = new Scanner(System.in);
System.out.println("Please enter the number of miles: ");
double mile = input.nextDouble();
double km = (mile / 5.0)* 8.0;
System.out.println(mile + "Miles " + km + "KM");
}

public static void kmtoMiles(){
Scanner input = new Scanner(System.in);
System.out.println("Please enter the number of kms: ");
double km = input.nextDouble();
double mile = (km * 8.0)* 5.0;
System.out.println( km + "KM" + mile + "Miles");
}

public static void convertCurrency(){
	Scanner input = new Scanner(System.in);
	int choice;
	double euros, pounds;
	System.out.println("Please choose an option from the menu");
	System.out.println("1. Convert from euros to pounds");
	System.out.println("2. Convert from pounds to euros");
	choice = input.nextInt();
	
	switch(choice) {
		case 1:
			eurostoPounds();
			break;
		case 2: 
			poundstoEuros();
			break;
			default:
				System.out.println("That is not a valid option");
				
	}
				
	
}

public static void eurostoPounds(){
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the amount in euros: ");
	double euros = input.nextDouble();
	double pounds = (euros * 0.7);
	System.out.println(euros + " Euros = " + pounds + " Pounds ");
	
}
public static void poundstoEuros(){
Scanner input = new Scanner(System.in);
System.out.println("Please enter the amount in pounds");
double pounds = input.nextDouble();
double euros = (pounds / 0.7);
System.out.println(pounds + " Pounds = " + euros + " Euros ");

	
}

}