package io.github.loskunos.objectivity.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReference {

  public static void main(String[] args) {

    // static method
    UnaryOperator<String> getProperty = System::getProperty;
    System.out.println(getProperty.apply("java.version"));

    // instance method on instance handler
    Supplier<Integer> length = "abc"::length;
    System.out.println(length.get());

    // instance method on instance handler
    Consumer<Object> printer = System.out::println;
    printer.accept("Hello!");

    // instance method on class handler
    Function<String, Integer> strLength = String::length;
    System.out.println(strLength.apply("Java"));

    // constructor handler handler
    List<String> strings = createList(ArrayList::new, "a", "b", "c");
    System.out.println(strings);

  }

  public static <T> List<T> createList(Supplier<List> listFactory, T... elems) {
    List<T> list = listFactory.get();
    if (elems != null) {
      for (T element : elems) {
        list.add(element);
      }
    }
    return list;
  }
}
