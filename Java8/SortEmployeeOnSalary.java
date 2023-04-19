package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of Employee objects, sort the list based on employee salary? Assume Employee class having id, name, salary fields.

public class SortEmployeeOnSalary {
  public static void main(String[] args) {
    Employee e1 = new Employee(1, "Dhoni", 55000);
    Employee e2 = new Employee(2, "Virat", 45000);
    Employee e3 = new Employee(3, "Rohit", 50000);

    List<Employee> empList = Arrays.asList(e1, e2, e3);

    List<Employee> sortedEmpList = empList.stream().sorted(Comparator.comparing(Employee::getSalary))
        .collect(Collectors.toList());

    for (Employee emp : sortedEmpList) {
      System.out.println(emp.toString());
    }
  }
}
