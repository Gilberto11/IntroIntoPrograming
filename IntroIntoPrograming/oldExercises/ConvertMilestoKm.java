
import java.util.Scanner;

public class ConvertMilestoKm {

	public static void main(String[] args) {
		//declare a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//declare variables
		double miles,km;
		
		//ask the user to enter a value in miles
		System.out.println("Please enter a value in miles");
		//read the value into the variable miles
		miles = input.nextDouble();
		//convert miles to kilometers
		km = (miles/5)*8;
		//output the result
		System.out.println(miles + "miles = " + km + "kms");
		
	}

}