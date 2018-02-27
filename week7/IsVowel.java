import java.util.Scanner;

public class IsVowel
{
  public static void main (String [] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a character");
    char character;
    character = input.next().charAt(0);
    if(character == 'a')
    {
      System.out.println("Character " + character + " is a vowel");
    }
    else if(character == 'o')
    {
      System.out.println("Character " + character + " is a vowel");
    }
    else if(character == 'e')
    {
      System.out.println("Character " + character + " is a vowel");
    }
    else if(character == 'i')
    {
      System.out.println("Character " + character + " is a vowel");
    }
    else if(character == 'u')
    {
      System.out.println("Character " + character + " is a vowel");
    }
    else
    {
      System.out.println("Character " + character + " is not a vowel");
    }
  }
}
