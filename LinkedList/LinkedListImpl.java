package LinkedList;

import java.util.LinkedList;

public class LinkedListImpl {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
 
    // Adding elements
    ll.add(13);
    ll.add(45);
    ll.addLast(23);
    ll.addFirst(65);
    ll.add(2, 42);
    System.out.println(ll);

    //Changing elements
    ll.set(1, 25);
    ll.set(4, 50);
    System.out.println(ll);

    //Removing elements
    ll.remove(3);
    ll.removeFirst();
    ll.removeLast();
    System.out.println(ll);
  }
}
