package com.dh.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

    @CircuitBreaker(name = "catalogService")
    @GetMapping("/catalog")
    public ResponseEntity<String> catalogFallback () {
        return new ResponseEntity<>("Servidor de catálogos indisponível. Por favor, contate o suporte.",
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
