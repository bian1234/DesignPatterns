package com.byk.observer;

/**
 * @Author: ykbian
 * @Date: 2018/11/30 14:25
 * @Todo:
 */

public class ObserverInterfaceImpl02 implements ObserverInterface {


    @Override
    public void update(String str) {
        System.out.println("观察者2收到信息===="+str);
    }
}
