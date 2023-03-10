package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackTest {

    Cashback cb = new Cashback();

    @Test
    public void testRemain() {

        int actual = cb.remain(900);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @Test
    public void whenAmountOverBoundary() {

        int actual = cb.remain(1100);
        int expected = 900;

        assertEquals(actual,expected);
    }

    @Test
    public void whenAmountEqualsBoundary() {
        int actual = cb.remain(1000);
        int expected = 0;

        assertEquals(actual,expected);
    }
}