/*
*Sentence.java
*@author Gilberto C. Junior
*11/03/16
*/

//cinema
//age 5- ticket free
//under 14=5 euros
//60+ ticket =free
//anyone else = 10 euros

public class Sentence{
//data members

	private String word;
	private int len;
	private int count;//store the amount of spaces



//Constructor

public Sentence(){

	word="";
	len=0;
	count=0;
}


//setter

public void setWord(String word){
	this.word=word;
}


//Compute


public void compute(){
//start the loop at the start of the word and work right up until the length of the word is found

for (int i=0; i<word.length();i++){
//if the word has a character in the loop with a space
	if (word.charAt(i)==' '){
	//increase the count variable
	count=count+1;//another way of increasing the count variables is count++
	}//closes if statement
}//close the loop

}//close the compute


public int getCount(){
	return count+1;
}
}