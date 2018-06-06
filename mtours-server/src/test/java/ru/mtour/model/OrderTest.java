package ru.mtour.model;

import org.junit.Test;

public class OrderTest {

    @Test(expected = Exception.class)
    public void shouldFailWhenCreatingOrderWithoutMandatoryFields() {
        Order.builder().build();
    }

}