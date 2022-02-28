package com.example.demo.proxy;

import com.example.demo.proxy.cgLib.CgLibDynProxyLawyer;
import com.example.demo.proxy.jdk.DynProxyLawyer;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * 简介
 *
 * @author 80204999
 * @date 2022/2/25
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProxyFactory {

    public static ILawSuit getProxy() {
        return new ProxyLawyer(new SecondDogWang());
    }

    public static Object getDnyProxy(Object target) {
        InvocationHandler handler = new DynProxyLawyer(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
    }

    public static Object getGcLibDynProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new CgLibDynProxyLawyer());
        return enhancer.create();
    }
}
