/*
*Numbers.java
*@author gilberto caobianco
*18 Feb 2017
*/


/*Applications that ask the user what ticket they would like:
adult - 12.99
oap-7.88
student-5.99
child - 6.50
 the application should ask the user for their name and say welcome abroad followed by their name and total price tickets. Variables (10)
 */


public class Sparky{//Class declaration = <modifier> class <class name>{

private int adult; //<modifier><data type> <variable name>
private int oap;
private int student;
private int child;
private double total;
private String name="";
private final double STUDENTCOST=5.99;
private final double CHILDCOST=6.50;
private final double OAPCOST=7.88;
private final double ADULTCOST=12.99;



//constructor
	public Sparky(){

		adult=0;
		oap=0;
		student=0;
		child=0;
		total=0;

//setters
	}
	public void setName(String name){
	this.name=name;
	
	}
	
	public void setAdult(int adult){
	this.adult=adult;
	
	}
	
	public void setOAP(int oap){
	this.oap=oap;
	
	}
	
	public void setStudent(int student){
	this.student=student;
	
	}
	public void setChild(int child){
	this.child=child;
	
	}
	//Compute
	public void compute(){
	
	total=(STUDENTCOST*student)+(CHILDCOST*child)+(OAPCOST*oap)+(ADULTCOST*adult);
	
	}
	
	public double getTotal(){
	return total;//returning the total to the app class
	
	
	}
	

}