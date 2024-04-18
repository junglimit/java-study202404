package day08.static_.practice;

public class Department {

    private String departmentName;
    private int studentCount;
    private static int totalStudents;




    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        totalStudents += studentCount;

    }



    public int getStudentCount() {
        return studentCount;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public void addStudent(int number) {
        this.studentCount += number;
        totalStudents += number;
    }

}
