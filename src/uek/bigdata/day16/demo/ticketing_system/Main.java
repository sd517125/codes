package uek.bigdata.day16.demo.ticketing_system;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Person person;
        while(true) {
            person = new Person();

            System.out.print("请输入姓名：");
            String name = scanner.next();
            //如果用户输入“n”,退出系统
            if("n".equalsIgnoreCase(name)) {
                break;
            }else {
                person.setName(name);
            }
            System.out.print("请输入年龄：");
            person.setAge(scanner.nextInt());

            //如果已经成年，票价20，未成年人免费入场
            if(person.getAge()>=18) {
                System.out.println(person.getName()+"的年龄为:"+person.getAge()+"门票价格为：20元");
            }else if(person.getAge()==0) {
                continue;
            }else {
                System.out.println(person.getName()+"的年龄为:"+person.getAge()+"门票免费");
            }
        }
        System.out.println("退出程序");
    }
}
