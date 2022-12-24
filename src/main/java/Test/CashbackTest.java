package Test;


import org.junit.jupiter.api.Test;
import ru.netology.service.Cashback;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    public void whenAmountEquals0() {
        int actual = cb.remain(0);
        int expected = 1000;

        assertEquals(actual,expected);
    }
}