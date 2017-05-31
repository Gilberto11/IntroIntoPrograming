/*
*Cinema.java
*@author Gilberto C. Junior
*11/03/16
*/

//cinema
//age 5- ticket free
//under 14=5 euros
//60+ ticket =free
//anyone else = 10 euros

public class Cinema{
//data members

	private int age;
	private String message;



//Constructor

public Cinema(){

	age=0;


}


//setter

public void setAge(int age){
	this.age=age;
}

//Compute


public void compute(){


	if(age<=5 ||age>=60){
		message="Your admission is free";
	}

	else if(age>5 && age <=14){
		message= "Your ticket cost is 5 euros";
	}
	else{
	message="Your ticket cost is 10 euros";
	}

}

public String getMessage(){
return message;
}

}
