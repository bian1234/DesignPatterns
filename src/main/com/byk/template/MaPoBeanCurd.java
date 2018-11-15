package com.byk.template;

/**
 * @Author: ykbian
 * @Date: 2018/11/15 15:20
 * @Todo:   做一道麻婆豆腐
 */

public class MaPoBeanCurd extends CookingAbstractClass{


    /**
     *  麻婆豆腐需要炒，因此也是true
     */
    @Override
    protected boolean shouldDoing() {
        return true;
    }

    @Override
    public void preparation() {
        System.out.println("半斤豆腐");
    }

    @Override
    public void doing() {
        System.out.println("和豆瓣酱一起炒");
    }

    @Override
    public void carriedDishes() {
        System.out.println("不小心做成了豆腐汤");
    }
}
