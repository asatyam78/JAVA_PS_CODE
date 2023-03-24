package String;

public class Buffer {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Hello Java");

    sb.replace(6,7,"j");
    System.out.println(sb);

    sb.insert(6, "Java");
    System.out.println(sb);

    sb.delete(10, sb.length());
    System.out.println(sb);
  }
}
