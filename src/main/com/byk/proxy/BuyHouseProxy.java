package com.byk.proxy;

/**
 * @Author: ykbian
 * @Date: 2018/11/15 11:33
 * @Todo:  创建静态代理
 */

public class BuyHouseProxy implements BuyHouse{

    private BuyHouse buyHouse;

    public  BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHosue() {
        System.out.println("买房前先攒钱");
        buyHouse.buyHosue();
        System.out.println("又他妈得花钱装修");
    }
}
