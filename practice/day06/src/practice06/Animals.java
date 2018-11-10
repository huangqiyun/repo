package practice06;
/*
1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，setter和getter方法
        2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
        3.调用成员方法,打印格式如下:
        花色的波斯猫正在吃鱼.....
        花色的波斯猫正在逮老鼠....
        黑色的藏獒正在啃骨头.....
        黑色的藏獒正在看家.....
*/
public class Animals {
    public static void main(String[] args) {
        Cat animals=new Cat();
        animals.setBreed("波斯猫");
        animals.setColor("花色");
        animals.eat();
        animals.catchMouse();
        System.out.println(animals.getColor()+"的"+animals.getBreed()+"正在吃鱼....!");
        Dog animal=new Dog("黑色","藏獒");
        System.out.println(animal.getColor()+"的"+animal.getBreed()+"正在啃骨头!");



    }
}
