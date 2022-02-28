package com.example.demo.proxy;

/**
 * Created with IntelliJ IDEA.
 * 简介
 *
 * @author 80204999
 * @date 2022/2/25
 */
public class ProxyLawyer implements ILawSuit{

    ILawSuit plaintiff;//持有要代理的那个对象

    public ProxyLawyer(ILawSuit plaintiff) {
        this.plaintiff = plaintiff;
    }

    @Override
    public void submit(String proof) {
        plaintiff.submit(proof);
    }

    @Override
    public void defend() {
        plaintiff.defend();
    }
}
