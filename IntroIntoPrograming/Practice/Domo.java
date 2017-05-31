/*
* domo java application
*@author gilberto caobianco
* 23 - Feb - 2017
*/

public class Domo{

	private int adult;
	private int child;
	private String name;
	private final double ADULTCOST;
	private final double CHILDCOST;
	private double total;

	public Domo(){
	
	adult=0;
	child=0;
	name="";
	ADULTCOST=5.69;
	CHILDCOST=3.50;
	total=0;

	}
	
	public void setAdult(int adult){
	this.adult=adult;
	}
	
	public void setChild(int child){
	this.child=child;
	}
	
	public void setName(String name){
	this.name=name;
	}
	
	public void compute(){
	
	total=(ADULTCOST * adult)+(CHILDCOST * child);
	
	}
	
	public double getTotal(){
	return total;
	
	}
	

}