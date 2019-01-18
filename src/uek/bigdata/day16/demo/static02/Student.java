package uek.bigdata.day16.demo.static02;

public class Student {
    private int id;
    private String name;
    private static String major;
    private static String school;
    private static int count = 1;

    public Student() {}
    public Student(String name) {
        this.id = count++;
        this.name = name;
    }

    public static void setMajor(String major) {
        Student.major = major;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public void study() {
        System.out.println(name+"正在学习");
    }
    public void info() {
        System.out.println("我叫"+this.name+"，学号是"+this.id+"，专业是"+major+"，学校是"+school);
    }
}
