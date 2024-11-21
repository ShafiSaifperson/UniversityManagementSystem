/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universitymanagementsystem;

import java.util.*;
public class UniversityManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginSystem Admin = new LoginSystem("Kuddus", "1234");
        Scanner scanner = new Scanner(System.in);
        
            int attempt = 5;
            while(attempt > 0){
            System.out.print("Enter username: ");
            String inputUsername = scanner.next();
            System.out.print("Enter password: ");
            String inputPassword = scanner.next();
            if (Admin.authenticate(inputUsername, inputPassword)) {
                System.out.println("Login successful! Welcome, " + Admin.getUsername() + "!");
                break; 
            } else {
                attempt --;
                System.out.println("Invalid username or password. "+attempt+" left");
            }
            
            }
             Student student = new Student();
            //AddingPeople(student);
            AddingFaculty();
            
    }
    public static void AddingPeople(Student student){
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
        student.setName(name);
        student.setAddress(address);
        student.setEmailAddress(email);
        student.setMotherName(Mothername);
        student.setFatherName(Fathername);
        student.setMobile(mobile);
        student.setDepartment(department);
        System.out.println(student.toString());
        s.close();
        
    }
    public static void AddingFaculty(){
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
        System.out.println("Enter name of Master's University:");
        String mUni = s.nextLine();
        System.out.println("Enter subject of Master's:");
        String mSub = s.nextLine();
        System.out.println("Enter name of pHD University: ");
        String pHDUni = s.nextLine();
        System.out.println("Enter Research Area:");
        String researchArea = s.nextLine();
        FacultyInformation faculty = new FacultyInformation(name, department, uUni, uSub, mUni, mSub, pHDUni, researchArea, address, email);
        System.out.println(faculty.toString());
        
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
