/*
*Numbers.java
*@author gilberto caobianco
*18 Feb 2017
*/

//1. class signature, when working with extending classes no need string args []...

public class Numbers{

//2. Data Members i.e variables


	private int num1; //good practice to put your variables as private so no one can steal your data.
	private int num2;
	private int total;
	//constructor plays importance when we link the docs together, its responsible for making that happen.
	
	public Numbers(){ //<access modifier><class name>(){
	
	num1=0;   //if was double would b 0.0 and zero coz use will provide input for variable num1
	num2=0;
	total=0;

	}
	
	//4. Setters
	// for every input u have a setter
	//returning in the number typed in from the user in the app class into here.
	
	public void setNum1(int num1){
	//the variable in here called number1 is the same as the variable called number1 in my app class.
		this.num1=num1;
	
	}
	
	public void setNum2(int num2){
		this.num2=num2;
		
	}
	
	//compute - calculations
	
	public void compute(){
	
	total=num1+num2;
	
	}
	
	// Getters = outputs
	//for very output, you have a getter
	
	public int getTotal(){
	return total;//returning the total to the app class
	
	
	}
	

}