import java.util.Scanner;
public class MyArrayEx{

	public static void main(String args[]){
	
	
	//declare variables
	int[] numbers = {5,4,3,2,1};
	//int numbers [] = new int [5];
	String words[] = new String [5];
	
	//decalre and create Scanner object
	Scanner keyboard = new Scanner(System.in);
	//String words[] = {"mon", "tue", "wed", "thu", "fri", "saturday"};
	
	//use myArraysName.length to see the length of my array
	int len = numbers.length;
	System.out.println("Then length of numbers array is "+len);
	
	int len2 = words.length;
	System.out.println("The length of words array is " + len2);
	
	//to see the data in my array
	
	for (int i=0; i < numbers.length; i++){
	
	System.out.println("At index " + i + " is " + numbers[i]);
	}
	System.out.println();
	for (int i=0; i< len; i++){
	
		System.out.println("At index " + i + " is " + numbers[i]);
		
		
		}
		System.out.println(numbers[2]);
		
		//data into an array from user
		for (int i=0; i < words.length; i++){
			System.out.println("Enter word for array position " +i);
			words[i] = keyboard.nextLine();
		}
		for (int i=0; i < words.length; i++){
			System.out.println("At index " +i+ " is " + words[i]);
			//words[i] = keyboard.nextLine();
		}
	}//end main
}//end class