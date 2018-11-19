package com.byk.strategy;

import java.math.BigDecimal;

/**
 * @Author: ykbian
 * @Date: 2018/11/19 10:09
 * @Todo:
 */

public class ConcreteStrategyC   implements Strategy {


    @Override
    public BigDecimal strategyInterface(BigDecimal bigDecimal) {
        System.out.println("这是C策略");
        BigDecimal bigDecimal1 = new BigDecimal("1");
        return bigDecimal.multiply(bigDecimal1);
    }
}
