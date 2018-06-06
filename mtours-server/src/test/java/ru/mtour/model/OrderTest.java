package ru.mtour.model;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderTest {

    @Test(expected = Exception.class)
    public void shouldFailWhenCreatingOrderWithoutMandatoryFields() {
        Order.builder().build();
    }

    @Test
    public void shouldNotFailWhenMandatoryParametersAreDefined() {
        createProperOrder();
    }

    @Test
    public void shouldInitiallyFillOptionalParametersWithEmptyAndNotNull() {
        Order order = createProperOrder();
        assertThat(order.getCity()).isNotNull();
        assertThat(order.getHotel()).isNotNull();
        assertThat(order.getInternet()).isNotNull();
    }

    private Order createProperOrder() {
        return Order.builder()
                .price(BigDecimal.ONE)
                .start(LocalDate.now())
                .end(LocalDate.now())
                .people(2)
                .country("Thai")
                .build();
    }
}