package com.Api.CurrencyConverter.service;

import com.Api.CurrencyConverter.dto.ConverterDto;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {
    public ConverterDto convertCurrency(Double amount) {
        Double Conversion = amount / 83.50;
        return new ConverterDto(amount , "INR" , "USD" , Conversion);
    }
}
