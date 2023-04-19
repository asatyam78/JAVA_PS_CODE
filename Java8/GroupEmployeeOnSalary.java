package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of Employee objects, group the list based on employee salary? Assume Employee class having id, name, salary fields.

public class GroupEmployeeOnSalary {
  public static void main(String[] args) {
    Employee e1 = new Employee(1, "Dhoni", 50000);
    Employee e2 = new Employee(2, "Virat", 50000);
    Employee e3 = new Employee(3, "Rohit", 50000);
    Employee e4 = new Employee(4, "Babar", 10000);
    Employee e5 = new Employee(5, "Rizwan", 10000);
    Employee e6 = new Employee(6, "Saheen", 10000);
    Employee e7 = new Employee(7, "Smith", 45000);
    Employee e8 = new Employee(8, "Finch", 45000);
    Employee e9 = new Employee(9, "Maxwell", 45000);

    List<Employee> empList = Arrays.asList(e2, e4, e1, e9, e7, e6, e3, e5, e8);

    Map<Integer, List<Employee>> groupEmp = empList.stream()
        .collect(Collectors.groupingBy(Employee::getSalary));

    for (int key : groupEmp.keySet()) {
      System.out.println(key + "-->" + groupEmp.get(key));
    }
  }
}
