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
        // 2. charAt to return a single character
        char letter = word.charAt(4);
        System.out.println("Character at index 4: " + letter);
        // 3. get an index of a specific character
        int index = word.indexOf('p');
        System.out.println("Index of a letter p: "+index);
        // 4. replace a specific character
        System.out.println(word.replace('a','o'));
        
        // 5. convert to uppercase
        System.out.println(word.toUpperCase());
        
        // 6. use of substring
        String substring1 = word.substring(3);
        String substring2 = word.substring(2,4);
        System.out.println("Substring1 is :"+substring1+" substring2 is : "
        					+substring2);       
        
   }
}
