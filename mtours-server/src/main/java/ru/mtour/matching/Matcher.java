package ru.mtour.matching;

import lombok.RequiredArgsConstructor;
import ru.mtour.feed.TourFeed;
import ru.mtour.model.Order;
import ru.mtour.model.TourInfo;

import java.math.BigDecimal;
import java.util.Optional;

@RequiredArgsConstructor
public class Matcher {
    private static final int MAX_TRIES = 10;
    /**
     * At which rate the price will be multiplied if no Tour found
     */
    private static final BigDecimal PRICE_STEP = BigDecimal.valueOf(1.2);

    private final TourFeed feed;

    public Optional<TourInfo> tryMatch(Order order) {
        Optional<TourInfo> result;
        int tryCount = 0;
        do {
            result = feed.getMinimalPriceTour(order);
            order = order.toBuilder().price(order.getPrice().multiply(PRICE_STEP)).build();
        } while (!result.isPresent() && tryCount++ < MAX_TRIES);
        return result;
    }

}
