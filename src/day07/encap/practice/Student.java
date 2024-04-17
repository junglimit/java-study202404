package day07.encap.practice;

// 학생의 이름(name), 학번(studentId), 학과(department) 정보를 관리하는 `Student` 클래스를 만드세요
public class Student {
    private String name;
    private String studentId;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty()){
            System.out.println("유효하지 않은 이름입니다.");
            return;
        }
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {

        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
