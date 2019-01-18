package uek.bigdata.day16.demo.static01;

/**
 * 类名称: TestId
 * <p>
 * 类描述:
 * <p>
 * 创建人： 优逸客大数据开发团队
 * 创建时间： 2019-01-18 16:32
 **/
public class TestId {

    public static void main(String[] args) {
        /**
         * id ： 类型于全局变量
         */
        Stu.school = "财专";
        Stu s1 = new Stu("田雨");
        s1.info();
    }
}

/**
 * 需求：方法，：name(有参构造方法赋值) ，id(不对其赋值， 但是有自增的功能)
 */
class Stu{

    //类变量
    static int score = 10;

    String name;
    int id;
    //类变量：
    static int count = 1;

    static String school;

    public Stu(){

    }

    public Stu(String _name){
        name = _name;
        id = count++;  // 1  2
    }

    public void info(){
        System.out.println("name:" +name+",id = "+ id +"学校："+ school); // 1
        //在成员方法中，调用类方法：
        testStatic();
        //调用类变量：
        System.out.println(score);

    }

    //类方法（类级别）
    public static void testStatic() {
        //成员变量（对象级别）
        //name = "宋鹏杰";
        //info();
        System.out.println("我是类方法！");
    }

    /**
     * 需求：在当前类的模版代码上进行修改，添加一个属性：该属性所有对象的属性值一致：school= 财专
     * 不容许在类中直接赋值，要求测试类中赋值：
     */

}