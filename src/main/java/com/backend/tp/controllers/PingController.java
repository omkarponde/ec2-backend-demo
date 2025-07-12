package com.backend.tp.controllers;

import com.backend.tp.dtos.PingPongDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class PingController {

    @GetMapping("/ping")
    public PingPongDTO sayHello() {
        PingPongDTO pingPongDTO = new PingPongDTO();
        pingPongDTO.setMessage("Ping Pong :: Success !!!");
        return pingPongDTO;
    }
}