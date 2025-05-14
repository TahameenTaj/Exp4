package Exp4;

import java.util.*; 
public class Main { 
public static void main(String[] args) { 
List<Course> courses = new ArrayList<>(); 
courses.add(new Course("Math", 85)); 
courses.add(new Course("Java", 35)); 
courses.add(new Course("DBMS", 55)); 
Student s = new Student("Alice", "BCA", 4, courses); 
s.displayStudentDetails(); 
s.displayFailedCourses(); 
} 
}

