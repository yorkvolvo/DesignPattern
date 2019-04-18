package com.accenture.showcase.builder;


/**
 * Builder.java
 *  建造者
 */
abstract class Builder {

    abstract Builder buildNoodles(String msg);
    abstract Builder buildDrink(String msg);
    abstract Builder buildChicken(String msg);
    abstract Builder buildBeef(String msg);

    //获取套餐
    abstract Product create();
}

