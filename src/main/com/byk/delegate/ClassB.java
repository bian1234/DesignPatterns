package com.byk.delegate;

/**
 * @Author: ykbian
 * @Date: 2018/11/15 16:33
 * @Todo:
 */

public class ClassB {

    public void delegateB(){
        ClassA classA = new ClassA();
        classA.delegateA();
    }
}
