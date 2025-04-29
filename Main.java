//Main.java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            // Display menu
            System.out.println("\nMenu:\n1. Add Student\n2. Display Students\n3. Search by PRN\n4. Search by Name\n5. Search by Position\n6. Update Student\n7. Delete Student\n8. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = scan.nextLine();
                        System.out.print("Enter PRN: ");
                        int prn = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter Branch: ");
                        String branch = scan.nextLine();
                        System.out.print("Enter Batch: ");
                        String batch = scan.nextLine();
                        System.out.print("Enter CGPA: ");
                        float cgpa = scan.nextFloat();
                        scan.nextLine();
                        operations.addStudent(new Student(name, prn, branch, batch, cgpa));
                        System.out.println("Student added successfully.");
                        break;

                    case 2:
                        operations.displayStudents();
                        break;

