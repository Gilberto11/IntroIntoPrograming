/*
*Shop.java
*@author Gilberto C. Junior
*11/02/16
*/
//JOptionPane...its to do with GUI graphic user interface
import javax.swing.*; // another tool like scanner
public class GUI{

	public static void main (String args[]){
	
	
	//variables - declared and assigned
	String name="";
	int num1=0;
	int num2=0;
	int total=0;
	
	//input
	//asking the question and string the answer in one line
	//Integer.parseInt - convert number to string
	name=JOptionPane.showInputDialog(null,"Please enter your name");
	num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter first number"));
	num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter second number"));
	
	//process
	total=num1+num2;
	
	//output
	JOptionPane.showMessageDialog(null,"Hello " +name+ "your sum is "+total);
	
	
	}
}