package com.byk.strategy;

import java.math.BigDecimal;

/**
 * @Author: ykbian
 * @Date: 2018/11/19 10:57
 * @Todo:  策略模式仅仅封装算法，提供新的算法插入到已有系统中，以及老算法从系统中“退休”的方法，
 *         策略模式并不决定在何时使用何种算法。在什么情况下使用什么算法是由客户端决定的。
 */

public class Client {


    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        Strategy strategy = new ConcreteStrategyA();
        //创建环境
       Context context = new Context(strategy);
        //计算价格
        BigDecimal decimal = new BigDecimal("100");
        BigDecimal bigDecimal = context.contextInterface(decimal);
        System.out.println("图书的最终价格为：" + bigDecimal);
        System.out.println("===================================================");
        //选择并创建需要使用的策略对象
        Strategy strategy1 = new ConcreteStrategyB();
        //创建环境
        Context context1 = new Context(strategy1);
        //计算价格
        BigDecimal decimal1 = new BigDecimal("100");
        BigDecimal bigDecimal1 = context1.contextInterface(decimal1);
        System.out.println("图书的最终价格为：" + bigDecimal1);
        System.out.println("===================================================");
        //选择并创建需要使用的策略对象
        Strategy strategy02 = new ConcreteStrategyC();
        //创建环境
        Context context02 = new Context(strategy02);
        //计算价格
        BigDecimal decimal02 = new BigDecimal("100");
        BigDecimal bigDecimal02 = context02.contextInterface(decimal02);
        System.out.println("图书的最终价格为：" + bigDecimal02);
        System.out.println("===================================================");
    }
}
