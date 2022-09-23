package com.study.spring.aop.dynamicproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Yoonho implements Person{
    @Override
    public void seat() {
        log.debug("앉습니다");
    }

    @Override
    public void sleep() {
        log.debug("잡니다");
    }

    @Override
    public void walk() {
        log.debug("걷습니다");
    }
}
