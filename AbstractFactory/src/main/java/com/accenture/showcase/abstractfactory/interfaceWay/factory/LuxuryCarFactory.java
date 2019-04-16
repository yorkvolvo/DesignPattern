package com.accenture.showcase.abstractfactory.interfaceWay.factory;

import com.accenture.showcase.abstractfactory.interfaceWay.productA.Engine;
import com.accenture.showcase.abstractfactory.interfaceWay.productA.LuxuryEngine;
import com.accenture.showcase.abstractfactory.interfaceWay.productB.LuxurySeat;
import com.accenture.showcase.abstractfactory.interfaceWay.productB.Seat;
import com.accenture.showcase.abstractfactory.interfaceWay.productC.LuxuryTyre;
import com.accenture.showcase.abstractfactory.interfaceWay.productC.Tyre;

/**
 * 高端汽车类工厂
 */
public class LuxuryCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }

}

