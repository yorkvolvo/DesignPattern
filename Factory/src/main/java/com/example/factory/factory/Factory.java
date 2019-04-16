package com.example.factory.factory;

import com.example.factory.product.Product;

/**
 *  @ Factory.java
 *    抽象工厂
 */
abstract class Factory {
    //生产产品
    abstract Product getProduct();
}