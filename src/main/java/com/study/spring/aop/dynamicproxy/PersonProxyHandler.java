package com.study.spring.aop.dynamicproxy;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@AllArgsConstructor
@Slf4j
public class PersonProxyHandler implements InvocationHandler {
    Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;

        log.debug("!!!Before!!!");

        switch (method.getName()) {
            case "seat" -> {
                log.debug("Before seat");
                result = method.invoke(target, args);
                log.debug("After seat");
            }
            case "sleep" -> {
                log.debug("Before sleep");
                result = method.invoke(target, args);
                log.debug("After sleep");
            }
            case "walk" -> {
                log.debug("Before Seat");
                result = method.invoke(target, args);
                log.debug("After walk");
            }
        }

        log.debug("!!!After!!!");

        return result;
    }
}
