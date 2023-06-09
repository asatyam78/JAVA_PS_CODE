package LinkedList;


//Implement Linked List

public class LinkedList {
  Node head;
  static class Node {
    int data; 
    Node next; 
    Node(int d) { 
      data = d; 
      next = null; 
    } 
  } 
  
  public static LinkedList insert(LinkedList list, int data) { 
    Node new_node = new Node(data); 

    if (list.head == null) { 
      list.head = new_node; 
    } 
    else {  
      Node last = list.head; 
      while (last.next != null) { 
          last = last.next; 
      } 

      last.next = new_node; 
    } 

    return list; 
  }

  public static LinkedList deleteByKey(LinkedList list, int key) {
    Node currNode = list.head;
    Node prev = null;

    if (currNode != null && currNode.data == key) {
      list.head = currNode.next; 
      System.out.println(key + " deleted");
      return list;
    }

    while (currNode != null && currNode.data != key) {
      prev = currNode;
      currNode = currNode.next;
    }

    if (currNode != null) {
        prev.next = currNode.next;
        System.out.println(key + " deleted");
    }

    if (currNode == null) {
        System.out.println(key + " not found");
    }
    return list;
    }
  
  public static void printList(LinkedList list) { 
    Node currNode = list.head; 
  
    System.out.print("LinkedList: "); 
    while (currNode != null) { 
        System.out.print(currNode.data + " "); 
        currNode = currNode.next; 
    } 
    System.out.println();
  }
  
  public static void main(String[] args) {
    LinkedList list = new LinkedList(); 
  
    list = insert(list, 1); 
    list = insert(list, 2); 
    list = insert(list, 3); 
    list = insert(list, 4); 
    list = insert(list, 5); 
    printList(list); 

    list = deleteByKey(list, 3);
    list = deleteByKey(list, 6);
    printList(list);
  }
}
