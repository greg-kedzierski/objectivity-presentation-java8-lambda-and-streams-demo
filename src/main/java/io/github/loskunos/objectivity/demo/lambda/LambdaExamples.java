package io.github.loskunos.objectivity.demo.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class LambdaExamples {


  public static void main(String[] args) {
//    Fun fun = (int x, int y) -> x + y;
//    FunVoid funVoid = (int x, int y) -> {
//      int i = x + y;
//    };
//
//    Fun fun2 = (x, y) -> x + y;

    BinaryOperator<Integer> add = (x, y) -> x + y;

//    // effective final
//    String text = "Hello";
//    Supplier<String> sup = () -> text;
//
//    System.out.println(sup.get());
  }



//  interface Fun {
//    int sum(int a, int b);
//  }
//
//  @FunctionalInterface
//  interface FunVoid {
//    void sum(int a, int b);
//  }

}
