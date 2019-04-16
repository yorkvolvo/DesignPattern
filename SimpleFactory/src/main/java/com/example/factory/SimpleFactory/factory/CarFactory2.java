package com.example.factory.SimpleFactory.factory;


import com.example.factory.SimpleFactory.product.Audi;
import com.example.factory.SimpleFactory.product.Byd;
import com.example.factory.SimpleFactory.product.Car;

/**
 * 简单工厂类
 */
public class CarFactory2 {

    public static Car createAudi() {
        return new Audi();
    }

    public static Car createByd() {
        return new Byd();
    }

}

