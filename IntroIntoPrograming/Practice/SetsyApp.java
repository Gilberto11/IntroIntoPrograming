/*
* SetsyApp.java
* @ author Gilberto Caobianco
* 23-feb-2017
*/
import java.util.*;
public class SetsyApp{

	public static void main (String args[]){
	
	
	int dildoBlack;
	int niggaDoll;
	int handcuffs;
	int vaseline;
	String name="";
	double total;
	
	
	Scanner keyboard;
	keyboard=new Scanner(System.in);
	Setsy mySetsy;
	mySetsy=new Setsy();
	
	System.out.println("Whats your name?");
	name=keyboard.nextLine();
	mySetsy.setName(name);
	
	System.out.println("How many 18 inches Black Dildos would you like up your arse?");
	dildoBlack=keyboard.nextInt();
	mySetsy.setDildoBlack(dildoBlack);
	
	System.out.println("How many pairs of handcuffs would you like for your orgy?");
	handcuffs=keyboard.nextInt();
	mySetsy.setHandcuffs(handcuffs);
	
	System.out.println("If you dont want dry, how many vaselines do you need?");
	vaseline=keyboard.nextInt();
	mySetsy.setVaseline(vaseline);
	
	
	mySetsy.compute();
	total=mySetsy.getTotal();
	System.out.println("Hey "+name+" all your toys for your GAYLORD party with sweeties will be: "+total);
	
	
	
	}


}