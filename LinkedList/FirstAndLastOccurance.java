package LinkedList;

import java.util.LinkedList;

public class FirstAndLastOccurance {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();

    ll.add(13);
    ll.add(23);
    ll.add(45);
    ll.addFirst(65);
    ll.add(23);
    ll.add(2, 42);
    System.out.println(ll);

    int n = 23;
    System.out.println("First occurance of " + n + " is at " + ll.indexOf(n));
    System.out.println("Last occurance of " + n + " is at " + ll.lastIndexOf(n));
  }
}
