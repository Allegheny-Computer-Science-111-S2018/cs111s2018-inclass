// Janyl Jumadinova
// 4 April, 2018

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CrimeFileReader {

  private static final String FILENAME = "SacramentocrimeJanuary2006.csv";
  private ArrayList<String> list;

  public CrimeFileReader() {
    list = new ArrayList<String>();
  }

  /** Method read a csv file and save it into an ArrayList
  */
  public void readFile() throws IOException {
    Scanner fileScanner = new Scanner(new File(FILENAME));
    while(fileScanner.hasNext()) {
      String line = fileScanner.nextLine();
      list.add(line);
    }
    System.out.println(list.get(2));
  }

  /** Method to return a list with the search word entries
  */
  public ArrayList<String> find (String word) {
    Iterator<String> listIterator = list.iterator();
    ArrayList<String> searchList = new ArrayList<String>();

    while(listIterator.hasNext()) {
      String line = listIterator.next();
      if(line.toLowerCase().contains(word)) {
        searchList.add(line);
      }
    }
    return searchList;
  }

}
