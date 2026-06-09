package example.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("학생의 이름과 평균 학점을 입력하세요.");
        System.out.println("(입력을 끝내려면 내용 없이 엔터)");

        while (true) {
            String line = input.nextLine().trim();

            if (line.equals("")) {
                break;
            }

            int index = line.indexOf(' ');

            String name = line.substring(0, index);
            double gpa = Double.parseDouble(line.substring(index).trim());

            students.add(new Student(name, gpa));
        }

        System.out.println("검색할 이름은?");
        String searchName = input.nextLine().trim();

        for (Student s : students) {
            if (s.getName().equals(searchName)) {
                System.out.println("이름=" + s.getName() + ", 검색된 학점=" + s.getGpa());
                return;
            }
        }
    }
}

