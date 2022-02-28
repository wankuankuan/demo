package com.example.demo.designpatterns.bridge;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * RefinedAbstraction
 *
 * @author 80204999
 * @date 2022/2/25
 */
public abstract class RefinedCoffee extends Coffee {

    protected RefinedCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    public void checkQuality() {
        Random ran = new Random();
        System.out.println(String.format("%s 添加%s",
                additives.getClass().getSimpleName(), ran.nextBoolean() ? "太多" : "正常"));
    }
}
