package uek.bigdata.day16.demo.constructor01;

public class Vehicle {
    private double speed;   //速度
    private double volime;  //体积

    public void move() {
        System.out.println("体积为"+volime+"的交通工具"+"正以"+speed+"m/s的速度前进");
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public Vehicle addSpeed() {
        speed++;
        return this;
    }
    public Vehicle decelerate() {
        if(speed>0) {
            speed--;
        }
        return this;
    }
    public  Vehicle() {}
    public Vehicle(double speed,double volime) {
        if(speed>=0) {
            this.speed = speed;
        }else {
            System.out.print("赋值失败");
        }
        if(volime>=0) {
            this.volime = volime;
        }else {
            System.out.print("赋值失败");
        }
    }
}
