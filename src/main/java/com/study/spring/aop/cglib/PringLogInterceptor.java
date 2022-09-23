package com.study.spring.aop.cglib;

import lombok.extern.slf4j.Slf4j;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
public class PringLogInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object result;
        log.debug("before method");
        result = proxy.invokeSuper(obj,args);
        log.debug("after method");
        return result;
    }
}
