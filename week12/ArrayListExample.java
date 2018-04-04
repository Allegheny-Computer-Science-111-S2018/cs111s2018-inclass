//==========================================
// Class Example
// 2 April, 2018
// Purpose: This program demonstrates the usage of
// the ArrayList and a while loop
//==========================================
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.io.File;
import java.io.FileNotFoundException;

public class ArrayListExample {
  public static void main (String args[]) {
    // declare the starting file and scanner
    File inputsFile = null;
    Scanner input = null;
    // connect the scanner to the input file
    try {
      inputsFile = new File("words.txt");
      input = new Scanner(inputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }

    ArrayList<String> twitterWords = new ArrayList<String>();
    // read the text file and populate ArrayList
    while(input.hasNext()) {
      String word = input.next();
      twitterWords.add(word);
    }
    System.out.println(twitterWords);

    // print each element on a new line
    int index = 0;
    while(index < twitterWords.size()) {
      String word = twitterWords.get(index);
      System.out.println(word);
      index++;
    }
    System.out.println();

    // remove all words ending with "s"
    Iterator<String> wordsIterator = twitterWords.iterator();
    while(wordsIterator.hasNext()) {
      String word = wordsIterator.next();
      if(word.endsWith("s")) {
        wordsIterator.remove();
        System.out.println("Removed " + word);
      }
    }
    System.out.println(twitterWords);

    System.out.println();
    // print each element on a new line backwards
    index = twitterWords.size() - 1;
    while(index > 0) {
      String word = twitterWords.get(index);
      System.out.println(word);
      index--;
    }
  }
}
