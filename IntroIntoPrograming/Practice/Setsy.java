/*
* Setsy.java
* @ author Gilberto Caobianco
* 23-feb-2017
*/

public class Setsy{


	private int dildoBlack;
	private int niggaDoll;
	private int handcuffs;
	private int vaseline;
	private String name;
	private double total;
	private final double DILDOBLACKCOST=10.00;
	private final double NIGGADOLLCOST=15.00;
	private final double HANDCUFFSCOST=7.00;
	private final double VASELINECOST=5.00;
	
	
	public Setsy(){
	
	dildoBlack=0;
	niggaDoll=0;
	handcuffs=0;
	vaseline=0;
	name="";
	total=0;
	}
	
	public void setDildoBlack(int dildoBlack){
	this.dildoBlack=dildoBlack;
	}
	
	public void setNiggaDoll( int niggaDoll){
	this.niggaDoll=niggaDoll;
	}
	
	public void setHandcuffs(int handcuffs){
	this.handcuffs=handcuffs;
	}
	
	public void setVaseline(int vaseline){
	this.vaseline=vaseline;
	}
	
	public void setName(String name){
	this.name=name;
	}
	
	public void setTotal(double total){
	this.total=total;
	}
	
	public void compute(){
	total=(DILDOBLACKCOST * dildoBlack)+(NIGGADOLLCOST * niggaDoll)+(HANDCUFFSCOST * handcuffs)+(VASELINECOST * vaseline);
	}
	
	public double getTotal(){
	return total;
	}
	


}