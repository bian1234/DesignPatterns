package com.byk.proxy;

/**
 * @Author: ykbian
 * @Date: 2018/11/15 11:54
 * @Todo:  CGLIB代理测试类
 */

public class CglibProxyTest   {

    public static void main(String[] args){
        BuyHouse buyHouse = new BuyHouseImpl();
        CglibProxy cglibProxy = new CglibProxy();
        BuyHouseImpl buyHouseCglibProxy = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
        buyHouseCglibProxy.buyHosue();
    }
}
