public class Polymorphism {
  public static void main(String[] args) {
    First first = new First();
    Second second = new Second();
    first.add(1, 2);  // prints 4
    second.add(1, 2);   // prints 3    
    second.add(1,2,3);
}
}

class First {
  public void add(int a, int b) {
      System.out.println(a + b + 1);
  }
  public void add(int a, int b, int c) {
      System.out.println(a + b + c);
  }
}
class Second extends First {
  public void add(int a, int b) {
    System.out.println(a + b);
}
}
