package TryWithResource;

import java.io.FileOutputStream;

public class TryWithResource {
  public static void main(String[] args) {
    try (FileOutputStream fos = new FileOutputStream("file-output.txt")) {
      String text = "Hello! Everyone.";
      fos.write(text.getBytes());
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
