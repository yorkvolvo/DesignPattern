package com.accenture.showcase.abstractfactory.interfaceWay.productB;

/**
 * 高档座椅
 */
public class LuxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("可以自动按摩！");
    }

}
