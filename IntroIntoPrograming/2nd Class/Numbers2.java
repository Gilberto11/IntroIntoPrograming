/*
*Numbers2.java
*@author Gilberto C. Junior
*04/02/16
*/

//Application for user input
//1. import utility package

import java.util.*;  //util is short for utility also you can use .Scanner or *(all)
public class Numbers2{
// 2. Main Method is the engine of the program..responsible for running

	public static void main(String args[]){
	
	//variables
	int number1;
	int number2;
	int total;
	
	//assign variables
	number1=0; //zero means nothing on the container which will b up to the user
	number2=0;
	total=0; 
	
	//objects which we are using based on the declaration on top (import java.util *)
	Scanner keyboard; //Scanner - give it a name
	keyboard= new Scanner (System.in);//it is like cloning the scanner library and u name it for u to use, coz u cant use the original
	
	//Ask the user for their first number
	System.out.println("Please enter your first number");//asking the question for user input
	number1=keyboard.nextInt(); //this stores the number input by the user
	
	System.out.println("Please enter your second number");
	number2=keyboard.nextInt();//next int coz it is an integer if was decimal would b nextDecimal
	
	//process
	
	total = number1 +number2;
	
	//output
	
	System.out.println("Your total is " + total);
	
	
	}
}