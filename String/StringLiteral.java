package String;

public class StringLiteral {
  public static void main(String[] args) {
    String s1 = "Hello Java";

    s1.replace('J', 'j');
    System.out.println(s1);

    s1 = s1.replace('J', 'j');
    System.out.println(s1);
  }
}
