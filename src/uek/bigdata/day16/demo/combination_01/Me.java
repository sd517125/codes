package uek.bigdata.day16.demo.combination_01;

public class Me {
    private Father father;
    private Mother mother;

    public void setFather(Father father) {
        this.father = father;
    }
    public Father getFather() {
        return this.father;
    }
    public void setMother(Mother mother) {
        this.mother = mother;
    }
    public Mother getMother() {
        return this.mother;
    }

    //介绍爸爸妈妈
    public void say() {
        System.out.println("我的爸爸今年"+getFather().getAge()+"大了，"+getFather().work()+",妈妈的名字是"+getMother().getName()+","+getMother().work());
    }
}
