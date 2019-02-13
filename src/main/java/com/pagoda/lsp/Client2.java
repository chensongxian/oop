package com.pagoda.lsp;

/**
 * @author csx
 * @Package com.pagoda.lsp
 * @Description: TODO
 * @date 2019/2/12 0012
 */
public class Client2 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("100-50=" + b.func1(100, 50));
        System.out.println("100-80=" + b.func1(100, 80));
        System.out.println("100+20+100=" + b.func2(100, 20));
    }
}

class B extends A {
    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 100;
    }
}
