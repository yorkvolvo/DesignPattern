package com.example.factory;

import com.example.factory.factory.FactoryA;
import com.example.factory.factory.FactoryB;
import com.example.factory.product.Product;
import com.example.factory.product.ProductA;

public class MyClass {
    public static void main(String[] args) {
        //创建具体的工厂, 生产相对应的产品
        Product productA = new FactoryA().getProduct();
        Product productB = new FactoryB().getProduct();

        productA.intro();
        productB.intro();
    }
}
