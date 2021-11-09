package Exercise2;

public class Lecturer {
    private String name;
    private int staffID, grade;

    public Lecturer(String name, int staffID, int grade) {
        this.name = name;
        this.staffID = staffID;
        this.grade = grade;
    }

    public String getName() {return name;}
    public int getStaffID() {return staffID;}
    public int getGrade() {return grade;}

    public String toString() {
        return ("Name: " + name + ", "
              + "Staff ID: " + staffID + ", "
              + "Grade: " + grade + " \n");
    }
    
}