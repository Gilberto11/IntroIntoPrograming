/* PigLatin.java
* @author gilberto caobianco
* 8 april 2017
*/



public class PigLatin{

	private String word;// hold the name coming in from the user
	private StringBuffer strBuff; //hold the altered word
	private String newWord; //hold the new word
	
	//constructor
	public PigLatin(){
	
	word = "";
	newWord = "";
	strBuff = new StringBuffer();
	}
 
	//setters
	
	public void setWord(String word){
	this.word=word;
	}
	
	//computer
	
	public void compute(){
	
	for(int i=1; i<word.length(); i++){//starting the loop at the 2nd char
	
		strBuff.append(word.charAt(i));//adds "isa" to the string buffer
		}
		
		strBuff.append(word.charAt(0));//going into the stringbuffer and grabs the first char isa in the string buffer and it add the L to the end
		
		strBuff.append("ay");// adds the ay to the end. isal then it add the end ay to the end
		//ends the else
		
	//ends the loop
	
	newWord = strBuff.toString();//getting the altered word from the strBuff and coverting it back to a poper String again
	
	}//ends the compute
	
	
	//getters
	public String getNewWord(){
		return newWord;
	}
}


