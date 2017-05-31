/*
* Results.java
* @ Author G Farrell
* 23 April 2017
*/

public class Results{

	// Declaring Variables And 2 Dimensional Array
	
	private int[][] results;
	private int min;
	private int max;
	private int lowScore;
	private int highScore;
	
	public Results(){
	
	// Initialising Variables And 2 Dimensional Array
	
		results=new int[10][3];
		min=100;
		max=0;
		lowScore=0;
		highScore=0;
		
	}
	
	// Setter
	
	public void setResults(int[][] results){
	
		this.results=results;
	
	}
	
	// Process
	
	public void compute(){
	
		for(int i = 0; i < 10; i++){
		
			for(int j = 0; j < 3; j++){
			
				if(results[i][j]<min){
				
					min=results[i][j];
					
					lowScore=min;
				
				}
				
				if(results[i][j]>max){
				
					max=results[i][j];
					
					highScore=max;
				
				}
				
			}
		
		}
		
	}
	
	// Getters
	
	public int getLowScore(){
	
		return lowScore;
	
	}
	
	public int getHighScore(){
	
		return highScore;
	
	}

}