package com.syntax.reviewclass7;

class Student {
    static int totalStudentCount;
    static final String schoolName = "Syntax";
    String name;
    final static int MAX_STUDENTS_ALLOWED = 3;
    private static Student student = null;

    private Student() {
        totalStudentCount++;
    }

    static Student getInstance() {
        if (student == null) {
            student = new Student();
        }
        return student;

    }

    void printInfo() {
        System.out.println("Name of the student "
                + name + " Name of the school "
                + schoolName + " Total Students registered " + totalStudentCount);
    }
}


public class StaticVarDemo {

    public static void main(String[] args) {


        Student student5 = Student.getInstance();
        student5.name = "Mahmut";
        student5.printInfo();

        Student student6 = Student.getInstance();
        student6.name = "Davit";
        student6.printInfo();
        System.out.println(student5.name);
        System.out.println(student6.name);

       // Student student=new Student();
     /*   School school = new School();
        Student student1 = new Student();
        student1.name = "Ali";
        student1.printInfo();
        school.addStudent(student1);
        Student student2 = new Student();
        student2.name = "Khaliqyar";
        student2.printInfo();
        school.addStudent(student2);
        Student student3 = new Student();
        student3.name = "Danilo";
        student3.printInfo();
        school.addStudent(student3);
        Student student4 = new Student();
        student4.name = "Fahim";
        student4.printInfo();
        school.addStudent(student4);
        Student student5 = new Student();
        student5.name = "Mahmut";
        student5.printInfo();*/





    }
}
