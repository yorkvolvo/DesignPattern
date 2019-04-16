package com.accenture.showcase.abstractfactory.interfaceWay.productC;


/**
 * 低档轮胎接口
 */
public class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转磨损快！");
    }

}
