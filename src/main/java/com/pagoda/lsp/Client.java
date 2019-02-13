package com.pagoda.lsp;

/**
 * @author csx
 * @Package com.pagoda.lsp
 * @Description: TODO
 * @date 2019/2/12 0012
 */
public class Client {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("100-50=" + a.func1(100, 50));
        System.out.println("100-80=" + a.func1(100, 80));
    }
}

class A {
    public int func1(int a, int b) {
        return a - b;
    }
}