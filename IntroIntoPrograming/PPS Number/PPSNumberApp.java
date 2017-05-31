/*
* PPSNumberApp.java
* @ Author G Farrell
* 9 April 2017
*/

import javax.swing.*;

public class PPSNumberApp{

	public static void main(String[] args){
	
		// Declaring Variables
		
		String name;
		String ppsNumber;
		String message;
		boolean valid;
		
		// Declaring And Creating New Instance Of LetterSwap Class
		
		PPSNumber check;
		check=new PPSNumber();
		
		// Input
		
		name=JOptionPane.showInputDialog(null, "Please enter your name.");
		check.setName(name);
		
		do{
		
		ppsNumber=JOptionPane.showInputDialog(null, "Please enter your PPS number.");
		check.setPpsNumber(ppsNumber);
		
		// Process
		
		check.compute();
		
		// Output
		
		valid=check.getValid();
		
		message=check.getMessage();
		JOptionPane.showMessageDialog(null, message);
		
		}while(valid==false);
	
	}

}