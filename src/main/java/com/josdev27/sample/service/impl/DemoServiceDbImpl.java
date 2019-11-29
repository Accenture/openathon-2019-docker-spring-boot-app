package com.josdev27.sample.service.impl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.josdev27.sample.domain.Saludo;
import com.josdev27.sample.repository.SaludoRepository;
import com.josdev27.sample.service.DemoService;

@Service
@Profile("db")
public class DemoServiceDbImpl implements DemoService {

    @Autowired
    private SaludoRepository saludoRepository;
    
    @Override
    public String getRandomHello(String name) {
        List<Saludo> saludos = saludoRepository.findAll();
        if (!saludos.isEmpty()) {
            Random random = new Random();
            return saludos.get(random.nextInt(saludos.size())).getSaludo() + ", " + name;
        }
        return "Hello, " + name;
    }

}
