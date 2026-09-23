# SWYNEX-Java-Fundamentals-Application
Java Fundamentals Application - SWYNEX Internship Task 1
# SWYNEX Java Fundamentals Application

##  Project Overview
This project is a console-based Java application developed as part of **SWYNEX Internship – Task 1: Java Fundamentals Application**.
The application manages basic contact details using a name and phone number. It demonstrates important Java programming concepts such as classes, objects, methods, collections, exception handling, constructors, loops, and switch-case statements.

##  Task Objective

Build a Java application demonstrating core programming concepts including:

- Classes and Objects
- Methods
- Collections
- Exception Handling
- Console-based Input/Output
- Clean Code Structure

##  Features

The application provides the following options:

1. **Add** – Add details of multiple persons.
2. **Delete** – Delete a person's details using their name.
3. **View** – View the phone number associated with a name.
4. **Exit** – Exit the application.

##  Technologies Used

- **Programming Language:** Java
- **Collection:** HashMap
- **Input Handling:** Scanner
- **Exception Handling:** InputMismatchException

##  Java Concepts Demonstrated

### Classes and Objects
The application uses separate classes for organizing the program.

### Constructor
A constructor is used to pass the `Scanner` object to the `resort` class.

### Methods
The application contains methods for:

- `add()`
- `remove()`
- `view()`

### Collection
A `HashMap<String, String>` is used to store:

text
`Name → Phone Number`

### Exception Handling
`InputMismatchException` is handled to manage invalid numeric input and prevent the application from terminating unexpectedly.

### Loops
A `do-while` loop is used to repeatedly display the dashboard and allow the user to perform multiple operations until the Exit option is selected.

### Switch-Case
A `switch` statement is used to execute the operation selected by the user from the dashboard.
