package com.pagoda.InheritanceVSComposition.composition;

/**
 * @author csx
 * @Package com.pagoda.InheritanceVSComposition.composition
 * @Description: TODO
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
}
