package com.study.spring.aop.dynamicproxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Seoyoon implements Person{

    @Override
    public void seat() {
        log.debug("서윤이가 가만히 앉아있지를 못하네요");
    }

    @Override
    public void sleep() {
        log.debug("서윤이는 영화를 보다가 잡니다");
    }

    @Override
    public void walk() {
        log.debug("서윤이가 걷다가 넘어지네요");
    }
}
