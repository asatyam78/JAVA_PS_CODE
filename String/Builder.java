package String;

public class Builder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello Java");

    sb.replace(6, 7, "j");
    System.out.println(sb);

    sb.insert(6, "Java");
    System.out.println(sb);

    sb.delete(10, sb.length());
    System.out.println(sb);
  }
}
