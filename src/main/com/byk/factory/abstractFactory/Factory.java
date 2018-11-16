package com.byk.factory.abstractFactory;

/**
 * @Author: ykbian
 * @Date: 2018/11/16 15:32
 * @Todo:   生产衣服的场子
 */

public interface Factory {

    public Product createProduct();
    public Season createSeason();
}
