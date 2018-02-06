package inclass;

import java.util.Date;
/**
* class summary.
*/

public class Increment {
  /**
  * method summary.
  */
  public static void main(String [] args) {
    System.out.println(new Date());
    int num1 = 1;
    int num2 = 2;
    int num3 = ++num2;
    int num4 = num1++;

    System.out.println("num1 = " + num1);
    System.out.println("num2 = " + num2);
    System.out.println("num3 = " + num3);
    System.out.println("num4 = " + num4);

  }
}
