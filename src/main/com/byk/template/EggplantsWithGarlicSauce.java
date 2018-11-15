package com.byk.template;

/**
 * @Author: ykbian
 * @Date: 2018/11/15 15:22
 * @Todo:   这是鱼香茄子
 */

public class EggplantsWithGarlicSauce  extends CookingAbstractClass {


    /**
     *  鱼香茄子需要炒，因此这里选择炒菜，返回true
     */
    @Override
    protected boolean shouldDoing() {
        return true;
    }

    @Override
    public void preparation() {
        System.out.println("来二斤茄子");
    }

    @Override
    public void doing() {
        System.out.println("倒油，炒茄子");
    }

    @Override
    public void carriedDishes() {
        System.out.println("鱼香茄子盖饭一个");
    }
}
