package uek.bigdata.day16.demo.constructor;

public class Person {
    private class Top {
        public void say() {
            System.out.println("我是头");
        }
    }
    private class Hand {
        public void say() {
            System.out.println("我是手");
        }
    }

    private Top top;
    private Hand leftHand;
    private Hand rightHand;

    private void method() {
        new Top().say();
        new Hand().say();
        System.out.println("我靠手生存");
    }

    public Person() {
        method();
    }
}
