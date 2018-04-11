import java.util.Scanner;

/**
* CMPSC 111, Spring 2016
* Class Example
* March 28, 2016
* Purpose: A program that prints out "Hello words"
* user specified number of times using a switch statement.
**/
public class SwitchDemoBreak {
  public static void main ( String [] args ) {
 		int z;
		Scanner input = new Scanner ( System.in );
		System.out.print ("How many Hello Worlds (1-5)? ");
		z = input.nextInt();
 		switch (z) {
		     case 5 : System.out.println ( "Hello World" );
		     case 4 : System.out.println ( "Hello World" );
		     case 3 : System.out.println ( "Hello World" );
		     case 2 : System.out.println ( "Hello World" );
		     case 1 : System.out.println ( "Hello World" );
			      break;
		     default:
 	 	      System.out.println ( "You didn't enter 1-5!" );
		}
 	}
}
