package universitymanagementsystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAFI
 */
public class FacultyInformation {
    private String name;
    private int faultyID = 1234;
    private String department;
    private String uguni;
    private String ugSubject;
    private double ugCGPA;
    private String Muni;
    private String MSubject;
    private double MCGPA;
    private String PHDUNI;
    private String PHDresearchArea;
    private String Address;
    private String emailAddress;
    private String Office;
    private String[] CourseCode;
    private String[] CourseName;
    private String OfficeHours;
    
    
   FacultyInformation(){
       
   }

    public FacultyInformation(String name, String department, String uguni, String ugSubject, double ugCGPA, String Muni, String MSubject, double MCGPA, String PHDUNI, String PHDresearchArea, String Address, String emailAddress, String Office, String[] CourseCode, String[] CourseName, String OfficeHours) {
        this.name = name;
        this.department = department;
        this.uguni = uguni;
        this.ugSubject = ugSubject;
        this.ugCGPA = ugCGPA;
        this.Muni = Muni;
        this.MSubject = MSubject;
        this.MCGPA = MCGPA;
        this.PHDUNI = PHDUNI;
        this.PHDresearchArea = PHDresearchArea;
        this.Address = Address;
        this.emailAddress = emailAddress;
        this.Office = Office;
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.OfficeHours = OfficeHours;
    }

    public String getName() {
        return name;
    }

    public int getFaultyID() {
        return faultyID;
    }

    public String getDepartment() {
        return department;
    }

    public String getUguni() {
        return uguni;
    }

    public String getUgSubject() {
        return ugSubject;
    }

    public double getUgCGPA() {
        return ugCGPA;
    }

    public String getMuni() {
        return Muni;
    }

    public String getMSubject() {
        return MSubject;
    }

    public double getMCGPA() {
        return MCGPA;
    }

    public String getPHDUNI() {
        return PHDUNI;
    }

    public String getPHDresearchArea() {
        return PHDresearchArea;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getOffice() {
        return Office;
    }

    public String[] getCourseCode() {
        return CourseCode;
    }

    public String[] getCourseName() {
        return CourseName;
    }

    public String getOfficeHours() {
        return OfficeHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaultyID(int faultyID) {
        this.faultyID = faultyID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setUguni(String uguni) {
        this.uguni = uguni;
    }

    public void setUgSubject(String ugSubject) {
        this.ugSubject = ugSubject;
    }

    public void setUgCGPA(double ugCGPA) {
        this.ugCGPA = ugCGPA;
    }

    public void setMuni(String Muni) {
        this.Muni = Muni;
    }

    public void setMSubject(String MSubject) {
        this.MSubject = MSubject;
    }

    public void setMCGPA(double MCGPA) {
        this.MCGPA = MCGPA;
    }

    public void setPHDUNI(String PHDUNI) {
        this.PHDUNI = PHDUNI;
    }

    public void setPHDresearchArea(String PHDresearchArea) {
        this.PHDresearchArea = PHDresearchArea;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setOffice(String Office) {
        this.Office = Office;
    }

    public void setCourseCode(String[] CourseCode) {
        this.CourseCode = CourseCode;
    }

    public void setCourseName(String[] CourseName) {
        this.CourseName = CourseName;
    }

    public void setOfficeHours(String OfficeHours) {
        this.OfficeHours = OfficeHours;
    }

    @Override
    public String toString() {
        return "FacultyInformation{" + "name=" + name + ", faultyID=" + faultyID + ", department=" + department + ", uguni=" + uguni + ", ugSubject=" + ugSubject + ", ugCGPA=" + ugCGPA + ", Muni=" + Muni + ", MSubject=" + MSubject + ", MCGPA=" + MCGPA + ", PHDUNI=" + PHDUNI + ", PHDresearchArea=" + PHDresearchArea + ", Address=" + Address + ", emailAddress=" + emailAddress + ", Office=" + Office + ", CourseCode=" + CourseCode + ", CourseName=" + CourseName + ", OfficeHours=" + OfficeHours + '}';
    }
            
}
