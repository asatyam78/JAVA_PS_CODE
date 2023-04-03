package ArrayList;

import java.util.ArrayList;

public class ArrayListImpl {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();

    // Adding elements
    al.add(23);
    al.add(44);
    System.out.println(al);

    al.add(1, 32);
    al.add(2, 55);
    System.out.println(al);

    // Retrieving elements
    for (int i = 0; i < al.size(); i++) {
      System.out.println("Element at position " + i + " is " + al.get(i));
    }

    // Removing elements
    al.remove(2);

    System.out.println("Array after removing element at positon 2" + " --> " + al);
  }
}
