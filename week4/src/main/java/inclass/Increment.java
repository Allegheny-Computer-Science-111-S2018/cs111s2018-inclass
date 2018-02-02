package inclass;
import java.util.Date;
public class Increment {
  public static void main(String args[]) {
    System.out.println(new Date());
    int num1 = 1;
    int num2 = 2;
    int num3 = ++num2;
    int num4 = num1++;

    System.out.println("a = " + num1);
    System.out.println("b = " + num2);
    System.out.println("c = " + num3);
    System.out.println("d = " + num4);

  }
}
