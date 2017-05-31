/*
*Shop.java
*@author Gilberto C. Junior
*11/02/16
*/

import java.util.*;
import javax.swing.*;

public class CinemaApp{
	public static void main(String args[]){
	
	
	//variables
	int age;
	String message;
	
	
	
	
	//objects
	
	Cinema myCinema;
	myCinema = new Cinema();
	
	
	
	//input
	
	age=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your age"));
	
	myCinema.setAge(age);
	
	
	//process
	
	myCinema.compute();
	
	//output
	message=myCinema.getMessage();
	JOptionPane.showMessageDialog(null,message);
	
	}
	
}