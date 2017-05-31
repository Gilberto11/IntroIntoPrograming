/*
* TsparkyApp.java
* @ author Gilberto Caobianco
* 23-feb-2017
*/
import java.util.*;
public class TsparkyApp{

	public static void main (String args[]){
	
	int adult;
	int child;
	int oap;
	int student;
	String name="";
	double total;
	
	Scanner keyboard;
	keyboard=new Scanner(System.in);
	Tsparky myTsparky;
	myTsparky=new Tsparky();
	
	System.out.println("Please enter your name");
	name=keyboard.nextLine();
	myTsparky.setName(name);
	
	System.out.println("How many adult tickets would you like?");
	adult=keyboard.nextInt();
	myTsparky.setAdult(adult);
	
	System.out.println("How many child tickets would you like?");
	child=keyboard.nextInt();
	myTsparky.setChild(child);
	
	System.out.println("How many oap tickets would you like?");
	oap=keyboard.nextInt();
	myTsparky.setOap(oap);
	
	System.out.println("How many students ticket would you like?");
	student=keyboard.nextInt();
	myTsparky.setStudent(student);
	
	myTsparky.compute();
	total= myTsparky.getTotal();
	System.out.println("Hi "+name+" the total of your ticket is: "+total);
	
	}


}