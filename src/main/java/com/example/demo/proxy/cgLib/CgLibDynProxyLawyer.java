package com.example.demo.proxy.cgLib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * 简介
 *
 * @author 80204999
 * @date 2022/2/25
 */
public class CgLibDynProxyLawyer implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (method.getName().equals("submit")) {
            System.out.println("案件提交成功，证据如下：" + Arrays.asList(objects));
        }
        return methodProxy.invokeSuper(o, objects);
    }
}
