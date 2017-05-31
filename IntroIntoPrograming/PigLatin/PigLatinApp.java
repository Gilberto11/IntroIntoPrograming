/* PigLatinApp.java
* @author gilberto caobianco
* 8 april 2017
*/

import javax.swing.*;
public class PigLatinApp{
	public static void main(String args[]){
	
	String word,newWord;
	
	PigLatin myPigLatin = new PigLatin();
	
	word = JOptionPane.showInputDialog(null,"Enter your word");
	myPigLatin.setWord(word);
	
	myPigLatin.compute();
	
	newWord = myPigLatin.getNewWord();
	JOptionPane.showMessageDialog(null,"Your new word is: " + newWord);
	
	}
	
}

