package com.byk.template;

/**
 * @Author: ykbian
 * @Date: 2018/11/15 15:16
 * @Todo:   模板模式的抽象类
 */

public abstract class CookingAbstractClass {

    /**
     *  增加一个钩子方法，
     *  在模板模式里面，抽象类定义了实现步骤，但是不是所有的实现类都要执行相关的步骤，具体的实现类可能会做一些扩展。比如，拌凉菜也是做菜，但是并不需要”炒“这个过程，
     *  这里使用钩子方法，便于实现了进行扩展。
     *  虽然这里有模板方法，但是通过钩子方法还是能够影响到模板方法的执行（不是影响它的逻辑）。通过shouldDoing()立一个Flag,在dodish进行判断，确定需不需要炒菜
     */
    protected abstract boolean shouldDoing();


    /**
     * 备料
     */
    public abstract void preparation();
    /**
     * 做菜
     */
    public abstract void doing();
    /**
     * 出锅
     */
    public abstract void carriedDishes ();

    /**
     * 具体的整个过程
     */
    protected void dodish(){
        this.preparation();
        if(this.shouldDoing()){
            this.doing();
        }
        this.carriedDishes();
    }
}
