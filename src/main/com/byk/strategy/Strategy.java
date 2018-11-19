package com.byk.strategy;

import java.math.BigDecimal;

/**
 * @Author: ykbian
 * @Date: 2018/11/19 10:07
 * @Todo:
 */

public interface Strategy {


    /**
     * 策略方法
     */
    public BigDecimal strategyInterface(BigDecimal bigDecimal);
}
