package Constructor;

public class DefaultConstructor {
  public static void main(String[] args) {
    Employee employee = new Employee();
    employee.id = 111;
    employee.name = "Abhinav";
    employee.details();
  }
}

class Employee {
  int id;
  String name;
  String organization;

  // Default Constructor
  Employee() {
    this.organization = "Publicis Sapient";
  }

  public void details() {
    System.out.println(this.id);
    System.out.println(this.name);
    System.out.println(this.organization);
  }
}