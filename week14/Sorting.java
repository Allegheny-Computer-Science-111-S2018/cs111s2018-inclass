/**
* CMPSC 111, Class Exercise
* April 16, 2018
* @author Janyl Jumadinova
* Purpose: Demonstrate the usage of loops and arrays
*/

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
	public static void main(String args[]) throws IOException {

		int [] numbers = new int[100];

		File file = new File("numbers.txt");
		Scanner input = new Scanner(file);

		// read from the file and save values into an array
		int count = 0;
		while(input.hasNext()) {
			numbers[count] = input.nextInt();
			count++;
		}

		// Record the start time of the sorting
		long startTime = System.nanoTime();

		// TO DO: sort the array in ascending order

		// iterate through the array
		for(int i = 0; i < numbers.length; i++) {
			// print out each element of the array
			System.out.println(numbers[i]);
    }

		// Record the end time of the sorting
		long endTime = System.nanoTime();

		// print out sorted array
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
    }

		// calculate and print out the time it took to sort the array
		long sortingTime = (endTime - startTime) / 1000;
		System.out.println("Time it took to sort the array: " + sortingTime + " ms");
	}
}
