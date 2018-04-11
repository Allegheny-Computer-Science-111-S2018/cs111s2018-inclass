import java.util.Scanner;
import java.text.DecimalFormat;

public class CalcMain {
  public static void main (String [] args) {
    Scanner scan = new Scanner (System.in);
    double left;
    double right;
    char operator;

    System.out.print("Enter a simple expression: ");
    left = scan.nextDouble();
    operator = scan.next().charAt(0);
    right = scan.nextDouble();

    System.out.print(left + " " + operator + " " + right + " = ");

    Calc calc = new Calc();
    double result = calc.calculate(left, operator, right);
    DecimalFormat format = new DecimalFormat("0.##");

    System.out.println(format.format(result));
  }
}
