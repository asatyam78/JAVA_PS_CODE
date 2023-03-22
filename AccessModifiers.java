public class AccessModifiers {

  public static void main(String[] args) {
      MyClass obj = new MyClass();

      System.out.println(obj.a);
      // System.out.println(obj.b); //throws error
      System.out.println(obj.c);
  }

}

class MyClass {
  public int a = 1;
  private int b = 2;
  protected int c = 3;
}
