package com.learnJava.defaults;

public class Client123 implements Interface1, Interface2, Interface3 {

    @Override
    public void methodA() {
        System.out.println("Inside Method A" + Client123.class);
    }

    public static void main(String[] args) {
        Client123 client123 = new Client123();
        client123.methodA(); //resolve to the child implementation
        client123.methodB();
        client123.methodC();
    }
}
