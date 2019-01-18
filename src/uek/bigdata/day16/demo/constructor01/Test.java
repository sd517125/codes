package uek.bigdata.day16.demo.constructor01;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(10,34);
        vehicle.move();
        vehicle.addSpeed().addSpeed().addSpeed();
        vehicle.move();
        vehicle.decelerate().decelerate();
        vehicle.move();
    }
}
