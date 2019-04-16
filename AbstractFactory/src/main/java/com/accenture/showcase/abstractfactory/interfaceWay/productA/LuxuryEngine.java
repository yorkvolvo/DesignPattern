package com.accenture.showcase.abstractfactory.interfaceWay.productA;

/**
 * 高档引擎
 * @author Administrator
 *
 */
public class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转的快！");
    }

    @Override
    public void start() {
        System.out.println("启动快!可以自动启停！");
    }

}

