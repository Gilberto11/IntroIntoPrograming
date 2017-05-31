import java.util.Scanner;
public class Array2D{
	public static void main(String args[]){
	
	//declare variables
	String [][] words =  new String[2][4]; //2 rows and 4 columns
	
	//declare and create
	Scanner keyboard = new Scanner(System.in);
	
	int rows = words.length;
	//int cols = words[2].length;
	System.out.println ("Rows: " + rows);
	//System.out.println ("Columns: " + cols);
	
	for(rows = 0; rows < words.length; rows++){
		for (int cols = 0; cols < words[rows].length; cols++){
			System.out.println("Enter word for row index: "+rows+ " and cols index: "+cols);
			words[rows][cols] = keyboard.nextLine();
		}
	}
	//display
	for(rows = 0; rows < words.length; rows++){
		for (int cols = 0; cols < words[rows].length; cols++){
		System.out.println("Data at row index: "+rows+ " and cols index: "+cols);
		System.out.println(words[rows][cols]);
		
			}
		}
	
	}//end main
	
}//end class