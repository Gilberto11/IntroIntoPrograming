STEPS TO REMEMBER FOR MAKING A JAVA APPLICATION:


1- Start with Comments on both files, ex: for sparky application
/*
*<App Name>  EX:Sparky.java
*@author <your name>  EX:gilberto caobianco
*<date>  EX:18 Feb 2017
*/

2- Class Signature
// class signature, when working with extending classes no need string args []...

<modifier>class<classname>{...}   // EX: public class Sparky {....}

3- Declaring Variables before the closing curly brackets from your class signature!

<modifier><datatype><variable name>;  //EX of declaring: private int adult;

4- You need to assign your variable inside of a Constructor

//Constructor Header
                                       
<access modifier><class name>(){   //EX:  public Sparky(){

//Now you can assign your variable
<variable name>=<value>;    //EX: adult=0;

}

5- Setters for every input you have a setter ( Method Header)


<modifier><return type><method name>(<parameters>){...}   //EX: public void setName(String name){ 
 														  //parameter is "type+variable
 this.name=name        								      // this.name=name;
                                                          // }

// Important to keep in mind that for every variable declared you need a setter, except variables where
// you have calculations such as total. ADULTCOST isnt a variable but a constant so no need setters

6- COMPUTE or PROCESS

// You need to declare your compute formula inside of a setter too, but this setter has no parameters, just empty brackets!

modifier><return type><method name>(){...}

//EX :public void compute(){
	
//    total=(STUDENTCOST*student)+(CHILDCOST*child)+(OAPCOST*oap)+(ADULTCOST*adult);
	
//	}



7- Straight after the COMPUTE formula you need a GETTER

modifier><return type><method name>(){...}

// EX:   public double getTotal(){
//     	 return total;//returning the total to the app class
//	}


Those are the 7 steps for making the first part of your java application.



NOW ITS TIME FOR THE MAIN PART, WHICH YOU BE NAMED THE SAMETHING BUT WITH App.java In the End


1- Comments
/*
*SparkyApp.java
*@author Gilberto Caobianco
*18 feb 2017
*/

2- Import the java Library

import java.util.*;

3- Create your Class

<modifier>class<classname>{...}     
// EX: public class SparkyApp{...}

4- Main Method still before the class closing brackets
 
 public static void main (String args[]){...}
 
5- Declare your variables again within the main method, before its closing curly brackets and without "private"
 
   //EX: 
   //int adult;
   //int oap;
   //int student;
   //int child;
   //double total;
   //String name="";
   
6- After importing the library on step 2 we need to create a name for using the library.

// EX: Scanner keyboard;
//     keyboard=new Scanner(System.in);

7- Create a link between the app file and the other one.
	<name of first file> My<name of first file>;
	My<name of first file>=new <name of first file>();
	
// EX: Sparky mySparky; // creates the link to the instan class
//	mySparky=new Sparky();

8- INPUT and for your input it always will be the System.out.println(""), for asking the user

      System.out.println("")
//EX: System.out.println("Please enter your name");
	   <variable>=<Scanner name given on step 6>.next<type>();
//   name=keyboard.nextLine();   the variable "name" is a string so we use nextLine, if it was an integer it would b nextInt();
        my<first file name>.set<variable>(variable);
//	    mySparky.setName(name);

9- Process or Calculation, The formula for this we created in the other file, all we have to do is to call it here!

We named the Setter for the calculations "compute", so we need to call it here again

my<file name>.compute();
//EX: mySparky.compute();


	total=mySparky.getTotal();//grab the total from my instan class and store in total here.
	
	
10- OUTPUT

it is again another System.out.println to print the output desired based on the app request.
But you need to concatenate your message with the values to be printed

// EX: System.out.println("Hi "+name+" Welcome Aboard"+" The total price of your tickets is: "+total);

   






