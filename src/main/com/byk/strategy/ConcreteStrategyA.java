package com.byk.strategy;

import java.math.BigDecimal;

/**
 * @Author: ykbian
 * @Date: 2018/11/19 10:07
 * @Todo:
 */

public class ConcreteStrategyA  implements Strategy {

    @Override
    public BigDecimal strategyInterface(BigDecimal bigDecimal) {
        System.out.println("这是a策略");
        BigDecimal bigDecimal1 = new BigDecimal("0.8");
        return bigDecimal.multiply(bigDecimal1);
    }

}
