package com.accenture.showcase.abstractfactory.interfaceWay.factory;


import com.accenture.showcase.abstractfactory.interfaceWay.productA.Engine;
import com.accenture.showcase.abstractfactory.interfaceWay.productA.LowEngine;
import com.accenture.showcase.abstractfactory.interfaceWay.productB.LowSeat;
import com.accenture.showcase.abstractfactory.interfaceWay.productB.Seat;
import com.accenture.showcase.abstractfactory.interfaceWay.productC.LowTyre;
import com.accenture.showcase.abstractfactory.interfaceWay.productC.Tyre;

/**
 * 低档汽车工厂类
 */
public class LowCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }

}
