package com.example.factory.factory;

import com.example.factory.product.Product;
import com.example.factory.product.ProductB;

/**
 * @ FactoryB.java
 * @具体工厂B
 * 负责具体的产品B生产
 */
public class FactoryB extends Factory{
    @Override
    public Product getProduct() {
        return new ProductB();
    }
}

