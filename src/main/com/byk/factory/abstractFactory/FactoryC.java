package com.byk.factory.abstractFactory;

/**
 * @Author: ykbian
 * @Date: 2018/11/16 15:34
 * @Todo:
 */

public class FactoryC  implements Factory {

    @Override
    public Product createProduct() {
        return new ProductC();
    }


    @Override
    public Season createSeason() {
        return new SeasonC();
    }
}
