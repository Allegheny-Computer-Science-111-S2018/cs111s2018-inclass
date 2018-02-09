import java.util.Scanner;

/** This class demonstrates String class method usage.
* 12 February 2018
* @author Janyl Jumadinova
*/

public class StringExample
{

  /** This method uses methods of the String class
  * and manipulates a user given word
  */
  public static void main(String args[])
  {
        // declare a variable named word of type String
        String word;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");

        //assign the string to the variable:
        word = scan.nextLine();//"Alexander";

        //perform some actions on the string:

        // 1. retrieve the length by calling the length method:
        int length = word.length();
        System.out.println("Length: " + length);
   }
}
