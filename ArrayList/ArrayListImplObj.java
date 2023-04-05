package ArrayList;

import java.util.ArrayList;

//Implementation of Arralist

public class ArrayListImplObj {
  public static void main(String[] args) {
    ArrayList<Phone> objAl = new ArrayList<>();
    Phone samsung = new Phone("Samsung S20 FE 5G", "Samsung", "8GB");
    Phone asus = new Phone("Asus Zenfone Max Pro M1", "Asus", "4GB");
    Phone nokia = new Phone("Nokia 5233", "Nokia", "1GB");

    //Adding Elements
    objAl.add(samsung);
    objAl.add(asus);
    print(objAl);

    //Addding element at an index
    objAl.add(1, nokia);
    System.out.println("Arraylist after adding nokia -->");
    print(objAl);

    //Remove an element
    objAl.remove(nokia);
    System.out.println("Arraylist after removing nokia -->");
    print(objAl);
  }

  static void print(ArrayList<Phone> al) {
    for (Phone phone: al) {
      phone.printPhoneDetails();
    }
  }
}
