package HashSet;

import java.util.HashSet;

public class CompareHashSet {
  public static void main(String[] args) {
    HashSet<Integer> set1 = new HashSet<>();
    set1.add(13);
    set1.add(22);
    set1.add(9);
    set1.add(34);

    HashSet<Integer> set2 = new HashSet<>();
    set2.add(25);
    set2.add(12);
    set2.add(23);
    set2.add(37);

    HashSet<Integer> set3 = new HashSet<>();
    set3.add(25);
    set3.add(37);
    set3.add(23);
    set3.add(12);

    System.out.println(set1.equals(set2));
    System.out.println(set2.equals(set3));
  }
}
