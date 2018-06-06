package ru.mtour.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

@Data
public class Order {
    private final BigDecimal price;
    private final LocalDate start;
    private final LocalDate end;
    private final int people;
    private final String country;
    private final Optional<Boolean> internet;
    private final Optional<String> city;
    private final Optional<String> hotel;
}