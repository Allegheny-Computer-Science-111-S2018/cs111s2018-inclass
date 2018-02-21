import java.util.Scanner;
import java.util.Random;

public class NewIdentity
{
	public static void main (String [] args)
	{
		String firstName;
		String lastName;
		String job;
		
		int position;
		char letter;
		
		// position = 2; 
		
		// create an instance of Scanner
		Scanner scan = new Scanner(System.in);
		
		// create an instance of Random
		Random rand = new Random();
		
		// get the user's input
		System.out.println("Enter your first name");
		firstName = scan.nextLine();
		
		System.out.println("Enter your last name");
		lastName = scan.nextLine();
		
		System.out.println("Please enter your dream job");
		job = scan.nextLine();
		
		// modify the user's input
		position = rand.nextInt(firstName.length());
		letter = firstName.charAt(position);
		firstName = firstName.replace(letter, 'o');	
		System.out.println("Your new first name is: "+firstName);
		
		lastName = lastName.substring(1,3); //concat("ov");
		System.out.println("Your new last name is: "+lastName);
		
		job = job.toUpperCase();
		System.out.println("Your job is: "+job);
		
		System.out.println("Random float: " + rand.nextFloat()*10);
	}
}
