package com.pagoda.InheritanceVSComposition.inheritance;

/**
 * @author csx
 * @Package com.pagoda.InheritanceVsComposition.inheritance
 * @Description: 昆虫类
 * @date 2019/2/13 0013
 */
public class Insect {
    private int size;
    private String color;

    public Insect(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Move");
    }

    public void attack() {
        move();  //假设昆虫在攻击前必须要先移动一次
        System.out.println("Attack");
    }
}
