package StaticKeyword;

public class StaticMethod {
  public static void main(String[] args) {
    Student.setSchoolName("SBPS");

    Student s1 = new Student("Rohit Sharma");
    Student s2 = new Student("Virat Kohli");

    System.out.println("Students are from " + Student.getSchoolName());
    s1.getStudentInfo();
    s2.getStudentInfo();
  }
}

class Student {
  String name;
  int rollNo;
  private static String schoolName;
  static int counter = 0;

  Student(String name) {
    this.name = name;
    this.rollNo = setRollNo();
  }

  private static int setRollNo() {
    // rollNo++; //Throws error as static method cannot refrence non static field
    counter++;
    return counter;
  }

  static void setSchoolName(String name) {
    schoolName = name;
  }

  static String getSchoolName() {
    return schoolName;
  }

  void getStudentInfo() {
    System.out.print("name: " + this.name + ',');
    System.out.print("rollNo: " + this.rollNo + ",");
    System.out.println("School: " + schoolName);
  }
}