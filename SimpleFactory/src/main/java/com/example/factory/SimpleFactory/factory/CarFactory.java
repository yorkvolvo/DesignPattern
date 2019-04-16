package com.example.factory.SimpleFactory.factory;

import com.example.factory.SimpleFactory.product.Audi;
import com.example.factory.SimpleFactory.product.Byd;
import com.example.factory.SimpleFactory.product.Car;

public class CarFactory {

    public static Car createCar(String type){
        if("奥迪".equals(type)){
            return new Audi();
        }else if("比亚迪".equals(type)){
            return new Byd();
        }else{
            return null;
        }
    }
}
