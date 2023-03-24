package DynamicLoading;

public class DynamicLoading {
  public static void main(String[] args) {
    try {
      
      Class<?> myClass = Class.forName("DynamicLoading.Load");
      Object obj = myClass.getDeclaredConstructor().newInstance(); 
      ((Load)obj).printSomething(); 

    } catch (Exception e) { 
      System.err.println(e.getMessage());
    } 
  }
}
