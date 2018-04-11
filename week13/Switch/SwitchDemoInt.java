import java.util.Scanner;

/**
* CMPSC 111, Spring 2018
* Class Example
* 11 April, 2018
* Purpose: A program that uses a switch statement on an integer.
**/

public class SwitchDemoInt {
  public static void main ( String [] args ) {
    Scanner input = new Scanner ( System.in );
    System.out.print ( "Enter a number to evaluate: " );
    int foo;
    foo = input.nextInt();
    switch ( foo ) {// notice case labels are int vals!
      case 1 :
        System.out.println ( "You entered a one." );
        break;
      case 4 :
        System.out.println ( "You entered a four." );
        break;
      case 9 :
      case 17:
        System.out.println ( "Nine or seventeen." );
        break;
      case 2112:
        System.out.println ( "A cool number." );
        break;
      default:
        System.out.println ( "What?" );
    }
  }
}
