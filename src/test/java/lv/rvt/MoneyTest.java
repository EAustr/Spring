package lv.rvt;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import rvt.Money;
// Programmas testēšana ar true,fals un parasto metodi 
public class MoneyTest {

    @Test
    public void testPlusMethod() {
        Money mac1 = new Money(10, 50);
        Money mac2 = new Money(5, 50);
        Money mac3 = mac1.plus(mac2);

        assertEquals(16, mac3.euros());
        assertEquals(0, mac3.cents());

        Money mac4 = new Money(1, 99);
        Money mac5 = new Money(2, 99);
        Money mac6 = mac4.plus(mac5);

        assertEquals(4, mac6.euros());
        assertEquals(98, mac6.cents());


    }
    // Pārbauda ar true vai false
    @Test
    public void testLessMethod() {
        Money mac1 = new Money(10, 50);
        Money mac2 = new Money(5, 50);

        assertTrue(mac2.less(mac1));
    }
    @Test
    public void testMinusMethod() {
        Money mac1 = new Money(10, 50);
        Money mac2 = new Money(5, 50);
        Money mac3 = mac1.minus(mac2);

        assertEquals(5,mac3.euros());
        assertEquals(0,mac3.cents());
    }
}
