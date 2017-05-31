/*
*Guess.java
*@author Gilberto C. Junior
*11/03/16
*/

import java.lang.Math.*;
public class Guess{

	private int randomNo;
	private int userNumber;
	private String message;
	
	


//Constructor
public Guess(){

	userNumber=0;

}


//setters

 public void setRandomNo(int randomNo){
   this.randomNo = randomNo;
   }
   
   public void setUserNumber(int userNumber){
   this.userNumber = userNumber;
   }
   
  
   
   //compute
   public void compute(){
     randomNo= randomNo;
    userNumber = (int)(Math.random()*10);
    if ((userNumber<randomNo)){
        message ="You Guessed too low";
    }
    else if ((userNumber>randomNo)){
         message ="You Guessed too high";
    }
    else if ((userNumber==randomNo)){
         message ="Congratulations you guessed correctly!";
    }
}

 public int getRandomNo(){
    return randomNo;
    }
    
     public int getUserNumber(){
    return userNumber;
    }
    
   
	public String getMessage(){
	return message;
	}
}
  
 
   