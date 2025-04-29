//StudentOperations.java

import java.util.*;

public class StudentOperations {
    private ArrayList<Student> students;

    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) throws StudentAlreadyExistsException {
        for (Student s : students) {
            if (s.getPRN() == student.getPRN()) {
                throw new StudentAlreadyExistsException("Student with PRN " + student.getPRN() + " already exists.");
            }
        }
        students.add(student);
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            for (Student s : students) {
                s.display();
            }
        }
    }

    // Search by PRN
    public Student searchByPRN(int prn) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getPRN() == prn) {
                return s;
            }
        }
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }
    // Update student
    public boolean updateStudent(int prn, String name, String branch, String batch, float cgpa) throws StudentNotFoundException {
        Student s = searchByPRN(prn);
        s.setName(name);
        s.setBranch(branch);
        s.setBatch(batch);
        s.setCGPA(cgpa);
        return true;
    }

    // Delete student
    public boolean deleteStudent(int prn) throws StudentNotFoundException {
        Student s = searchByPRN(prn);
        students.remove(s);
        return true;
    }
}
