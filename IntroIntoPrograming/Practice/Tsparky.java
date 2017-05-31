/*
* Tsparky.java
* @ author Gilberto Caobianco
* 23 Feb 2017
*/


public class Tsparky{


	private int adult;
	private int child;
	private int oap;
	private double total;
	private String name;
	private int student;
	private final double ADULTCOST=5.00;;
	private final double CHILDCOST=2.50;
	private final double OAPCOST=3.00;
	private final double STUDENTCOST=4.00;
	
	public void Tsparky(){
	
	adult=0;
	child=0;
	oap=0;
	student=0;
	name="";
	total=0;
	
	
	}
	
	
	public void setAdult(int adult){
	this.adult=adult;
	}
	
	public void setChild(int child){
	this.child=child;
	}
	
	public void setOap(int oap){
	this.oap=oap;
	}
	
	public void setStudent(int student){
	this.student=student;
	}
	
	public void setName(String name){
	this.name=name;
	}
	
	public void setTotal(double total){
	this.total=total;
	}
	
	public void compute(){
	total=(ADULTCOST*adult)+(CHILDCOST*child)+(OAPCOST*oap)+(STUDENTCOST*student);
	}
	
	public double getTotal(){
	return total;
	}
	
	


}