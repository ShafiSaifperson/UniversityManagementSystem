/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitymanagementsystem;

/**
 *
 * @author SHAFI
 */
public class Student {
    private String name;
    private String department;
    private String Address;
    private String emailAddress;
    private String MotherName;
    private String FatherName;
    private String[] CourseCode;
    private String[] CourseName;
    private String[] currentCourses;
    private String[] CompletedCourses;
    private int mobile;
    private int StudentID = 1234;
    private int totalCredits = 0;
    private int completedCredits = 0;
    
    public Student(){
        
        StudentID++;
    }

    public Student(String name, String department, String Address, String emailAddress, String MotherName, String FatherName, int mobile) {
        this.name = name;
        this.department = department;
        this.Address = Address;
        this.emailAddress = emailAddress;
        this.MotherName = MotherName;
        this.FatherName = FatherName;
        this.mobile = mobile;
        StudentID++;
    }

  

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", department=" + department + ", Address=" + Address + ", emailAddress=" + emailAddress + ", MotherName=" + MotherName + ", FatherName=" + FatherName + ", CourseCode=" + CourseCode + ", CourseName=" + CourseName + ", currentCourses=" + currentCourses + ", CompletedCourses=" + CompletedCourses + ", mobile=" + mobile + ", StudentID=" + StudentID + ", totalCredits=" + totalCredits + ", completedCredits=" + completedCredits + '}';
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getMotherName() {
        return MotherName;
    }

    public String getFatherName() {
        return FatherName;
    }

    public String[] getCourseCode() {
        return CourseCode;
    }

    public String[] getCourseName() {
        return CourseName;
    }

    public String[] getCurrentCourses() {
        return currentCourses;
    }

    public String[] getCompletedCourses() {
        return CompletedCourses;
    }

    public int getMobile() {
        return mobile;
    }

    public int getStudentID() {
        return StudentID;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public int getCompletedCredits() {
        return completedCredits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setMotherName(String MotherName) {
        this.MotherName = MotherName;
    }

    public void setFatherName(String FatherName) {
        this.FatherName = FatherName;
    }

    public void setCourseCode(String[] CourseCode) {
        this.CourseCode = CourseCode;
    }

    public void setCourseName(String[] CourseName) {
        this.CourseName = CourseName;
    }

    public void setCurrentCourses(String[] currentCourses) {
        this.currentCourses = currentCourses;
    }

    public void setCompletedCourses(String[] CompletedCourses) {
        this.CompletedCourses = CompletedCourses;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public void setCompletedCredits(int completedCredits) {
        this.completedCredits = completedCredits;
    }
    
}
