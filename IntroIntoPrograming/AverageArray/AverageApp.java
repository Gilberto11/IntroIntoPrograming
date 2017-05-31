/*
* Average.java
* @ Author G Caobianco
* 23 April 2017
*/


import javax.swing.*;

public class AverageApp{
	public static void main (String args[]){
	
	//declare variables
	int avg;
    int arr[] = new int[5]; 
    
    //objects
    Average myAvg = new Average();
    
	//input
	
	for (int i=0; i<5; i++){
		arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
		
	}
	
	myAvg.setArr(arr);
	//process
	myAvg.compute();
	
	//output
	avg= myAvg.getAvg();
	JOptionPane.showMessageDialog(null, "Average is " + avg);
	
	
	}



}