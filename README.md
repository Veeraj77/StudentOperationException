# StudentOperationException

A Java application demonstrating CRUD (Create, Read, Update, Delete) operations on a student database using JDBC, with custom exception handling to manage various error scenarios.

---

## Features

- **Add Student**: Adds a new student record to the database.
- **View All Students**: Retrieves and displays all student records.
- **Update Student**: Modifies an existing student's details.
- **Delete Student**: Removes a student record from the database.
- **Custom Exception Handling**: Implements custom exceptions to handle specific error scenarios.

---

## Prerequisites

- Java Development Kit (JDK) 8 or higher.
- MySQL Database.
- MySQL JDBC Driver.

---
## Functions Used

### Main.java
public static void main(String[] args)

Entry point of the application. Displays the menu and takes user input for performing operations.

### StudentOperations.java

public void addStudent()

Prompts the user to input student details and adds a new student to the database.

public void viewAllStudents()

Retrieves and displays all student records from the database.

public void updateStudent()

Prompts the user to input student ID and new details, then updates the corresponding student record.

public void deleteStudent()

Prompts the user to input student ID and deletes the corresponding student record.

### StudentDAO.java
public void addStudent(Student student)

Adds a new student record to the database.

public List<Student> getAllStudents()

Retrieves all student records from the database.

public void updateStudent(Student student)

Updates an existing student record in the database.

public void deleteStudent(int id)

Deletes a student record from the database by ID.

InvalidInputException.java
public InvalidInputException(String message)

Custom exception class to handle invalid input errors.

### StudentAlreadyExistsException.java
public StudentAlreadyExistsException(String message)

Custom exception class to handle cases where a student already exists.

### StudentNotFoundException.java
public StudentNotFoundException(String message)

Custom exception class to handle cases where a student is not found.
