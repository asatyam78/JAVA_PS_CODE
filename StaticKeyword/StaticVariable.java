package StaticKeyword;

public class StaticVariable {
  public static void main(String[] args) {
    Helper help1 = new Helper();
    Helper help2 = new Helper();

    help1.a++;
    help1.b++;

    System.out.println("Help1 a: " + help1.a); // 11
    System.out.println("Help2 a: " + help2.a); // 11
    System.out.println("Help1 b: " + help2.a); // 11
    System.out.println("Help2 b: " + help2.b); // 10
  }
}

class Helper {
  static int a = 10;
  int b = 10;
}