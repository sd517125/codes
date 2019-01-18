package uek.bigdata.day16.demo.student;

public class Student {

    private String name;
    private String major;
    private Computer computer;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getMajor() {
        return this.major;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public Computer getComputer() {
        return this.computer;
    }

    public void study() {
        System.out.println("姓名是"+getName()+",专业是"+getMajor()+",使用的电脑的品牌是"+getComputer().getBrand()+",运行状态是"+getComputer().getStatus());
    }
}
