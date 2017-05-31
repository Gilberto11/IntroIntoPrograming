/*
*ZodiacStarSignApp.java
*@author Gilberto C. Junior
*11/03/16
*/

/*
MonthApp.java
@ author P Bradley
11 Mar 2017
*/

import javax.swing.*;
public class ZodiacStarSignApp{
	public static void main(String args[]){
	
	//1. Variables

	int day;
	String message;
	String monthName;
	
		//2. Objects
	ZodiacStarSign myZodiacStarSign;
	myZodiacStarSign = new ZodiacStarSign();
			//3. Input
			monthName=JOptionPane.showInputDialog(null, "Please enter the  month");
			myZodiacStarSign.setMonth(monthName);
			
			day=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the date"));
			myZodiacStarSign.setDay(day);
			
				//4. Process
				myZodiacStarSign.compute();
				
				
					//5. Output
					message=myZodiacStarSign.getMessage();
					JOptionPane.showMessageDialog(null, message);
					
		}
		
		
}




