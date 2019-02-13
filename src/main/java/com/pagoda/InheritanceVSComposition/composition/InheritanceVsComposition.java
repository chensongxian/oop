package com.pagoda.InheritanceVSComposition.composition;

/**
 * @author csx
 * @Package com.pagoda.InheritanceVSComposition.composition
 * @Description: TODO
 * @date 2019/2/13 0013
 */
public class InheritanceVsComposition {
    public static void main(String[] args) {
        Bee a = new Bee(1, "black", new AttackImpl("fly", "move"));
        a.attack();

        // if you need another implementation of move()
        // there is no need to change Insect, we can quickly use new method to attack

        Bee b = new Bee(1, "black", new AttackImpl("fly", "sting"));
        b.attack();
    }
}
