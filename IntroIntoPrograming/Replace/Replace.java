/* Replace.java
* @author gilberto caobianco
* 8 april 2017
*/


//Develop an application to ask the user for their name and to replace a character 'a' with a star


public class Replace{

	private String name;// hold the name coming in from the user
	private StringBuffer strBuff; //hold the altered word
	private String newName; //hold the new word
	
	
	//constructor
	public Replace(){
	
	name = "";
	newName = "";
	strBuff = new StringBuffer();
	
	}
 
	//setters
	
	public void setName(String name){
	this.name=name;
	}
	
	//computer
	
	public void compute(){
	//starting the loop at zero and it is saying to end the loop when the length is found
	for(int i=0; i<name.length(); i++){
	
		if(name.charAt(i)=='a'){    //if the name has a character in the loop and the character is 'a'
			strBuff.append('*');
		}//ends the if statement
		else{
		
		strBuff.append(name.charAt(i));
		//the line above means= else put the words back together again
		}//ends the else
		
	}//ends the loop
	
	newName = strBuff.toString();//getting the altered word from the strBuff and coverting it back to a poper String again
	
	}//ends the compute
	
	
	//getters
	public String getNewName(){
		return newName;
}
}


