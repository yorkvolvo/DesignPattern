package com.example.factory.SimpleFactory.product;

public class Audi implements Car {

    @Override
    public void run() {
        System.out.println("奥迪在跑！");
    }

}