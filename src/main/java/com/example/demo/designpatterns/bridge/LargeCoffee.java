package com.example.demo.designpatterns.bridge;

/**
 * Created with IntelliJ IDEA.
 * 简介
 *
 * @author 80204999
 * @date 2022/2/25
 */
public class LargeCoffee extends RefinedCoffee {

    public LargeCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    @Override
    public void orderCoffee(int count) {
        super.orderCoffee(count);
        System.out.println(String.format("大杯咖啡%d杯", 2));
    }
}
