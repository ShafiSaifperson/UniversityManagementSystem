/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universitymanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.SwingUtilities;
public class UniversityManagementSystem {
    static String[] businessCourses;
    static String[] engineeringCourses;
    static String[] humanitiesCourses;
    static String[] healthCourses;
    static List<FacultyInformation> facultyList = new ArrayList<>();
    static List<Student> studentList = new ArrayList<>();
    public static void main(String[] args) {
        UniversityManagementSystemMethods methods = new UniversityManagementSystemMethods();
        LoginSystem Admin = new LoginSystem("Kuddus", "1234");
        Scanner scanner = new Scanner(System.in);
            String fileName = "Available Courses.txt";
        try {
           
            Map<String, List<String>> coursesMap = loadCoursesFromFile(fileName);


            businessCourses = coursesMap.getOrDefault("School of Business and Economics", new ArrayList<>()).toArray(new String[0]);
            engineeringCourses = coursesMap.getOrDefault("School of Engineering and Physical Sciences", new ArrayList<>()).toArray(new String[0]);
            humanitiesCourses = coursesMap.getOrDefault("School of Humanities and Social Sciences", new ArrayList<>()).toArray(new String[0]);
            healthCourses = coursesMap.getOrDefault("School of Health and Life Sciences", new ArrayList<>()).toArray(new String[0]);

           
           // displayCourses();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
            int attempt = 5;
            while(attempt > 0){
            System.out.print("Enter username: ");
            String inputUsername = scanner.next();
            System.out.print("Enter password: ");
            String inputPassword = scanner.next();
            if (Admin.authenticate(inputUsername, inputPassword)) {
                System.out.println("Login successful! Welcome, " + Admin.getUsername() + "!");
                MainScreen();
                break; 
            } else {
                attempt --;
                System.out.println("Invalid username or password. "+attempt+" left");
            }
            
            }
            
    }
    public static void MainScreen(){
         
        initializeDummyData();

        
        SwingUtilities.invokeLater(() -> {
            AssignCoursesGUI gui = new AssignCoursesGUI(facultyList, engineeringCourses);
            gui.setVisible(true);
        });
    }
    public static Student AddingStudents(){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter Name:");
        String name = s.nextLine();
        System.out.println("Enter Address:");
        String address = s.nextLine();
        System.out.println("Enter department:");
        String department = s.nextLine();
        System.out.println("Enter Email Address:");
        String email = s.nextLine();
        System.out.println("Enter Mother Name:");
        String Mothername = s.nextLine();
        System.out.println("Enter Father Name:");
        String Fathername = s.nextLine();
        System.out.println("Enter Mobile Number:");
        int mobile = s.nextInt();
        Student student = new Student(name, department, address,  email,  Mothername,  Fathername, mobile);
        System.out.println(student.toString());
        s.close();
        return student;
        
    }
    public static FacultyInformation AddingFaculty(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = s.nextLine();
        System.out.println("Enter Address:");
        String address = s.nextLine();
        System.out.println("Enter department:");
        String department = s.nextLine();
        System.out.println("Enter Email Address:");
        String email = s.nextLine();
        System.out.println("Enter Name of the Undergraduate University:");
        String uUni = s.nextLine();
        System.out.println("Enter Subject of Undergraduate degree:");
        String uSub = s.nextLine();
        System.out.println("Enter undergraduate cgpa: ");
        double ugcgpa = s.nextDouble();
        System.out.println("Enter name of Master's University:");
        String mUni = s.nextLine();
        System.out.println("Enter subject of Master's:");
        String mSub = s.nextLine();
        System.out.println("Enter Masters cgpa: ");
        double Mcgpa = s.nextDouble();
        System.out.println("Enter name of pHD University: ");
        String pHDUni = s.nextLine();
        System.out.println("Enter Research Area:");
        String researchArea = s.nextLine();
        System.out.println("Enter undergraduate cgpa: ");
        FacultyInformation faculty = new FacultyInformation(ugcgpa,Mcgpa,name, department, uUni, uSub, mUni, mSub, pHDUni, researchArea, address, email);
        System.out.println(faculty.toString());
        return faculty;
    }
    public static Map<String, List<String>> loadCoursesFromFile(String fileName) throws IOException {
        Map<String, List<String>> coursesMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        String currentSchool = null;

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.endsWith(":")) { // Detect a school section
                currentSchool = line.substring(0, line.length() - 1); // Remove the colon
                coursesMap.putIfAbsent(currentSchool, new ArrayList<>());
            } else if (!line.isEmpty() && currentSchool != null) { // Add course to the current school
                coursesMap.get(currentSchool).add(line);
            }
        }
        reader.close();
        return coursesMap;
    }
    public static void displayCourses() {
        System.out.println("Courses Offered by the School of Business and Economics:");
        for (String course : businessCourses) {
            System.out.println(course);
        }

        System.out.println("\nCourses Offered by the School of Engineering and Physical Sciences:");
        for (String course : engineeringCourses) {
            System.out.println(course);
        }

        System.out.println("\nCourses Offered by the School of Humanities and Social Sciences:");
        for (String course : humanitiesCourses) {
            System.out.println(course);
        }

        System.out.println("\nCourses Offered by the School of Health and Life Sciences:");
        for (String course : healthCourses) {
            System.out.println(course);
        }
    }
    private static void initializeDummyData() {
        
        facultyList.add(new FacultyInformation(3.5, 3.7, "Dr. Ahsan", "Engineering", "BUET", "CSE", "MIT", "AI", "Harvard", "Robotics", "Dhaka", "ahsan@nsu.edu"));
        facultyList.add(new FacultyInformation(3.6, 3.8, "Dr. Hasan", "Engineering", "DU", "Physics", "Stanford", "Quantum Mechanics", "Cambridge", "Astrophysics", "Dhaka", "hasan@nsu.edu"));
        engineeringCourses = new String[]{"CSE115", "EEE141", "MAT120", "PHY107", "CSE215"};
    }
    

    
}
class LoginSystem {
    private String username;
    private String password;
    LoginSystem(){
        
    }
    LoginSystem(String username, String password){
        this.username = username;
        this.password = password;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
     public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    
    
}


