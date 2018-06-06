package ru.mtour.feed.natalie;

import org.junit.Test;
import ru.mtour.model.Order;
import ru.mtour.model.TourInfo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class NatalieFeedTest {
    private final NatalieFeed subject = new NatalieFeed();

    @Test
    public void shouldReturnNonEmptyResultForBigPrice() {
        Order order = Order.builder()
                .people(2)
                .country("Thailand")
                .price(BigDecimal.valueOf(1_000_000_00))
                .start(LocalDate.of(2018, 10, 10))
                .end(LocalDate.of(2018, 10, 20))
                .build();

        Optional<TourInfo> result = subject.getMinimalPriceTour(order);
        assertThat(result).isPresent();
    }

}