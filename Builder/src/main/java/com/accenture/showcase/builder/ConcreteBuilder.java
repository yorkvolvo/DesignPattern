package com.accenture.showcase.builder;

/**
 * ConcreteBuilder.java
 *  具体建造者(服务员)
 */
public class ConcreteBuilder extends Builder {

    private Product product;

    public ConcreteBuilder(){
        product = new Product();
    }

    @Override
    Builder buildNoodles(String msg) {
        product.setBuildNoodles(msg);
        return this;
    }

    @Override
    Builder buildDrink(String msg) {
        product.setBuildDrink(msg);
        return this;
    }

    @Override
    Builder buildChicken(String msg) {
        product.setBuildChicken(msg);
        return this;
    }

    @Override
    Builder buildBeef(String msg) {
        product.setBuildBeef(msg);
        return this;
    }

    @Override
    Product create() {
        return product;
    }
}
