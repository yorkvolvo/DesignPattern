package com.accenture.showcase.builder;

public class Client {

    public static void main(String[] args){
        Builder builder = new ConcreteBuilder()
                .buildBeef("beef")
                .buildChicken("chicken")
                .buildDrink("coco")
                .buildNoodles("noodles");

        Product product = builder.create();

        System.out.println(product.toString());
    }
}
