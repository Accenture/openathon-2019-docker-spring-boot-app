package com.josdev27.sample.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.josdev27.sample.service.DemoService;

@Service
@Profile("local")
public class DemoServiceLocalImpl implements DemoService {

    @Override
    public String getRandomHello(String name) {
        return "Hello, " + name;
    }

}
