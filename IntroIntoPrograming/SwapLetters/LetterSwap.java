/* LetterSwap.java
* @author gilberto caobianco
* 8 april 2017
*/

public class LetterSwap{

	private String word;// hold the name coming in from the user
	private StringBuffer strBuff; //hold the altered word
	private String newWord; //hold the new word
		
	//constructor
	public LetterSwap(){
	
	word = "";
	newWord = "";
	strBuff = new StringBuffer();
	}
 
	//setters
	
	public void setWord(String word){
	this.word=word;
	}
	
	//compute
	
	public void compute(){
	strBuff.append(word.charAt(word.length()-1));//grabs the last letter
	
	for(int i=1; i<word.length()-1; i++){ //loops from 2nd letter moving 
	strBuff.append(word.charAt(i));
	}
		strBuff.append(word.charAt(0));
		//strBuff.append(word.charAt(0));
		

	newWord = strBuff.toString();//getting the altered word from the strBuff and coverting it back to a poper String again
	
	}//ends the compute
	
	
	//getters
	public String getNewWord(){
		return newWord;
	}
}


