/*
*Shop.java
*@author Gilberto C. Junior
*11/02/16
*/

import java.util.*;
import java.lang.Math;

public class MakingChange{



	public static void main (String args[]){
	
	
	//declaring variables
	
	
	double totalCost=0;
	double customerPaid=0;
	double change=0;
	
	int num50=0;
	int num20=0;
	int num10=0;
	int num5=0;
	int num2=0;
	int num1=0;
	
	
	//asking questions to the user
	Scanner keyboard; //brings in a Scanner class
	keyboard = new Scanner (System.in);
	
	
		System.out.println("Please enter total cost"); 
		totalCost=keyboard.nextDouble();
		System.out.println("Please enter total paid");
		customerPaid=keyboard.nextDouble();
		
		//process
		
		change=customerPaid-totalCost;
		
		change=Math.floor(change);
		//output
	System.out.println("The change is "+change);
	
	num50=(int)change/50;
	System.out.println("Amount of 50 is "+num50);
	
	change=change%50;
	
	num20=(int)change/20;
	System.out.println("Amount of 20 is "+num20);
	
	change=change%20;
	
	
	num10=(int)change/10;
	System.out.println("Amount of 10 is "+num10);
	
	change=change%10;
	
	num5=(int)change/5;
	System.out.println("Amount of 5 is "+num5);
	
	change=change%5;
	
	num2=(int)change/2;
	System.out.println("Amount of 2 is "+num2);
	
	change=change%2;
	
	num1=(int)change/1;
	System.out.println("Amount of 1 is "+num1);
	
	change=change%1;
	
	
	
	
	
	
	
	
	
	
	
	}
}