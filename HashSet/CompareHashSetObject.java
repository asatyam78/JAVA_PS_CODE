package HashSet;

import java.util.Arrays;
import java.util.HashSet;
import ArrayList.Phone;

public class CompareHashSetObject {
  public static void main(String[] args) {
    Phone samsung = new Phone("Samsung S20 FE 5G", "Samsung", "8GB");
    Phone samsungUltra = new Phone("Samsung S22 Ultra", "Samsung", "16GB");
    Phone asus = new Phone("Asus Zenfone Max Pro M1", "Asus", "4GB");
    Phone nokia = new Phone("Nokia 5233", "Nokia", "1GB");

    HashSet<Phone> set1 = new HashSet<>(Arrays.asList(samsung, nokia, asus));
    HashSet<Phone> set2 = new HashSet<>(Arrays.asList(samsungUltra, asus, nokia));
    HashSet<Phone> set3 = new HashSet<>(Arrays.asList(asus, samsung, nokia));

    System.out.println(set1.equals(set2));
    System.out.println(set1.equals(set3));
  }
}
