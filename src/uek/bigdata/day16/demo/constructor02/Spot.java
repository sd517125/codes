package uek.bigdata.day16.demo.constructor02;

public class Spot {
    private int x;
    private int y;
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }


    public Spot() {}
    public Spot(int x,int y) {
        this.x = x;
        this.y = y;
    }
    public double getDistance(Spot s) {
        return Math.sqrt(Math.pow((s.getX()-x),2) + Math.pow((s.getY()-y),2));
    }
}
