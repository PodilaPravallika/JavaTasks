package tasks.oops;

import model.Student;
import service.StudentService;

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student(101, "Pravallika", "CSE");
        StudentService service = new StudentService();

        service.saveStudent(student);
        service.printStudent();
    }
}

