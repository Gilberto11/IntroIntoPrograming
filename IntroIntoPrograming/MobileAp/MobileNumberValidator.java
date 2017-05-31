/*
* MobileNumberValidator.java
* @ Author G Farrell
* 18 April 2017
*/

public class MobileNumberValidator{

	// Declaring Variables

	private String number;
	private int length;
	private boolean valid;
	private String message;
	
	// Constructor
	
	public MobileNumberValidator(){
	
		// Initialising Variables
		
		number="";
		length=0;
		valid=false;
		message="";
	
	}
	
	// Setter
	
	public void setNumber(String number){
	
		this.number=number;
	
	}
	
	// Process
	
	public void compute(){
	
		length=number.length();
		
		if(length==10){
		
			for(int i=0; i<3; i++){
			
				if(number.charAt(0)==('0') && number.charAt(1)==('8') && number.charAt(2)==('3') 
					|| number.charAt(2)==('5') || number.charAt(2)==('6') || number.charAt(2)==('7')) {
					
					valid=true;
					message="This is a valid mobile number.";
				}
			
				else{
					
					valid=false;
					message="This is not a valid mobile number. Please try again.";
				}
		
			}
		
		}
		
		else if(length<10){
		
			valid=false;
			message="This mobile number is too short. Please try again.";
		
		}
		
		else{
		
			valid=false;
			message="This mobile number is too long. Please try again.";
		
		}
	
	}
	
	// Getter
	
	public boolean getValid(){
	
		return valid;
	
	}
	
	public String getMessage(){
	
		return message;
	
	}

}