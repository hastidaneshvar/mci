package com.example.demo.service;

import com.example.demo.model.Mo;
import com.example.demo.model.MoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterMoService {

    final private MoRepository moRepository;

    @Autowired
    public RegisterMoService(MoRepository moRepository) {
        this.moRepository = moRepository;
    }

    public void register(Mo mo){moRepository.save(mo);


    }

}
