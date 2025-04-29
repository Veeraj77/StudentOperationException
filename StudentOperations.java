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

