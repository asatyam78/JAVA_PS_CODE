package Java8;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find out all the even numbers exist in the list using Stream functions?

public class EvenNumbersInList {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(2, 3, 6, 7, 4, 9);
    list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
  }
}
