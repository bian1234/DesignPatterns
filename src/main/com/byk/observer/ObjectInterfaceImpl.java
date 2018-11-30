package com.byk.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ykbian
 * @Date: 2018/11/30 14:23
 * @Todo:
 */

public class ObjectInterfaceImpl  implements ObjectInterface {



    // 存放观察者
    private List<ObserverInterface> list = new ArrayList<>();


    @Override
    public void addWatcher(ObserverInterface observerInterface) {
        System.out.println("增加观察者信息");
        list.add(observerInterface);
    }

    @Override
    public void removeWatcher(ObserverInterface observerInterface) {
        System.out.println("移除观察者信息");
        list.remove(observerInterface);
    }

    @Override
    public void notifyWatchers(String str) {
        System.out.println("通知观察者");
        // 自动调用实际上是主题进行调用的
        for (ObserverInterface observerInterface : list){
            observerInterface.update(str);
        }
    }
}
