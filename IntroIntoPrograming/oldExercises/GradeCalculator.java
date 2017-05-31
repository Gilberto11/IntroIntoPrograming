import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
//create a program to calculate your grade from a,b,c,d and failed
		
		Scanner input = new Scanner(System.in);
		
		//declare variables
		int mark;
		//ask the user to enter the mark
		System.out.println("Please enter the mark");
		
		mark = input.nextInt();
		//output the grade
		if (mark>=85){
			System.out.println("You got an A");
		} else if (mark >=70 && mark <85){
			System.out.println("You got a B");
		} else if (mark >=55 && mark <70){
			System.out.println("you got a C");
		} else if (mark >=40 && mark <55){
			System.out.println("You got a D");	
		} else {
			System.out.println("You FAILED");
			
		}
	
	}
}
	
	
