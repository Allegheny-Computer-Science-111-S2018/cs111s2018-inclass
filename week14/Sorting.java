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
		int temp = numbers[0];

		// iterate through the array
		/*for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length - 1; j++) {
				if(numbers[j] > numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}*/
		Arrays.sort(numbers);

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
