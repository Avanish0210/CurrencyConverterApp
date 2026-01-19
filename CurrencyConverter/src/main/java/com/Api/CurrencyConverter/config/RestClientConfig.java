package com.Api.CurrencyConverter.config;

import com.Api.CurrencyConverter.service.ConverterService;
import jdk.jfr.ContentType;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.rmi.ServerException;

import static org.apache.tomcat.util.http.fileupload.FileUploadBase.CONTENT_TYPE;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@Configuration
public class RestClientConfig {
    @Value("${currency.client.base.url}")
    private String Base_url;

    @Bean
    public RestClient restClient() {
        return RestClient
                .builder()
                .baseUrl(Base_url)
                .defaultHeader(CONTENT_TYPE , APPLICATION_JSON_VALUE)
                .defaultStatusHandler(HttpStatusCode::is5xxServerError , (request, response) -> {
                    throw new ServerException("Server error occurred -" + response.getBody());
                })
                .build();
    }
}
