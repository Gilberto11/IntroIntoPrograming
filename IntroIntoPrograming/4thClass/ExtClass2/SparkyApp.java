/*
*SparkyApp.java
*@author Gilberto Caobianco
*18 feb 2017
*/


import java.util.*;
public class SparkyApp{

	public static void main (String args[]){//main method
	
	int adult;
	int oap;
	int student;
	int child;
	double total;
	String name="";
	
	Scanner keyboard;
	keyboard=new Scanner(System.in);
	Sparky mySparky; // creates the link to the instan class
	mySparky=new Sparky();
	
	//input
	System.out.println("Please enter your name"); 
	name=keyboard.nextLine();
	mySparky.setName(name);
	
	System.out.println("How many Adults tickets would you like?"); 
	adult=keyboard.nextInt();
	mySparky.setAdult(adult);
	
	
	System.out.println("How many OAP tickets would you like?"); 
	oap=keyboard.nextInt();
	mySparky.setOAP(oap);
	
	System.out.println("How many Students tickets would you like?"); 
	student=keyboard.nextInt();
	mySparky.setStudent(student);
	
	System.out.println("How many Child tickets would you like?"); 
	child=keyboard.nextInt();
	mySparky.setChild(child);
	
	
	
	mySparky.compute();
	
	
	
	total=mySparky.getTotal();//grab the total from my instan class and store in total here.
	System.out.println("Hi "+name+" Welcome Aboard"+" The total price of your tickets is: "+total);
	
	
	
	
	}
	
}