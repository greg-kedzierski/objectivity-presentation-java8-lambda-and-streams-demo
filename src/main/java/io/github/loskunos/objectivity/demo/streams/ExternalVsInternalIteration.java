package io.github.loskunos.objectivity.demo.streams;

import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class ExternalVsInternalIteration {

  public static void main(String[] args) {

    System.out.println("External iteration via for loop");
    List<String> strings = asList("a", "b", "c");
    for (int i = 0; i < strings.size(); i++) {
      System.out.println(strings.get(i));
    }

    System.out.println("External iteration via explicit iterator");
    Iterator<String> iterator = strings.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println("External iteration via for-each loop");
    for (String s : strings) {
      System.out.println(s);
    }

    System.out.println("Internal iteration");
    strings.forEach(System.out::println);
  }
}
