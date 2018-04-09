//***************************************
// CMPSC 111, Spring 2018
// Class Example
// 9 April, 2018
// Purpose: A program that demonstrates the
// usage of the nested for loop
//*****************************************
public class NestedForLoop {

  public static void main ( String args[] ) {

    for ( int x = 1; x <= 3 ; x++ ) { // outer
      for ( int y = 1; y <= 3 ; ++y ) { // middle
        for ( int z = 1; z <= 3 ; z += 1 ) { // inner
          System.out.println ( "x = "+x+", y = "+y+", z = "+z );
        }
      }
    }
  }
}
