package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CashbackHackServiceJupiterTest {

    @Test
    void shouldRemainWhenBelowBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        assertEquals(cashbackHackService.remain(1500), 500);
    }

    @Test
    void shouldRemainWhenBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        assertEquals(cashbackHackService.remain(3000), 0);
    }
}