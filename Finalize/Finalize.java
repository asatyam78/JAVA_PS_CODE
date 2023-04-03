package Finalize;

public class Finalize {
  public static void main(String[] args) {
    Finalize obj = new Finalize();
    obj = null; 
    System.gc(); 
    System.out.println("obj is destroyed successfully!");
  }
  @Override
  protected void finalize(){
    System.out.println("Inside finalize method!");
}
}
