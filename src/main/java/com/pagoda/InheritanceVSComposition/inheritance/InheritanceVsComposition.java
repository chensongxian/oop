package com.pagoda.InheritanceVSComposition.inheritance;

/**
 * @author csx
 * @Package com.pagoda.InheritanceVsComposition.inheritance
 * @Description: TODO
 * @date 2019/2/13 0013
 */
public class InheritanceVsComposition {
    public static void main(String[] args) {
        Insect i = new Bee(1, "red");
        i.attack();
    }
}
