package com.example.factory.SimpleFactory;

import com.example.factory.SimpleFactory.factory.CarFactory;
import com.example.factory.SimpleFactory.product.Car;

/**
 * 简单工厂情况下
 *
 * @author 尚学堂高淇 www.sxt.cn
 *
 */
public class Client { // 调用者

    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("比亚迪");

        c1.run();
        c2.run();

    }
}