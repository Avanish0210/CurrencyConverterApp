package com.Api.CurrencyConverter.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Map;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyDto {
    @JsonProperty("data")
    private Map<String, Double> data;

    public Double getUSD() {
        return data != null ? data.get("USD") : null;
    }
}
