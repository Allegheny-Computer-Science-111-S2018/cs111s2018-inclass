// Janyl Jumadinova
// 4 April, 2018

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class CrimeAnalyzer {
  private ArrayList<String> districtList;

  public CrimeAnalyzer() {
    districtList = new ArrayList<String>();
  }

  /** Method to find all districts matching the search searchWord
  */
  public void findDistricts(ArrayList<String> searchList) {
    Iterator<String> iterator = searchList.iterator();

    while(iterator.hasNext()) {
      String line = iterator.next();
      Scanner lineScanner = new Scanner(line);
      lineScanner.useDelimiter(",");
      lineScanner.next();
      lineScanner.next();
      String district = lineScanner.next();
      if(!districtList.contains(district)) {
        districtList.add(district);
      }
    }
  }

  /** Method to return the districtList
  */
  public ArrayList getDistricts() {
    return districtList;
  }
}
