import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTest {
    CashbackHacker service = new CashbackHacker();

    @Test
    public void shouldGetRemains200() {

        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains1() {

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldGetRemains999() {

        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldGetRemains0() {

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}