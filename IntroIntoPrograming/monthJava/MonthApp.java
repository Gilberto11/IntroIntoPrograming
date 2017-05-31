/*
*MonthApp.java
*@author Gilberto C. Junior
*11/03/16
*/

/*
MonthApp.java
@ author P Bradley
11 Mar 2017
*/

import javax.swing.*;
public class MonthApp{
	public static void main(String args[]){
	
	//1. Variables
	int month;
	String message;
	
		//2. Objects
		Month myMonth;
		myMonth=new Month();
		
			//3. Input
			month=Integer.parseInt (JOptionPane.showInputDialog(null, "Please enter the month number"));
			myMonth.setMonth(month);
			
				//4. Process
				myMonth.compute();
				
				
					//5. Output
					message=myMonth.getMessage();
					JOptionPane.showMessageDialog(null, message);
					
		}
		
		
}