import java.util.Scanner;

/** Create a class GradeBookMain to instantiate GradeBook class
*/

public class GradeBookMain {
  /** main method where execution begins.
  */
  public static void main (String args[]) {
    Scanner scanner = new Scanner(System.in);

    // first course information
    System.out.println("Enter a course name: ");
    String name = scanner.nextLine();

    System.out.println();

    GradeBook myGradeBook  = new GradeBook (name);

    System.out.println("Name: " + myGradeBook.getCourseName());
    System.out.println();

    // course tag
    System.out.println("Enter a course tag: ");
    String tag = scanner.nextLine();

    System.out.println();

    myGradeBook.setCourseTag(tag);
    myGradeBook.displayMessage();

    System.out.println();

    // second course information
    System.out.println("Enter another course name: ");
    name = scanner.nextLine();
    System.out.println("Enter another course tag: ");
    tag = scanner.nextLine();

    System.out.println();
    
    GradeBook myGradeBook2  = new GradeBook (name, tag);
    myGradeBook2.displayMessage();
  }
}
