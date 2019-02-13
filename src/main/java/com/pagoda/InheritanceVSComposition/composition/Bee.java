package com.pagoda.InheritanceVSComposition.composition;

/**
 * @author csx
 * @Package com.pagoda.InheritanceVSComposition.composition
 * @Description: 蜜蜂类，组合实现
 * @date 2019/2/13 0013
 */
public class Bee extends Insect implements Attack {
    private Attack attack;

    public Bee(int size, String color, Attack attack) {
        super(size, color);
        this.attack = attack;
    }

    @Override
    public void move() {
        attack.move();
    }

    @Override
    public void attack() {
        attack.attack();
    }
}
