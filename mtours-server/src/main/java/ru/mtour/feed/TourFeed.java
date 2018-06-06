package ru.mtour.feed;

import ru.mtour.model.Order;
import ru.mtour.model.TourInfo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;

public interface TourFeed {

    Optional<TourInfo> getMinimalPriceTour(Order order);

    Map<LocalDate, BigDecimal> getPricesForCountry(String country, LocalDate startDate, int periods);

}
