/*
*Shop.java
*@author Gilberto C. Junior
*04/02/16
*/

import java.util.*;  //util is short for utility also you can use .Scanner or *(all)
public class Shop{
// 2. Main Method is the engine of the program..responsible for running

	public static void main(String args[]){
	
	//declaring variables
	
	int milk;
	int bread;
	int sugar;
	int butter;
	double milkCost;
	double breadCost;
	double sugarCost;
	double butterCost;
	double total;
	
	//assigning variables
	
	milk=0;
	bread=0;
	sugar=0;
	butter=0;
	total=0;
	milkCost=1.67;
	breadCost=2.09;
	butterCost=1.69;
	sugarCost=1.20;
	
	
	Scanner keyboard;
	keyboard= new Scanner (System.in);
	System.out.println("How many milks would you like?");
	milk=keyboard.nextInt();
	
	System.out.println("How many breads would you like?");
	bread=keyboard.nextInt();
	
	System.out.println("How many butters would you like?");
	butter=keyboard.nextInt();
	
	System.out.println("How many sugars would you like?");
	sugar=keyboard.nextInt();
	
	//process
	
	total = (milkCost * milk) + (breadCost * bread) + (sugarCost * sugar) + (butterCost * butter);
	
	//output
	System.out.println("Your total is " + total);
	
	
	
	}
}