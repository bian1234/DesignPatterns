package com.byk.template;

/**
 * @Author: ykbian
 * @Date: 2018/11/15 15:25
 * @Todo:   这是吃饭类，测试一下做饭的模板类
 */

public class Eat {

    public static void main(String[] args) {
        EggplantsWithGarlicSauce eggplants = new EggplantsWithGarlicSauce();
        System.out.println("鱼香茄子=========================");
        eggplants.dodish();
        System.out.println("麻婆豆腐========================");

        MaPoBeanCurd maPoBeanCurd = new MaPoBeanCurd();
        maPoBeanCurd.dodish();

        System.out.println("以下是拌凉菜=======================");
        Salad salad = new Salad();
        salad.dodish();
    }
}
