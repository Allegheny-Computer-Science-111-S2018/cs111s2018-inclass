import java.util.Scanner;

/** Create a class GradeBookMain to instantiate GradeBook class
*/

public class GradeBookMain {
  /** main method where execution begins.
  */
  public static void main (String args[]) {
    Scanner scanner = new Scanner(System.in);

    //course name
    System.out.println("Enter a course name: ");
    String name = scanner.nextLine();

    System.out.println();

    GradeBook myGradeBook  = new GradeBook ();
    System.out.println("Original name: " + myGradeBook.getCourseName());
    myGradeBook.setCourseName(name);
    myGradeBook.displayMessage();
    System.out.println();

    // course tag
    System.out.println("Enter a course tag: ");
    String tag = scanner.next();

    System.out.println();

    System.out.println("Original tag: " + myGradeBook.getCourseTag());
    myGradeBook.setCourseTag(tag);
    myGradeBook.displayMessage();
  }
}
