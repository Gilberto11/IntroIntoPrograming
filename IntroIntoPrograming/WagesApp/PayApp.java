/*
* PayApp.java
* @author Gilberto Caobianco Junior
*04-Mar-2017#
*/

import java.util.*;
public class PayApp{

	public static void main (String args[]){
	
	double hours;
	double basicRate;
	double overtime;
	double total;
	
	Scanner keyboard;
	keyboard=new Scanner(System.in);
	Pay myPay;
	myPay=new Pay();
	
	
	System.out.println("Please enter the total of hours worked this week: ");
	hours=keyboard.nextDouble();
	myPay.setHours(hours);
	
	
System.out.println("Please enter the basic rate: ");
	basicRate=keyboard.nextDouble();
	myPay.setBasicRate(basicRate);
	
	System.out.println("Please enter the total hours of overtime for this week: ");
	overtime=keyboard.nextDouble();
	myPay.setOvertime(overtime);
	
	myPay.compute();
	total= myPay.getTotal();
	System.out.println("Total wages based on hours and overtime is:  "+total);
	
	}
	
	
	
	
	
	
	
	}