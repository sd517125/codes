package uek.bigdata.day16.demo.student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Computer computer = new Computer();
        computer.setBrand("联想");
        computer.setStatus("1000转/s");
        student.setName("张飞");
        student.setMajor("计算机应用技术");
        student.setComputer(computer);
        student.study();
    }
}
