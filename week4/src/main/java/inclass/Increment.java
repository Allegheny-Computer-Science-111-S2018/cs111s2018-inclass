package inclass;
import java.util.Date;
public class Increment {
  public static void main(String args[]) {
    System.out.println(new Date());
    int num_1 = 1;
    int Num2 = 2;
    int num3 = ++Num2;
    int num4 = num_1++;

    System.out.println("num1 = " + num_1);
    System.out.println("num2 = " + Num2);
    System.out.println("num3 = " + num3);
    System.out.println("num4 = " + num4);

  }
}
