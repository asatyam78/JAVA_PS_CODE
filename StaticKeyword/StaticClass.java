package StaticKeyword;

public class StaticClass {
  public static void main(String[] args) {
    Help.Hello1 hello1 = new Help.Hello1();
    hello1.message();
    // Help.Hello2 hello2 = new Help.Hello2();

    Help help = new Help();
    Help.Hello2 hello2 = help.new Hello2();
    hello2.message();
  }
}

class Help {
  static int a = 10;
  int b = 20;

  static class Hello1 {
    public void message() {
      System.out.println("Hello from static class");
      System.out.println(a);
      // System.out.println(b); //Throw error as b is not static.
    }
  }

  class Hello2 {
    public void message() {
      System.out.println("Hello from inner class");
      System.out.println(a);
      System.out.println(b);
    }
  }
}