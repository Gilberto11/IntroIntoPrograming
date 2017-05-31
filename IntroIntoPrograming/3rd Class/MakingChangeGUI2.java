/*
*Shop.java
*@author Gilberto C. Junior
*11/02/16
*/

//JOptionPane...its to do with GUI graphic user interface
import javax.swing.*; // another tool like scanner
import java.lang.Math;

public class MakingChangeGUI2{

	public static void main (String args[]){
	
	double totalCost=0;
	double customerPaid=0;
	double change=0;
	
	int num50=0;
	int num20=0;
	int num10=0;
	int num5=0;
	int num2=0;
	int num1=0;
	
	totalCost=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter total cost"));
	customerPaid=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter total paid"));
	
	change=customerPaid-totalCost;
	change=Math.floor(change);
	
	JOptionPane.showMessageDialog(null,"Your change is "+change);
	
	num50=(int)change/50;
	change=change%50;
	
	num20=(int)change/20;
	change=change%20;
	
	num10=(int)change/10;
	change=change%10;
	
	num5=(int)change/5;
	change=change%5;
	
	num2=(int)change/2;
	change=change%2;
	
	num1=(int)change/1;
	change=change%1;
	
	
	JOptionPane.showMessageDialog(null,"The amount of 50 is: "+num50+"\n"+
	"The amount of 20 is: "+num20+"\n"+
	"The amount of 10 is: "+num10+"\n"+
	"The amount of 5 is: "+num5+"\n"+
	"The amount of 2 is: "+num2+ "\n"+
	"The amount of 1 is: "+num1);
	
	
	
	}
}