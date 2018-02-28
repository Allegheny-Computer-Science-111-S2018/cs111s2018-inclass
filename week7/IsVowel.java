import java.util.Scanner;

public class IsVowel
{
  public static void main (String [] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a character");
    char character;
    character = input.next().charAt(0);
    if(character == 'a' || character == 'o'
      || character == 'e' || character == 'i'
      || character == 'u')
    {
      System.out.println("Character " + character + " is a vowel");
    }
    else
    {
      System.out.println("Character " + character + " is not a vowel");
    }

    if( 2 > 1 && 2 < 3)
    {
      System.out.println("True");
    }
    else
    {
      System.out.println("False");
    }
  }
}
