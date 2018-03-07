/** Define class GradeBook with a member method displayMessage.
*/

public class GradeBook {

  // instance variable
  private String courseName;
  private String courseTag;

  /** Constructor with one parameter.
  */
  public GradeBook (String name) {
    courseName = name;
  }

  /** Constructor with two parameters.
  */
  public GradeBook (String name, String tag) {
    courseName = name;
    courseTag = tag;
  }

  /** Method to change the value of the courseName.
  */
  public void setCourseName (String name) {
    courseName = name;
  }

  /** Method to return the value of the courseName.
  */
  public String getCourseName() {
    return courseName;
  }

  /** Method to change the value of the courseName.
  */
  public void setCourseTag (String tag) {
    courseTag = tag;
  }

  /** Method to return the value of the courseName.
  */
  public String getCourseTag() {
    return courseTag;
  }
  /** method to display a welcome message.
  */
  public void displayMessage() {
    System.out.println("Welcome to the Grade Book for " + getCourseName()+" tagged "+ getCourseTag());
  }
}
