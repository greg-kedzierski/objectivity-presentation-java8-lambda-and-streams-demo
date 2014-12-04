package io.github.loskunos.objectivity.demo.lambda;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaIntroduction {
  public static void main(String[] args) {
    Button button = new Button();

    // 1. Using Anonymous Classes
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(e);
      }
    });

    // 2. From Anonymous Classes to Lambda
    button.addActionListener((ActionEvent e) -> {
      System.out.println(e);
    });

    // 3. Moving from block statement to expression
    button.addActionListener((ActionEvent e) -> System.out.println(e));

    // 3. Remove type - using java type inference
    button.addActionListener(e -> System.out.println(e));

    // 3. From lambda expression to method reference
    button.addActionListener(System.out::println);
  }
}
