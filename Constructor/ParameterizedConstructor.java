package Constructor;

public class ParameterizedConstructor {
  public static void main(String[] args) {
    MangoSeller mangoSeller = new MangoSeller("Vivek", 978);
    mangoSeller.getDetails();
  }
}

class MangoSeller {
  String name;
  int noOfMangoes;

  // Parameterized Constructor
  MangoSeller(String name, int mangoes) {
    this.name = name;
    this.noOfMangoes = mangoes;
  }

  void getDetails() {
    System.out.println(this.name);
    System.out.println(this.noOfMangoes);
  }
}