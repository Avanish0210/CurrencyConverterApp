package com.Api.CurrencyConverter.controller;

import com.Api.CurrencyConverter.dto.ConverterDto;
import com.Api.CurrencyConverter.service.ConverterService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/currencyConverter")
public class CurrencyController {
    private final  ConverterService converterService;

    @GetMapping("/{amount}")
    public ConverterDto getCurrency(@PathVariable Double amount){
        return converterService.convertCurrency(amount);
    }

}
