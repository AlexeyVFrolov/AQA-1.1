package ru.netology.service;



import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainWhenBelowBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        assertEquals(cashbackHackService.remain(1500), 500);
    }

    @Test
    public void shouldRemainWhenBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        assertEquals(cashbackHackService.remain(3000), 0);
    }
}