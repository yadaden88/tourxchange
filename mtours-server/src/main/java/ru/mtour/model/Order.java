package ru.mtour.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

@Data
@Builder(toBuilder = true)
public class Order {
    @NonNull
    private final BigDecimal price;
    @NonNull
    private final LocalDate start;
    @NonNull
    private final LocalDate end;
    @NonNull
    private final int people;
    @NonNull
    private final String country;

    private final Boolean internet;
    private final String city;
    private final String hotel;

    public Optional<Boolean> getInternet() {
        return Optional.ofNullable(internet);
    }

    public Optional<String> getCity() {
        return Optional.ofNullable(city);
    }

    public Optional<String> getHotel() {
        return Optional.ofNullable(hotel);
    }
}