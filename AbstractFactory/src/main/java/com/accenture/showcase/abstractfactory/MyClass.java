package com.accenture.showcase.abstractfactory;

import com.accenture.showcase.abstractfactory.interfaceWay.factory.CarFactory;
import com.accenture.showcase.abstractfactory.interfaceWay.productA.Engine;
import com.accenture.showcase.abstractfactory.interfaceWay.factory.LuxuryCarFactory;
import com.accenture.showcase.abstractfactory.interfaceWay.productB.Seat;

public class MyClass {

    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();
        Seat s = factory.createSeat();
        e.run();
        e.start();
        s.massage();
    }

}
