package com.byk.factory.factoryMethod;

/**
 * @Author: ykbian
 * @Date: 2018/11/16 15:33
 * @Todo:
 */

public class FactoryB  implements Factory {

    @Override
    public Product createProduct() {
        System.out.println("我这个工厂专门生产女装");
        return new ProductB();
    }
}
