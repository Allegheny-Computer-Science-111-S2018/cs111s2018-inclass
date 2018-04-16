/**
* CMPSC 111, Class Exercise
* April 16, 2018
* @author Janyl Jumadinova
* Purpose: Demonstrate the usage of loops and arrays
*/

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class FirstNames {
	public static void main(String args[]) throws IOException {

		String [] names = new String[57];

		File file = new File("names.txt");
		Scanner input = new Scanner(file);

		// read from the file and save values into an array
		int count = 0;
		while(input.hasNext()) {
			String name = input.next();
			names[count] = name;
			count++;
		}

		// iterate through the array and print the names that start with a
    for(int i = 0; i < names.length; i++) {
		  if(names[i].startsWith("A")) {
				System.out.println(names[i]);
			}
    }
	}
}
