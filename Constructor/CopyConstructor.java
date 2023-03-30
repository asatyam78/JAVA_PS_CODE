package Constructor;

public class CopyConstructor {
  public static void main(String[] args) {
    Student student = new Student("Abhishek", 23, 124);
		
		System.out.println("Contents of the original object");
		student.displayStudent();
		
		Student student_copy = new Student(student);
		
		System.out.println("Contents of the copied object");
		student_copy.displayStudent();
  }
}

class Student {
  final private int rollNumber;
	private int age;
	private String name;
	
	// default constructor
	public Student (String name, int age, int rollNumber){
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}	
	
	// copy constructor
	public Student (Student student) {
		this.rollNumber = student.rollNumber;
		this.name = student.name;
		this.age = student.age;
	}
    
	// method to print
	public void displayStudent () {
		System.out.println("Rollnumber : " + this.rollNumber);
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
	}
}