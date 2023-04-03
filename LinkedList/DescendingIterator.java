package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class DescendingIterator {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();

    ll.add(13);
    ll.add(45);
    ll.addLast(23);
    ll.addFirst(65);
    ll.add(2, 42);
    System.out.println(ll);

    Iterator<Integer> it = ll.descendingIterator();
    while (it.hasNext())
      System.out.println(it.next());
  }
}
