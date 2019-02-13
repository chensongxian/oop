package com.pagoda.InheritanceVSComposition.inheritance;

/**
 * @author csx
 * @Package com.pagoda.InheritanceVsComposition.inheritance
 * @Description: 蜜蜂类，继承昆虫类
 * @date 2019/2/13 0013
 */
public class Bee extends Insect {
    public Bee(int size, String color) {
        super(size, color);
    }

    @Override
    public void move() {
        System.out.println("Fly");
    }

    @Override
    public void attack() {
        move();
        super.attack();
    }
}
