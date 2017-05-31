/*
* PPSNumber.java
* @ Author G Farrell
* 9 April 2017
*/

public class PPSNumber{

	// Declaring Variables
	
	private String name;
	private String ppsNumber;
	private int len;
	private char lastChar;
	private boolean valid;
	private String message;

	// Constructor
	
	public PPSNumber(){
	
		// Initialising Variables
		
		name="";
		ppsNumber="";
		len=0;
		lastChar='a';
		valid=false;
		message="";
	
	}
	
	// Setters
	
	public void setName(String name){
	
		this.name=name;
	
	}
	
	public void setPpsNumber(String ppsNumber){
	
		this.ppsNumber=ppsNumber;
	
	}
	
	// Compute
	
	public void compute(){
	
		len=ppsNumber.length();
		
		for(int i=0; i<len; i++){
			
			if(ppsNumber.charAt(0)==('1') && ppsNumber.charAt(1)==('2') && ppsNumber.charAt(2)==('3') 
				&& ppsNumber.charAt(len-1)==(lastChar) && len==(7)) {
				valid=true;
				message="Thank you "+name+". This is a valid PSS number.";
			}
			
			else{
				valid=false;
				message="I'm sorry "+name+". This is not a valid PPS number. Please try again.";
			}
		
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