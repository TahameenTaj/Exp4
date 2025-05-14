package Exp4;

import java.util.List; 
public class Student { 
private String name; 
private String program; 
private int semester; 
private List<Course> courses; 
public Student(String name, String program, int semester, List<Course> courses) { 
this.name = name; 
this.program = program; 
this.semester = semester; 
this.courses = courses; 
} 
public void displayStudentDetails() { 
System.out.println("Name: " + name); 
System.out.println("Program: " + program); 
System.out.println("Semester: " + semester); 
System.out.println("Courses Registered:"); 
for (Course course : courses) { 
System.out.println(" - " + course.getCourseName()); 
} 
} 
public void displayFailedCourses() { 
System.out.println("Courses with marks < 40:"); 
for (Course course : courses) { 
if (course.getMarks() < 40) { 
System.out.println(course.getCourseName() + " - " + course.getMarks()); 
} 
} 
} 
}

