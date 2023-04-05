package ArrayList;

public class Phone {
  String name;
  String brand;
  String ram;

  public Phone(String name, String brand, String ram) {
    this.name = name;
    this.brand = brand;
    this.ram = ram;
  }

  public void printPhoneDetails() {
    System.out.println(this.name + "," + this.brand + "," + this.ram);
  }
}
