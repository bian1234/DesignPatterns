package com.byk.observer;

/**
 * @Author: ykbian
 * @Date: 2018/11/30 14:28
 * @Todo:  测试观察者模式
 */

public class Test {


    public static void main(String[] args){
        ObjectInterface objectInterface = new ObjectInterfaceImpl();

        ObserverInterface watcher1 = new ObserverInterfaceImpl01();
        ObserverInterface watcher2 = new ObserverInterfaceImpl02();
        objectInterface.addWatcher(watcher1);
        objectInterface.addWatcher(watcher2);


        objectInterface.notifyWatchers("开心");
    }
}
