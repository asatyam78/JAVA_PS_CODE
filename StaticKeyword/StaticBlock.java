package StaticKeyword;

public class StaticBlock {
  static int a = 5;
  static int b;
    
  // static block --> runs before main class
  static {
      System.out.println("Inside Static block");
      b = a * 2;
  }

  public static void main(String[] args) {
      System.out.println("Value of a : "+a);
      System.out.println("Value of b : "+b);
  }
}
