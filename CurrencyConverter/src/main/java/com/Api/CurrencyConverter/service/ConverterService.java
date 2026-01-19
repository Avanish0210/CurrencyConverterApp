package com.Api.CurrencyConverter.service;

import com.Api.CurrencyConverter.client.Clientimpl;
import com.Api.CurrencyConverter.client.CurrencyClient;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConverterService {

    private final Clientimpl clientimpl;
    Logger log = LoggerFactory.getLogger(ConverterService.class);


    public Double convertCurrency(Double amount) {
        Double rate = clientimpl.ConvertCurrency(amount);
        return rate*amount;
    }
}
