package uek.bigdata.day16.demo.combination_01;

public class Main {
    public static void main(String[] args) {
        Father father = new Father();
        father.setAge(60);
        Mother mother = new Mother();
        mother.setName("王");
        Me me = new Me();
        me.setFather(father);
        me.setMother(mother);
        me.say();
    }
}
