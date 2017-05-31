/*
* BinCollection.java
* @ Author G Farrell
* 18 April 2017
*/

public class BinCollection{

	private String binColour;
	private int apartmentNumber;
	private int num;
	private boolean valid;
	private String message;
	
	public BinCollection(){
	
		binColour="";
		apartmentNumber=0;
		num=0;
		valid=false;
		message="";
	
	}
	
	public void setBinColour(String binColour){
	
		this.binColour=binColour;
	
	}
	
	public void setApartmentNumber(int apartmentNumber){
	
		this.apartmentNumber=apartmentNumber;
	
	}
	
	public void compute(){
	
		num=apartmentNumber%2;
		
		if(binColour.equalsIgnoreCase("Brown")){
		
			if(num==1){
			
				valid=true;
				
				message="Your day for bin collection is Tuesday.";
			
			}
			
			else{
			
				message="Your day for bin collection is Monday.";
			
			}
		
		}
		
		else if(binColour.equalsIgnoreCase("Black")){
		
			if(num==1){
			
				valid=true;
				
				message="Your day for bin collection is Wednesday.";
			
			}
			
			else{
			
				message="Your day for bin collection is Tuesday.";
			
			}
		
		}
		
		else if(binColour.equalsIgnoreCase("Green")){
		
			if(num==1){
			
				valid=true;
				
				message="Your day for bin collection is Thursday.";
			
			}
			
			else{
				
				message="Your day for bin collection is Wednesday.";
			
			}
		
		}
		
		else{
		
			valid=false;
			
			message="Please enter a valid bin colour.";
		
		}
		
	}
	
	public boolean getValid(){
	
		return valid;
	
	}
	
	public String getMessage(){
	
		return message;
	
	}

}