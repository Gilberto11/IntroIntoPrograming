/* count.java
* @author gilberto caobianco
* 25 march 2017
*/


public class StarsBackwards{
	public static void main (String args []){
	
	int bottles = 10;
	
	
	for (int row=0; row <10; row++){ //outer loop
	
	for(int col=bottles; col >= 1; col--){//inner loop
		System.out.print("*" ); 
		}// end inner loop
		bottles--;
		System.out.println(); 
		}//end outer
	
	}//end main
	
}//end class