package LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import ArrayList.Phone;

public class DescendingIteratorObj {
  public static void main(String[] args) {
    Phone samsung = new Phone("Samsung S20 FE 5G", "Samsung", "8GB");
    Phone samsungUltra = new Phone("Samsung S22 Ultra", "Samsung", "16GB");
    Phone asus = new Phone("Asus Zenfone Max Pro M1", "Asus", "4GB");
    Phone nokia = new Phone("Nokia 5233", "Nokia", "1GB");

    LinkedList<Phone> list = new LinkedList<>(Arrays.asList(samsung, samsungUltra, asus, nokia));

    Iterator<Phone> it = list.descendingIterator();
    while (it.hasNext()) {
      it.next().printPhoneDetails();
    }
  }
}
