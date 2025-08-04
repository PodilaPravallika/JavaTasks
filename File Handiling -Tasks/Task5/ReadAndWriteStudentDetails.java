package tasks.filehandling;

import java.io.Serializable;

class Student implements Serializable
{
	String name;
	int rollno;
	int marks;
	
	public Student(String name, int rollno, int marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
}
public class ReadAndWriteStudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Rahul",101,75);
	}

}
