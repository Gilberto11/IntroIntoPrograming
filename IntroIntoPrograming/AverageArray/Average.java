/*
* Average.java
* @ Author G Caobianco
* 23 April 2017
*/

//Accepts 5 numbers from the user and get average

public class Average{

//Data members
private int avg;
private int sum;
private int arr[]; //Declaring array

//constructor

public  Average(){

arr = new int[5]; //Assigns an array with 5 spaces
sum = 0;
avg = 0;

}

//setters  when u have to ask the user for input

public void setArr(int arr[]){
	this.arr = arr;
	

}

//compute 

public void compute (){

	for(int i=0; i < arr.length; i++){ //getting the length of the array
	sum =  sum + arr[i]; // working out the sum of the array in the loop and storing back in the sum variable
	
	avg = sum/5; //getting the sum and dividing it by 5 and storing it back in average
	
	}

}

//getters
public int getAvg(){
	return avg;
}


}