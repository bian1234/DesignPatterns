package com.byk.proxy;

/**
 * @Author: ykbian
 * @Date: 2018/11/15 11:37
 * @Todo:  静态代理的测试类
 */

public class ProxyTest {

    public static void main(String[] args) {
        //这是原来的接口实现类
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHosue();
        // 通过静态代理的方式，可以对实现类做一些修改
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHosue();
    }
}
