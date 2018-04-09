//***************************************
// CMPSC 111, Spring 2018
// Class Example
// 9 April, 2018
// Purpose: A program that demonstrates the
// usage of the do while loop
//*****************************************
public class Dowhile {
  public static void main ( String args[] ) {

    int a = 10;
    while(a < 10) {
      System.out.println("While Loop: " + a + " ");
      a++;
    }

    a = 10;
    do {
      System.out.println("Do while loop: " + a + " ");
      a++;
    }
    while(a < 10);

   }
}
