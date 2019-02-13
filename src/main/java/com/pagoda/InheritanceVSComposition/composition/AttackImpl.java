package com.pagoda.InheritanceVSComposition.composition;

/**
 * @author csx
 * @Package com.pagoda.InheritanceVSComposition.composition
 * @Description: TODO
 * @date 2019/2/13 0013
 */
public class AttackImpl implements Attack {
    private String move;
    private String attack;

    public AttackImpl(String move, String attack) {
        this.move = move;
        this.attack = attack;
    }

    @Override
    public void move() {
        System.out.println(move);
    }

    @Override
    public void attack() {
        move();
        System.out.println(attack);
    }
}
