/*
*JohnFarmer.java
*@author gilberto caobianco
*18 Feb 2017
*/


public class JohnFarmer{

private int box;
private int eggs;
private int leftover;




	public JohnFarmer(){
	
	box=0;
	eggs=0;
	leftover=0;
	
	
	
	}
	
	
	public void setEggs(int eggs){
	//the variable in here called number1 is the same as the variable called number1 in my app class.
		this.eggs=eggs;
	}
		
	public void setBox(int box){
	//the variable in here called number1 is the same as the variable called number1 in my app class.
		this.box=box;
	}
		

	public void compute(){

	box=eggs/12;
	leftover= eggs%12;
	
	}
	public int getLeftover(){
	return leftover;
	
	}
	
	public int getBox(){
	return box;
	
	}

	

}

