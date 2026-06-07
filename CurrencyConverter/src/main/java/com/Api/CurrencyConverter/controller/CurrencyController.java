package com.Api.CurrencyConverter.controller;

import com.Api.CurrencyConverter.service.ConverterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/currencyConverter")
@Slf4j
public class CurrencyController {
    private final  ConverterService converterService;

    @GetMapping("/convert")
    public ResponseEntity<Double> getCurrency(@RequestParam(value = "amount", required = true) Double amount){
        log.info("this is CurrencyController");
        return ResponseEntity.ok(converterService.convertCurrency(amount));
    }
    //currencyConverter/convert?fromCurrency=INR&ToCurrency=USD&amount=99.00
    //currencyConverter/convert?amount=99.00




}
