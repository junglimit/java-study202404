package day08.static_.practice;

public class Main {
    public static void main(String[] args) {
        Department compSci = new Department("컴퓨터 과학", 200);
        Department biology = new Department("생물학", 150);
        Department chemistry = new Department("화학", 120);
        Department korean = new Department("국문", 100);

        compSci.addStudent(30);
        biology.addStudent(20);
        chemistry.addStudent(100);
        korean.addStudent(10);

        System.out.println("컴퓨터 과학과 학생 수: " + compSci.getStudentCount());
        System.out.println("생물학과 학생 수: " + biology.getStudentCount());
        System.out.println("화학과 학생 수: " + chemistry.getStudentCount());
        System.out.println("국문학과 학생 수: " + korean.getStudentCount());
        System.out.println("전체 학생 수: " + Department.getTotalStudents());


        System.out.println("===============================");


            Product product1 = new Product("노트북", 1000000);
            Product product2 = new Product("스마트폰", 500000);
            Product product3 = new Product("청소기", 120000);


            product1.sellProduct();
        for (int i = 0; i < 4; i++) {
            product2.sellProduct();
        }
            product3.sellProduct();

            System.out.println("총 판매액: " + Store.getTotalSales());
        }
    }







