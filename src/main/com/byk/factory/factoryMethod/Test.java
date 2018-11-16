package com.byk.factory.factoryMethod;

/**
 * @Author: ykbian
 * @Date: 2018/11/16 15:07
 * @Todo: 工厂类
 */

public class Test {


    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        factoryA.createProduct();
        Factory factoryB = new FactoryB();
        factoryB.createProduct();
        Factory factoryC = new FactoryC();
        factoryC.createProduct();
    }
}
