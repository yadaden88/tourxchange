package ru.mtour.feed.natalie;

import ru.mtour.feed.TourFeed;
import ru.mtour.model.Order;
import ru.mtour.model.TourInfo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;

public class NatalieFeed implements TourFeed {
    @Override
    public Optional<TourInfo> getMinimalPriceTour(Order order) {
        return Optional.empty();
    }

    @Override
    public Map<LocalDate, BigDecimal> getPricesForCountry(String coutryCode, LocalDate startDate, int periods) {
        return null;
    }
}
