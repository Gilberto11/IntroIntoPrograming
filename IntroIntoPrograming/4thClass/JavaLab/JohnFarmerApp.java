/*
*JohnFarmerApp.java
*@author Gilberto Caobianco
*18 Feb 2017
*/


import java.util.*;
public class JohnFarmerApp{

	public static void main (String args[]){
	
	int box;
	int eggs;
	int leftover;
	
	
	Scanner keyboard;
	keyboard=new Scanner(System.in);
	JohnFarmer myJohnFarmer; // creates the link to the instan class
	myJohnFarmer=new JohnFarmer();
	
	
	System.out.println("Please enter number of eggs collected"); //ask user for first input
	eggs=keyboard.nextInt();//grabs the input from the user
	myJohnFarmer.setEggs(eggs);
	
	myJohnFarmer.compute();
	
	box=myJohnFarmer.getBox();//grab the total from my instan class and store in total here.
	System.out.println("The amount of boxes is: "+box);
	
	leftover=myJohnFarmer.getLeftover();//grab the total from my instan class and store in total here.
	System.out.println("The amount of eggs leftover is: "+leftover);
	
	}
}