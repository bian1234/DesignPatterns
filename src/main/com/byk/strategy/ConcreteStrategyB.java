package com.byk.strategy;

import java.math.BigDecimal;

/**
 * @Author: ykbian
 * @Date: 2018/11/19 10:08
 * @Todo:
 */

public class ConcreteStrategyB  implements Strategy {

    @Override
    public BigDecimal strategyInterface(BigDecimal bigDecimal) {
        System.out.println("这是B策略");
        BigDecimal bigDecimal1 = new BigDecimal("0.9");
        return bigDecimal.multiply(bigDecimal1);
    }
}
