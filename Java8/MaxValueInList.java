package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

//Given a list of integers, find the maximum value element present in it using Stream functions?

public class MaxValueInList {
  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(44, 34, 22, 56, 23, 53);

    OptionalInt max = intList.stream().mapToInt(Integer::intValue).max();
    if (max.isPresent())
      System.out.println(max.getAsInt());
    else
      System.out.println("List is empty");
  }
}
