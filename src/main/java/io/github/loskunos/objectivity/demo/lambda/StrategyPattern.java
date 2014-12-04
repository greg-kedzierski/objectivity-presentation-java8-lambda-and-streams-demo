package io.github.loskunos.objectivity.demo.lambda;

public class StrategyPattern {

  public static interface Calculate {
    int calculate(int a, int b);
  }

  public static class Calculator {
    private final Calculate op;

    public Calculator(Calculate op) {
      this.op = op;
    }

    public int doOp(int a, int b) {
      return op.calculate(a, b);
    }
  }

  public static void main(String[] args) {
    Calculator sum = new Calculator(
        (a, b) -> a + b);
    System.out.println(sum.doOp(10,12));

    Calculator minus = new Calculator(
        (a, b) -> a - b);
    System.out.println(minus.doOp(10,12));
  }
}
