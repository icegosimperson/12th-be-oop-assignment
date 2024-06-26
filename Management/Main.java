package Management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // 학생 정보를 저장할 ArrayList 생성
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        // 학생 데이터 추가
        Student student1 = new Student("22012464", "lion1", 80, 80, 80);
        students.add(student1);

        Student student2 = new Student("22134265", "lion2", 75, 90, 85);
        students.add(student2);

        Student student3 = new Student("22227523", "lion3", 95, 85, 95);
        students.add(student3);

        Scanner sc = new Scanner(System.in);
        System.out.println("학생 관리 프로그램입니다. ");

        while(true) {
            System.out.println("1번 : 학생 등록, 2번 : 전체 조회, 3번 : 학생 검색, 4번 : 학생 정보 수정, 5번 : 학생 삭제, 6번 : 프로그램 종료");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("1번: 학생 등록 기능입니다.");
                    Register.registerStudent(sc, students);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("2번: 전체 조회 기능입니다.");
                    Fetch.fetchStudents(students);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("3번: 학생 검색 기능입니다.");
                    Search.searchStudent(sc, students);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("4번: 학생 정보 수정 기능입니다.");
                    Modify.modifyStudent(students, sc);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("5번: 학생 삭제 기능입니다.");
                    Delete.deleteStudent(students);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return; // 프로그램 종료

            }
        }
    }
}


