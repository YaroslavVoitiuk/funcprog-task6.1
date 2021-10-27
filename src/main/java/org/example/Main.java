package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "hello world i am glad to see you";
        createDictionary(text);
    }
    public static void createDictionary(String text) {
        List<String> data = Arrays.asList(text.split(" "));
        data.stream()
                .sorted()
                .forEachOrdered(System.out::println);
    }
}
  //здесь было использовано Stream API