/*
* BinCollectionApp.java
* @ Author G Farrell
* 18 april 2017
*/

import javax.swing.*;

public class BinCollectionApp{

	public static void main(String[] args){
	
		String binColour;
		int apartmentNumber;
		int num;
		boolean valid;
		String message;
		
		BinCollection myBin;
		myBin=new BinCollection();
		
		// Inputs
		
		do{
		
		binColour=JOptionPane.showInputDialog(null, "Please enter the colour of your bin.");
		myBin.setBinColour(binColour);
		
		apartmentNumber=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your apartment number."));
		myBin.setApartmentNumber(apartmentNumber);
		
		// Process
		
		myBin.compute();
		
		// Output
		
		valid=myBin.getValid();
		
		message=myBin.getMessage();
		JOptionPane.showMessageDialog(null, message);
		
		}while(valid==false);
	
	}

}