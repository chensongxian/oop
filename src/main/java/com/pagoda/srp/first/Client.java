package com.pagoda.srp.first;

/**
 * @author csx
 * @Package com.pagoda.srp.first
 * @Description: TODO
 * @date 2019/2/12 0012
 */
public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");
    }
}

class Animal {
    public void breathe(String animal) {
        System.out.println(animal + "呼吸空气");
    }
}