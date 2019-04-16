package com.example.factory.factory;

import com.example.factory.product.Product;
import com.example.factory.product.ProductA;

/**
 * @ FactoryA.java
 * 具体工厂A
 * 负责具体的产品A生产
 */
public class FactoryA extends Factory{
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}


