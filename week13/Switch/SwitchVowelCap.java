import java.util.Scanner;

/**
* CMPSC 111, Spring 2018
* Class Example
* 11 April, 2018
* Purpose: A program that uses a switch statement on a character
* to determine if a given character is a lower or an upper case vowel or not.
*/

public class SwitchVowelCap {
  public static void main ( String args[] ) {

    Scanner input = new Scanner ( System.in );
    System.out.print ( "Enter a character to test: " );
    char character ;
    character = input.next().charAt(0);

    switch ( character ) {  	// variable for switch always int or char
    case 'a': case 'A':	// can do multiple cases (implies OR)
    case 'e': case 'E':
    case 'i': case 'I':
    case 'o': case 'O':
    case 'u': case 'U':
      System.out.println ( character + " is a vowel" );
      break;
    default:
      System.out.printf ( character + " is not vowel" );
    }
  }
}
