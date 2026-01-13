package com.Api.CurrencyConverter.controller;

import com.Api.CurrencyConverter.dto.ConverterDto;
import com.Api.CurrencyConverter.service.ConverterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/currencyConverter")
public class CurrencyController {
    private final  ConverterService converterService;

    @GetMapping("/convert")
    public ConverterDto getCurrency(@RequestParam("fromCurrency") String From , @RequestParam("ToCurrency") String To , @RequestParam("amount") Double amount){
        return converterService.convertCurrency(From , To , amount);
    }
    //currencyConverter/convert?fromCurrency=INR&ToCurrency=USD&amount=99.00

}
