/* SentenceApp.java
* @author gilberto caobianco
* 1 april 2017
*/

//Create an applications that asks the user for their name and count the amount of characters in their name

import javax.swing.*; // Using JOption Pane for user input
public class SentenceApp{
	public static void main (String args []){

	//Declaring Variables
	
	String word=""; //Hold the name
	int len=0; //short for length and it will hold the length of the word
	int count=0;
	
	//Step 1 ask the question and storing the answer
	Sentence mySentence=new Sentence();
	word=JOptionPane.showInputDialog(null, "Please enter your sentence"); 
	mySentence.setWord(word);
	
	mySentence.compute();
	//Step 2 get the length of the word
	
	count= mySentence.getCount();
	
	//Step 3
	
	JOptionPane.showMessageDialog(null, "There number of words is: " +count + " in your sentence");

	}
	
}