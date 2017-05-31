/*
*Shop.java
*@author Gilberto C. Junior
*11/02/16
*/

//SweetShop
// lollies (0.50), icecream (1.20), chocolate (1.05)
import java.util.*;
public class SweetShop{

	public static void main (String args[]){
	
	//variables
	//if data will never change - constant
	// final and CAPS
	int lollies;
	int icecream;
	int chocolate;
	final double LOLLIESCOST;
	final double ICECREAMCOST;
	final double CHOCOLATECOST;
	double total;
	String name;//String always starts with capital letter and grabs user name
	
	
	//assign
	lollies=0;
	icecream=0;
	chocolate=0;
	LOLLIESCOST=0.50;
	ICECREAMCOST=1.20;
	CHOCOLATECOST=1.05;
	total=0.0;
	name="";
	
	//objects
	Scanner keyboard; //brings in a Scanner class
	keyboard = new Scanner (System.in);
	
	//ask user name
	System.out.println("Please enter your name? ");
	name=keyboard.nextLine();
	//input - Questions i need to ask the user
	System.out.println("How many lollies do you want?");
	lollies=keyboard.nextInt();
	
	System.out.println("How many ice creams do you want?");
	icecream=keyboard.nextInt();
	
	System.out.println("How many chocolate do you want?");
	chocolate=keyboard.nextInt();
	
	total = (LOLLIESCOST*lollies)+(ICECREAMCOST*icecream)+(CHOCOLATECOST*chocolate);
	
	//output
	System.out.println("Hello "+name+",The total cost of your shop is "+total);
	
	
	
	
	}
}