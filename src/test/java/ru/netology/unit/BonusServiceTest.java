package ru.netology.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldReturn10IfAmountIs2000() {

        BonusService bs = new BonusService();
        int amount = 2000;

        int expected = 10;
        int actual = bs.calculateBonus(amount);
        Assertions.assertEquals(expected, actual);
    }
}