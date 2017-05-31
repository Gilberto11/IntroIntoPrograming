/* PigLatinApp.java
* @author gilberto caobianco
* 8 april 2017
*/

import javax.swing.*;
public class LetterSwapApp{
	public static void main(String args[]){
	
	String word,newWord;
	
	LetterSwap myLetterSwap = new LetterSwap();
	
	word = JOptionPane.showInputDialog(null,"Enter your word");
	myLetterSwap.setWord(word);
	
	myLetterSwap.compute();
	
	newWord = myLetterSwap.getNewWord();
	JOptionPane.showMessageDialog(null,"Your new word is: " + newWord);
	
	}
	
}

