package com.byk.factory.simpleFactory;

/**
 * @Author: ykbian
 * @Date: 2018/11/16 15:07
 * @Todo:   工厂类
 */

public class Factory {

    public Product createProduct(int num){
        switch (num){
            case 1:
                return new ProductA();
            case 2:
                return new ProductB();
            default:
                System.out.println("甲方疯了");
                return null;
        }
    }


    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createProduct(1);
        factory.createProduct(2);
        factory.createProduct(0);
    }
}
