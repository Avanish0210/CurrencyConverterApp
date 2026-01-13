package com.Api.CurrencyConverter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class ConverterDto {

    private Double amount;
    private String from;
    private String to;
    private Double convertedAmount;
    public ConverterDto(Double amount, String from, String to, Double convertedAmount) {
        this.amount = amount;
        this.from = from;
        this.to = to;
        this.convertedAmount = convertedAmount;
    }

}
