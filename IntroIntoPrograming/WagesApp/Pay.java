/*
* Pay.java
* @author Gilberto Caobianco Junior
*04-Mar-2017#
*/

public class Pay{

	private double hours;
	private double basicRate;
	private double overtime;
	private double total;



	public void Pay(){
	
	hours=0.0;
	basicRate=0.0;
	total=0.0;
	overtime=0.0;
	
	}
	
	public void setHours(double hours){
	this.hours=hours;
	}
	
	public void setBasicRate(double basicRate){
	this.basicRate=basicRate;
	}
	
	public void setOvertime(double overtime){
	this.overtime=overtime;
	}
	
	
	public void setTotal(double total){
	this.total=total;
	}
	
public void compute(){
	total=(hours*basicRate)+(basicRate*overtime*1.5);
	}
	
	public double getTotal(){
	return total;
	}
	
	


}

