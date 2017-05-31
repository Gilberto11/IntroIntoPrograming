import java.util.Scanner; 
public class EnterSmallNumber{

	public static void main(String args[]){
	
		int userEntry; 
		
		final int LIMIT = 3;
		
		Scanner keyboard = new Scanner(System.in);		
		do {
		
		System.out.println (“Enter a number less than or equal to 3”);
			userEntry = keyboard.nextInt();
		} //end do
		while (userEntry > LIMIT);
		System.out.println(“You correctly entered “ + userEntry);
		}
}//end class
