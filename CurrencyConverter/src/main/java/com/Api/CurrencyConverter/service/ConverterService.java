package com.Api.CurrencyConverter.service;

import com.Api.CurrencyConverter.dto.ConverterDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class ConverterService {

    private final RestClient restClients;
    Logger log = LoggerFactory.getLogger(ConverterService.class);

    public ConverterDto convertCurrency(String From , String To , Double amount) {
        if(amount == null || amount <= 0) {
            throw new IllegalArgumentException("Amount is null or amount <= 0");
        }
        Double Conversion = amount / 83.50;
        log.info("Converting currency from " + From + " to " + To + " = " + Conversion);
        return new ConverterDto(amount , From , To , Conversion);
    }
}
