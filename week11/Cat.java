public class Cat {
  private String name;
  private int age;
  private String sound;

  /** constructor */
  public Cat(String n, int a, String s) {
    name = n;
    age = a;
    sound = s;
  }

  /** method to return the sound
  */
  public String say() {
    return sound;
  }
}
