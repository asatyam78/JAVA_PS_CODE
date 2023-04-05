package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Sorting an ArrayList

public class SortArrayListOfObject {
  public static void main(String[] args) {
    ArrayList<Phone> al = new ArrayList<>();

    Phone samsung = new Phone("Samsung S20 FE 5G", "Samsung", "8GB");
    Phone samsungUltra = new Phone("Samsung S22 Ultra", "Samsung", "16GB");
    Phone asus = new Phone("Asus Zenfone Max Pro M1", "Asus", "4GB");
    Phone nokia = new Phone("Nokia 5233", "Nokia", "1GB");

    al.addAll(Arrays.asList(samsung, asus, samsungUltra, nokia));
    ArrayListImplObj.print(al);

    Collections.sort(al, (a,b) -> a.name.compareTo(b.name));
    System.out.println("After sorting -->");
    ArrayListImplObj.print(al);
  }
}
