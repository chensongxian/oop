package com.pagoda.srp.second;

/**
 * @author csx
 * @Package com.pagoda.srp.second
 * @Description: TODO
 * @date 2019/2/12 0012
 */
public class Client {
    public static void main(String[] args) {
        Terrestrial terrestrial = new Terrestrial();
        terrestrial.breathe("牛");
        terrestrial.breathe("羊");
        terrestrial.breathe("猪");

        Aquatic aquatic = new Aquatic();
        aquatic.breathe("鱼");
    }
}

class Terrestrial {
    public void breathe(String animal) {
        System.out.println(animal + "呼吸空气");
    }
}

class Aquatic {
    public void breathe(String animal) {
        System.out.println(animal + "呼吸水");
    }
}