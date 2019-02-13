package com.pagoda.srp.third;

/**
 * @author csx
 * @Package com.pagoda.srp.third
 * @Description: TODO
 * @date 2019/2/12 0012
 */
public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");
        animal.breathe2("鱼");
    }
}

class Animal {
    public void breathe(String animal) {
        System.out.println(animal + "呼吸空气");
    }

    public void breathe2(String animal) {
        System.out.println(animal + "呼吸水");
    }
}
