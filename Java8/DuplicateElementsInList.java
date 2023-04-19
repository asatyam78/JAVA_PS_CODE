package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//How to find duplicate elements in a given integers list in java using Stream functions?

public class DuplicateElementsInList {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(2, 3, 6, 7, 4, 9, 2, 7);
    Set<Integer> set = new HashSet<>();
    list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
  }
}
