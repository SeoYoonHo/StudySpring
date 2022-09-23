package com.study.spring.aop.dynamicproxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

class DynamicProxyTest {

    @Test
    public void dynamicProxyTest() {
        //given
        //seoyoon
        Person seoyoon = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class},
                new PersonProxyHandler(new Seoyoon()));

        //yoonho
        Person yoonho = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class},
                new PersonProxyHandler(new Yoonho()));

        //when
        seoyoon.seat();
        System.out.println();
        seoyoon.sleep();
        System.out.println();
        seoyoon.walk();
        System.out.println();

        yoonho.seat();
        System.out.println();
        yoonho.sleep();
        System.out.println();
        yoonho.walk();
        System.out.println();

        //then
    }
}