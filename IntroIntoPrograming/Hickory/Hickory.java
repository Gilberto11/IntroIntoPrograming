/*
* PPSNumber.java
* @ Author G Caobianco
* 9 April 2017
*/

//class signature
public class Hickory{

//data members
private String sentence;
private final String newSentence;
private StringBuffer strBuff;





//constructor

public Hickory(){

 newsentence = "";
 sentence = "Dock";
 strBuff = new StringBuffer();

}

//setters

	
	public void setNewSentence(String newSentence){
		this.newSentence=newSentence;
	
	}

//compute

public void compute(){
	strBuff.append(word.charAt(word.length(1)));
	len=sentence.length();
	
	for(int i=0; i<sentence.length; i++){
			
		if(word.charAt(i) == ' '){
			if(word.charAt(i) == 'B'){
				if(word.charAt(i) == 'E'){
					if(word.charAt(i) == 'N'){
					}
				}
			}
		}
	}
	
}




//getters
public int getnewSentence(){
	return newSentence;
	
	}
	
}



}