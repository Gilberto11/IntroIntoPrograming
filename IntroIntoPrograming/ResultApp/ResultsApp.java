/*
* ResultsApp.java
* @ Author G Farrell
* 23 April 2017
*/

import javax.swing.JOptionPane;

public class ResultsApp{

	public static void main(String[] args){
	
		// Declaring Variables And 2 Dimensional Array
		
		int[][] results=new int[10][3];
		int lowScore;
		int highScore;
		
		// Declaring And Creating Object
		
		Results myResults;
		myResults = new Results();
		
		// Input
		
		for(int i = 0; i < 10; i++){
		
			for(int j = 0; j < 3; j++){
			
				results[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the result for student number "+(i+1)+"."));
				myResults.setResults(results);
			
			}
		
		}
		
		// Process
		
		myResults.compute();
		
		// Output
		
		lowScore=myResults.getLowScore();
		JOptionPane.showMessageDialog(null, "The lowest score is "+lowScore+".");
		
		highScore=myResults.getHighScore();
		JOptionPane.showMessageDialog(null, "The highest score is "+highScore+".");
	
	}

}