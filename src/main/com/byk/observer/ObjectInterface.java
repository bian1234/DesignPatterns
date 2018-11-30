package com.byk.observer;

/**
 * @Author: ykbian
 * @Date: 2018/11/30 14:22
 * @Todo:   抽象的被观察者接口
 */

public interface ObjectInterface {


    public void addWatcher(ObserverInterface observerInterface);

    public void removeWatcher(ObserverInterface observerInterface);

    public void notifyWatchers(String str);
}
