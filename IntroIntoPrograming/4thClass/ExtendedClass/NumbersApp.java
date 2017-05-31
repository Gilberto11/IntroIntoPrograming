/*
*NumbersApp.java
*@author Gilberto Caobianco
*18 feb 2017
*/
import java.util.*;
public class NumbersApp{

	public static void main (String args[]){
	
	//1. Variables
	
	int num1;
	int num2;
	int total;
	
	// objects
	
	Scanner keyboard; // <class name><object name>
	keyboard=new Scanner(System.in);//<object name>= new <class name>(<parameters>);
	Numbers myNumbers; // creates the link to the instan class
	myNumbers=new Numbers();
	
	//input
	System.out.println("Please enter first number"); //ask user for first input
	num1=keyboard.nextInt();//grabs the input from the user
	myNumbers.setNum1(num1);//go out to my instan class now called myNumbers and send across the number.
	
	System.out.println("Please enter second number"); //ask user for second input
	num2=keyboard.nextInt();
	myNumbers.setNum2(num2);
	
	
	//process
	
	myNumbers.compute(); //go out to the instan class and run the calculations set for this function
	
	
	
	//output
	total=myNumbers.getTotal();//grab the total from my instan class and store in total here.
	System.out.println("The total is: "+total);
	
	
	
	}


}