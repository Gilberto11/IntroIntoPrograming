/*
*GuessApp.java
*@author Gilberto C. Junior
*11/03/16
*/


import javax.swing.JOptionPane;

public class GuessApp{

public static void main(String args[]){

    int randomNo;
    int userNumber;
    String message;

    Guess myGuess;

    myGuess = new Guess();

    userNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter a number between 1 and 10"));

    myGuess.setUserNumber(userNumber);
    
    myGuess.compute();
    randomNo = myGuess.getRandomNo();
    message= myGuess.getMessage();
   
    
JOptionPane.showMessageDialog(null,message);
	 //JOptionPane.showMessageDialog(null,message+" and the secret number is " +userNumber+ " you have won the game");
   
    }

}