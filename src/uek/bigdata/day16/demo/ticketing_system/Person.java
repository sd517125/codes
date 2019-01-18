package uek.bigdata.day16.demo.ticketing_system;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        if(age<0 || age>100) {
            System.out.print("年龄超出系统范围");
        }else {
            this.age = age;
        }
    }
    public int getAge() {
        return this.age;
    }
}
