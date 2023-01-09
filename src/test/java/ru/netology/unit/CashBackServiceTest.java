package ru.netology.unit;

import org.junit.Test;
import org.junit.Assert;

public class CashBackServiceTest {

    CashBackHackService service = new CashBackHackService();

    @Test
    public void shouldReturn900() {

        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;
        Assert.assertEquals(expected, actual);
    }

   @Test
    public void shouldReturnNothing() {

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}