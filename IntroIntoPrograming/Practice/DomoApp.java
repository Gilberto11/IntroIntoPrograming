/*
* DomoApp.java
*@ author Gilberto Caobianco
* 23 - Feb - 2017
*/
import java.util.*;

public class DomoApp{

	public static void main (String args[]){
	
	int adult;
	int child;
	String name="";
	double total;
	
	
	Scanner keyboard;
	keyboard=new Scanner(System.in);
	Domo myDomo;
	myDomo =new Domo();
	
	System.out.println("Please enter your name");
	name=keyboard.nextLine();
	myDomo.setName(name);
	
	System.out.println("Please enter number of adults");
	adult=keyboard.nextInt();
	myDomo.setAdult(adult);
	
	System.out.println("Please enter number of child");
	child=keyboard.nextInt();
	myDomo.setChild(child);
	
	
	myDomo.compute();
	total=myDomo.getTotal();
	System.out.println("Hi"+name+"Welcome, the total cost is: "+total);
	
	
	
	}


}
