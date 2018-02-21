import java.util.Scanner;

public class Payments
{
	public static void main (String [] args)
	{
		// declare variables
		double loanAmount;
		double rate;
		int loanTerm;
		
		// create an instance of the Scanner
		Scanner scan = new Scanner (System.in);
		
		// obtain user's input
		System.out.println("Enter a loan amount");
		loanAmount = scan.nextDouble();
		System.out.println("Enter a rate");
		rate = scan.nextDouble();
		System.out.println("Enter loan term");
		loanTerm = scan.nextInt();
		
		double term = Math.pow(1 + rate, loanTerm);
		System.out.println("Term is: " + term); 
		
		double payment = loanAmount * rate * (term / (term - 1));
		System.out.println("Payment: "+ payment);
		
	}
	
}
