package uek.bigdata.day16.demo.constructor03;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,0);
        Circle circle = new Circle(4,p1);
        System.out.println("圆的周长为:"+circle.getPerimeter());
        System.out.println("圆的面积为:"+circle.getArea());
        if(circle.isOn(p2)) {
            System.out.println("点在圆内");
        }else {
            System.out.println("点不在圆内");
        }
    }
}
