/**
* CMPSC 111, Class Example
* April 18, 2018
* @author Lewis/Loftus
* Purpose: Demonstrates the use of command line arguments
* Run as: java NameTag argument argument
* Run example: java NameTag Hi! Janyl
*/

public class NameTag {
	/** Prints a simple name tag using a greeting and
	* a name that is specified by the user.
	*/
	public static void main(String[] args) {
		System.out.println();
		System.out.println("   " + args[0]);
		System.out.println("My name is " + args[1]);
	}
}
