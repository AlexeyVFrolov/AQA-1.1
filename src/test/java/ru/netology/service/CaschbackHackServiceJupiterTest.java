package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CashbackHackServiceJupiterTest {

    @Test
    void shouldRemainWhenBelowBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        assertEquals(500, cashbackHackService.remain(1500));
    }

    @Test
    void shouldRemainWhenBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        assertEquals(0, cashbackHackService.remain(3000));
    }
}