import java.util.Scanner;

/**
* CMPSC 111, Spring 2018
* Class Example
* 11 April, 2018
* Purpose: A program that uses a switch statement on a character
* to determine if a given character is a lower case vowel or not.
*/

public class SwitchVowel {
  public static void main ( String args[] ) {
    Scanner input = new Scanner ( System.in );
    System.out.print ( "Enter a character to test: " );
    char character ;
    character = input.next().charAt(0);
    switch ( character ) {
      case 'a': 	// case labels
      case 'e': 	// separated by :
      case 'i': 	// character
      case 'o': 	// notice use of ' '
      case 'u': 	// marks for char tests
        System.out.println (character + " is a lowercase vowel");
        break;
      default:
        System.out.println (character + " is not a lowercase vowel");
    }
  }
}
