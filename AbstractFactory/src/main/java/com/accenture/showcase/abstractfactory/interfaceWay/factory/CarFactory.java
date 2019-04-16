package com.accenture.showcase.abstractfactory.interfaceWay.factory;


import com.accenture.showcase.abstractfactory.interfaceWay.productA.Engine;
import com.accenture.showcase.abstractfactory.interfaceWay.productB.Seat;
import com.accenture.showcase.abstractfactory.interfaceWay.productC.Tyre;

/**
 * 汽车工厂类
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
