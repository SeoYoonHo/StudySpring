package com.study.spring.design.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProxyTest {
    private Dog dog;

    @BeforeEach
    void setUp(){
        RealDog realDog = new RealDog();
        dog = new ProxyDog(realDog);
    }

    @Test
    void sound() {
        dog.sound();
    }
}