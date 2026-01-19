package com.Api.CurrencyConverter.client;

import com.Api.CurrencyConverter.dto.CurrencyDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class Clientimpl implements CurrencyClient {

    private final RestClient restClient;
    private String apiKey = "fca_live_4kbqQG4kIOZagcJQpL8EdokmFzt0BDdl9s4WZG9y";
    public String API = "v1/latest?apikey=fca_live_4kbqQG4kIOZagcJQpL8EdokmFzt0BDdl9s4WZG9y&currencies=USD&base_currency=INR";
    Logger logger = LoggerFactory.getLogger(Clientimpl.class);

    @Override
    public Double ConvertCurrency(Double amount) {
        CurrencyDto currencyData = restClient.get()
                .uri(API)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, (request, response) -> {
                    throw new HttpClientErrorException(response.getStatusCode(), response.getBody().toString());
                })
                .body(new ParameterizedTypeReference<>() {
                });

        logger.info("Currency data received: {}", currencyData);

        if (currencyData == null) {
            logger.error("Currency data is null");
            throw new RuntimeException("Failed to fetch currency data");
        }

        Double rate = currencyData.getUSD();
        if (rate == null) {
            logger.error("USD rate is null in the response");
            throw new RuntimeException("USD rate not found in API response");
        }

        logger.info("USD conversion rate: {}", rate);
        return rate;
    }
}
