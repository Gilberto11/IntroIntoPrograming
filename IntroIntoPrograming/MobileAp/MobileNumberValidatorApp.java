/*
* MobileNumberValidatorApp.java
* @ Author G Farrell
* 18 April 2017
*/

import javax.swing.*;

public class MobileNumberValidatorApp{

	public static void main(String[] args){
	
		String number;
		int length;
		boolean valid;
		String message;
		
		MobileNumberValidator myValidator;
		myValidator=new MobileNumberValidator();
		
		do{
		
		number=JOptionPane.showInputDialog(null, "Please enter your mobile number.");
		myValidator.setNumber(number);
		
		myValidator.compute();
		
		valid=myValidator.getValid();
		
		message=myValidator.getMessage();
		JOptionPane.showMessageDialog(null, message);
		
		}while(valid==false);
	
	}

}