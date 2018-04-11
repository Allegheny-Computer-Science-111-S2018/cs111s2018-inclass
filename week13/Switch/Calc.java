public class Calc {
  private double result;

  // constructor
  public Calc() {
    result = 0;
  }
  /** method to calculate a simple expression
  */
  public double calculate (double left, char operator, double right) {
    switch (operator) {
      case '+' :
        result = left + right;
        break;
      case '-' :
        result = left - right;
        break;
      case '/' :
        result = left / right;
        break;
      case '*' :
        result = left * right;
        break;
      case '%' :
        result = left % right;
        break;
      default:
        System.out.println("Invalid operator");
    }
    return result;
  }
}
