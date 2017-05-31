/*
* Rainfall1.java
* @author Gilberto Caobianco Jr
* 11-04-2017
*/

// Develop an application that saves the daily mm rainfall over weeks as follows
//Week 1: 2,4,3,2,1,1,4
//week 2: 5,3,1,2,1,3,4
//week 3: 3,3,2,3,1,1,2
//week 4: 2,1,3,3,2,1,1
import java.util.*;
public class Rainfall1{
	public static void main(String args[]){

	int rainfall [][]={{2,4,3,2,1,1,4},{5,3,1,2,1,3,4},{3,3,2,3,1,1,2},{2,1,3,3,2,1,1}};
	
		for(int i=0; i < rainfall.length; i++){ //we know there is for weeks so i < 4 or use arr.length if we dont know
			for (int j=0; j < rainfall[i].length; j++){//again we know there is 7 days in a week so we could say as well j < 7
			System.out.print(rainfall[i][j]); //print will display horizontally in one line, while println will be many lines vertically
			}
			System.out.println();// if we do this it prints each week in a new line
		}
		
	}

} 