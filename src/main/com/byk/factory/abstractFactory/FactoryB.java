package com.byk.factory.abstractFactory;

/**
 * @Author: ykbian
 * @Date: 2018/11/16 15:33
 * @Todo:
 */

public class FactoryB  implements Factory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }


    @Override
    public Season createSeason() {
        return new SeasonB();
    }
}
