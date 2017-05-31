/*
*Theatre.java
*@author Gilberto C. Junior
*11/02/16
*/

//Mon-Fri= 20 euros
//Fri-Sun= 30 euros

import javax.swing.*;

public class Theatre{

	public static void main (String args[]){
	
	String day;
	
	
	day=JOptionPane.showInputDialog(null,"What do you want to come to the Theatre?");
	
	//process and output
		if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday")){
			JOptionPane.showMessageDialog(null, "The cost of your ticket is 20Euros");
		}
		else if(day.equalsIgnoreCase("Friday")||day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
			JOptionPane.showMessageDialog(null, "The cost of your ticket is 30Euros");
		}
		else{
			JOptionPane.showMessageDialog(null, "This is an invalid day");
		}
		
	}
}