package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?

public class CheckEmptyList {
  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(44, 34, 22, 56, 23, 53);
    List<Integer> intList2 = Arrays.asList();

    Optional.ofNullable(intList).filter(list -> !list.isEmpty())
        .ifPresent(list -> list.forEach(System.out::println));

    System.out.println("Second List");

    Optional.ofNullable(intList2).filter(list -> !list.isEmpty())
        .ifPresent(list -> list.forEach(System.out::println));
  }
}
