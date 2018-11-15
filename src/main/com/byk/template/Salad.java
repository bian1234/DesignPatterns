package com.byk.template;

/**
 * @Author: ykbian
 * @Date: 2018/11/15 15:44
 * @Todo:   做一道沙拉  也就是拌凉菜试试，测试一下模板模式里面的钩子方法好使不好使
 */

public class Salad extends CookingAbstractClass{


    /**
     *  凉菜不需要炒  所以关闭炒的步骤
     */
    @Override
    protected boolean shouldDoing() {
        return false;
    }

    @Override
    public void preparation() {
        System.out.println(" 准备两个大白萝卜");
    }

    @Override
    public void doing() {
        System.out.println("验证萝卜丝炒了没");
    }

    @Override
    public void carriedDishes() {
        System.out.println("切丝装盘即可");
    }
}
