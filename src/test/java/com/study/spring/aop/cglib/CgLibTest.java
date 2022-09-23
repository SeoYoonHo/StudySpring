package com.study.spring.aop.cglib;

import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.Enhancer;

class CgLibTest {

    @Test
    public void cgLibTest() {
        //given
        //Enhancer
        Enhancer seyoonEnhancer = new Enhancer();
        seyoonEnhancer.setSuperclass(SeoyoonCGLib.class);
        seyoonEnhancer.setCallback(new PringLogInterceptor());

        SeoyoonCGLib seoyoonCGLib = (SeoyoonCGLib) seyoonEnhancer.create();

        //when
        seoyoonCGLib.seat();
        System.out.println();
        seoyoonCGLib.sleep();
        System.out.println();
        seoyoonCGLib.walk();
        System.out.println();

        //then
    }

}