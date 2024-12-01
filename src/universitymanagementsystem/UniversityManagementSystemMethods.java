/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitymanagementsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author SHAFI
 */
public class UniversityManagementSystemMethods {
    // A list to store students
    private List<Student> studentList;
    private List<FacultyInformation> facultyList;
    // Constructor
    public UniversityManagementSystemMethods() {
        this.studentList = new ArrayList<>();
        this.facultyList = new ArrayList<>();
    }

    // Method to add a student (for testing)
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void addFaculty(FacultyInformation faculty) {
        facultyList.add(faculty);
    }

    // Method to remove a student by ID
    public boolean removeStudentById(int studentId) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentID()== studentId) {
                iterator.remove();
                System.out.println("Student with ID " + studentId + " has been removed.");
                return true; // Indicates successful removal
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
        return false; // Indicates student not found
    }
     public boolean removeFacultyById(int facultyId) {
        Iterator<FacultyInformation> iterator = facultyList.iterator();
        while (iterator.hasNext()) {
            FacultyInformation faculty = iterator.next();
            if (faculty.getFacultyID()== facultyId) {
                iterator.remove();
                System.out.println("Student with ID " + facultyId + " has been removed.");
                return true; // Indicates successful removal
            }
        }
        System.out.println("Student with ID " + facultyId  + " not found.");
        return false; // Indicates student not found
    }

    // Method to display all students
    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        System.out.println("Current Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
    public void displayFaculty() {
        if (facultyList.isEmpty()) {
            System.out.println("No faculty in the system.");
            return;
        }
        System.out.println("Current faculties:");
        for (FacultyInformation faculty : facultyList) {
            System.out.println(faculty );
        }
    }
}
