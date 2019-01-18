package uek.bigdata.day16.demo.constructor03;



public class Circle {
    private double r;   //半径
    private Point p;    //圆心

    public Circle() {}
    public Circle(double r,Point p) {
        this.r = r;
        this.p = p;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public Point getP() {
        return p;
    }

    //获得周长
    public double getPerimeter() {
        return 2*Math.PI*r;
    }
    //获得面积
    public double getArea() {
        return Math.PI*Math.pow(r,2);
    }
    //判断一个点是否在圆内
    public boolean isOn(Point p) {
        if(this.p.getDistance(p)>r) {
            return false;
        }else {
            return true;
        }
    }
}
