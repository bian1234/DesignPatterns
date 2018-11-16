package com.byk.factory.factoryMethod;

/**
 * @Author: ykbian
 * @Date: 2018/11/16 15:34
 * @Todo:
 */

public class FactoryC  implements Factory {

    @Override
    public Product createProduct() {
        System.out.println("我这个工厂专门生产童装");
        return new ProductC();
    }
}
