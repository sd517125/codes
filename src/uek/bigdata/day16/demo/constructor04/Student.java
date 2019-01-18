package uek.bigdata.day16.demo.constructor04;

public class Student {
    private String name;
    private int id;
    private static int num = 1;

    public Student() {}
    public Student(String name) {
        this.name = name;
        id = num++;
    }

    public void method() {
        System.out.println("我叫"+this.name+",学号是"+this.id);
    }
}
