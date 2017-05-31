/*
*Month.java
*@author Gilberto C. Junior
*11/03/16
*/

public class Month{
//data members

	private int month;
	private String message;
	
	
	
	
	
public Month(){

	month=0;


}


public void setMonth(int month){
	this.month=month;
}

public void compute(){



	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
		message="The amount of days is: 31 days";
	}
	else if(month==2){
		message= "The amount of days is: 28 days";
	}
	
	else if (month==4||month==6||month==9||month==11){
	message="There are 30 days in the month";
	}
	
	else{
	throw new IllegalArgumentException("Invalid number entered");
	
	}
	
	}

public String getMessage(){
return message;
}

}
	