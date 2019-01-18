package uek.bigdata.day16.demo.constructor02;

public class Test {
    public static void main(String[] arsg) {
        Spot spot1 = new Spot(0,0);
        Spot spot2 = new Spot(3,4);
        System.out.println(spot1.getDistance(spot2));
    }
}
