package com.example.demo.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * jdk代理
 * 只能针对实现了接口的类做动态代理，而不能对没有实现接口的类做动态代理
 *
 * @author 80204999
 * @date 2022/2/25
 */
public class DynProxyLawyer implements InvocationHandler {

    private Object target;//被代理的对象

    public DynProxyLawyer(Object target) {
        this.target = target;
    }

    /**
     * invoke
     * @param proxy  代表动态代理对象
     * @param method 代表正在执行的方法
     * @param args 代表当前执行方法传入的实参
     * @return 表示当前执行方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("案件进展：" + method.getName());
        return method.invoke(target, args);
    }
}
