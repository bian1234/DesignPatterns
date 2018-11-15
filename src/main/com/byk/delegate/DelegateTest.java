package com.byk.delegate;

/**
 * @Author: ykbian
 * @Date: 2018/11/15 16:34
 * @Todo:
 */

public class DelegateTest {

    public static void main(String[] args) {
        /**
         *  这里创建的是B类，调用的也B类的方法，但是实际上执行的是A类里面的方法。。。
         */
        ClassB classB = new ClassB();
        classB.delegateB();
    }
}
