package com.example.demo.designpatterns.bridge;

/**
 * Created with IntelliJ IDEA.
 * 抽象化Abstraction
 *
 * @author 80204999
 * @date 2022/2/25
 */
public abstract class Coffee {
    protected ICoffeeAdditives additives;

    protected Coffee(ICoffeeAdditives additives) {
        this.additives = additives;
    }

    public void orderCoffee(int count){
        additives.addSomething();
    }
}
