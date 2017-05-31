/*
*Shop.java
*@author Gilberto C. Junior
*11/02/16
*/
//JOptionPane...its to do with GUI graphic user interface
 
import javax.swing.*; // another tool like scanner
public class Cinema{

	public static void main (String args[]){

	
	
	//declare and assign
	int student=0;
	int child=0;
	int oap=0;
	int adult=0;
	int age=0;
	final double STUDENTCOST=6;
	final double CHILDCOST=5;
	final double OAPCOST=4;
	final double ADULTCOST=8;
	double total=0;
	String name="";
	
	
	//asking questions to the user
	name=JOptionPane.showInputDialog(null,"Please enter your name");
	age=Integer.parseInt(JOptionPane.showInputDialog(null,"How old are you?"));
	student=Integer.parseInt(JOptionPane.showInputDialog(null,"How many students tickets would you like?"));
	child=Integer.parseInt(JOptionPane.showInputDialog(null,"How many child tickets would you like?"));
	oap=Integer.parseInt(JOptionPane.showInputDialog(null,"How many oap tickets would you like?"));
	adult=Integer.parseInt(JOptionPane.showInputDialog(null,"How many adult tickets would you like?"));
	
	
	//process
	total=(STUDENTCOST*student)+(CHILDCOST*child)+(OAPCOST*oap)+(ADULTCOST*adult);
	
	//output
	JOptionPane.showMessageDialog(null,"Hello " +name+ "your age is "+age+" Your total is "+total);
	
	
	
	}
}