/* CharactersSample.java
* @author gilberto caobianco
* 1 april 2017
*/

//Create an applications that asks the user for their name and count the amount of characters in their name

import javax.swing.*; // Using JOption Pane for user input
public class CharacterSample{
	public static void main (String args []){

	//Declaring Variables
	
	String name=""; //Hold the name
	int len=0; //short for length and it will hold the length of the word
	
	
	//Step 1 ask the question and storing the answer
	
	name=JOptionPane.showInputDialog(null, "Please enter your name"); 
	
	//Step 2 get the length of the word
	
	len=name.length();// getting the length of the word and storing the answer in len
	
	//Step 3
	
	JOptionPane.showMessageDialog(null, "There are "+len + "characters in your name");

	}
	
}