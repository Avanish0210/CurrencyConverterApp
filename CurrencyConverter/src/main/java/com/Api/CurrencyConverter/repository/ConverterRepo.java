package com.Api.CurrencyConverter.repository;

import com.Api.CurrencyConverter.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConverterRepo extends JpaRepository<Currency, Integer> {

}
