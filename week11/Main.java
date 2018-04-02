public class Main {
  public static void main (String [] args) {
    Dog dog1 = new Dog("Flint", "woo");
    Dog dog2 = new Dog("Loxi", "raf");

    int count1 = 0;
    int count2 = 0;

    while(count1 < 6) {
      System.out.println(dog1.say());
      count2 = 0;
      while(count2 < 3) {
        System.out.println(dog2.say());
        count2++;
      }
      count1++;
    }
  }
}
