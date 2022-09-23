package com.study.spring.design.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealDog implements Dog{
    @Override
    public void sound() {
        log.debug("I'm real dog!!!!!!!");
    }
}
