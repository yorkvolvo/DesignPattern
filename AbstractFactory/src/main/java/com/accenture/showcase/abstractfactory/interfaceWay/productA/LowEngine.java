package com.accenture.showcase.abstractfactory.interfaceWay.productA;

/**
 * 低档引擎
 * @author Administrator
 *
 */
public class LowEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转的慢！");
    }

    @Override
    public void start() {
        System.out.println("启动慢!");
    }

}

