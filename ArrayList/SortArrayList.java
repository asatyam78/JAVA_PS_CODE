package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();

    al.add(23);
    al.add(44);
    al.add(1, 32);
    al.add(2, 55);
    System.out.println(al);

    Collections.sort(al);
    System.out.println("Array after sorting: " + al);

    Collections.sort(al, Collections.reverseOrder());
    System.out.println("Array after sorting in reverse order: " + al);
  }
}
