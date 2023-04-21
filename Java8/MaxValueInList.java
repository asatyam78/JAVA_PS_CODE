package Java8;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find the maximum value element present in it using Stream functions?

public class MaxValueInList {
  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(44, 34, 22, 56, 23, 53);

    System.out.println(intList.stream().mapToInt(Integer::intValue).max().getAsInt());
  }
}
