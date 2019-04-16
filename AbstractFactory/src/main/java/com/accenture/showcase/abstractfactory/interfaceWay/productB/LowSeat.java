package com.accenture.showcase.abstractfactory.interfaceWay.productB;

/**
 * 低档座椅
 */
public class LowSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("不能按摩！");
    }

}