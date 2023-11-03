package com.example.demo.service;

import com.example.demo.model.Mo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoService {


    final private RegisterMoService registerMoService;

    @Autowired
    public MoService(RegisterMoService registerMoService) {
        this.registerMoService = registerMoService;
    }

    public void register(Mo mo) {
        registerMoService.register(mo);
    }
}
