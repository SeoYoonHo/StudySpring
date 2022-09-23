package com.study.spring.design.proxy;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class ProxyDog implements Dog {
    private RealDog dog;

    @Override
    public void sound() {
        log.debug("proxy sound start!!!!");
        dog.sound();
        log.debug("proxy sound end!!!!");
    }
}
