package org.javacs.action;

public class A {
    public static void main(String[] args){
        System.out.println("main");
        C c = new C();
        c.test();
        B b = new B();
        b.test();
        int y = Bar.test();
        System.out.println("B variable: "+b.v);
    }
}
