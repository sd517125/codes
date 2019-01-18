package uek.bigdata.day16.demo.static02;

public class Test {
    public static void main(String[] args) {
        Student.setMajor("计算机应用技术");
        Student.setSchool("山西财专");
        Student student1 = new Student("赵柳莹");
        Student student2 = new Student("张瑜");
        student1.info();
        student1.study();
        student2.info();
        student2.study();
    }
}
