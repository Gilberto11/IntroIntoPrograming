/*
* PPSNumber.java
* @ Author G Caobianco
* 9 April 2017
*/


//import
import javax.swing.*;
//class signature
public class HickoryApp{
// main method
	public static void main (String args[]){

	String newSentence;
	String sentence;
	Hickory myHickory;
	myHickory = new Hickory();
//object

sentence = JOptionPane.showInputDialog("please enter your sentence");
myHickory.setSentence(sentence);

myHickory.compute();

myHickory.getnewSentence();
newSentence = JOptionPane.showMessageDialog("new sentence is: " + newSentence);


	}
}