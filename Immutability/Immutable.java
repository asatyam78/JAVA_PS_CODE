package Immutability;

public class Immutable {
  public static void main(String[] args) {
    Person person = new Person("Kaustav", 22, "Dentist");
    System.out.println(person.getName());
    System.out.println(person.getAge());
    System.out.println(person.getOccupation());
  }
}

final class Person {
  private final String name;
  private final int age;
  private final String occupation;

  public Person(String name, int age, String occupation) {
      this.name = name;
      this.age = age;
      this.occupation = occupation;
  }

  public String getName() {
      return name;
  }

  public int getAge() {
      return age;
  }

  public String getOccupation() {
      return occupation;
  }
}