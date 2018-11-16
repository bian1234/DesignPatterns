package com.byk.factory.abstractFactory;

/**
 * @Author: ykbian
 * @Date: 2018/11/16 15:07
 * @Todo: 工厂类
 */

public class Test {


    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        factoryA.createProduct();
        factoryA.createSeason();
        System.out.println("++++++++++++++++++++++++++++");
        Factory factoryB = new FactoryB();
        factoryB.createProduct();
        factoryB.createSeason();
        System.out.println("++++++++++++++++++++++++++++");

        Factory factoryC = new FactoryC();
        factoryC.createProduct();
        factoryC.createSeason();
    }
}
