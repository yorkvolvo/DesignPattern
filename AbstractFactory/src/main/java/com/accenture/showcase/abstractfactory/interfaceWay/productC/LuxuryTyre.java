package com.accenture.showcase.abstractfactory.interfaceWay.productC;

/**
 * 高档轮胎接口
 */
public class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转不磨损！");
    }

}
