package pl.pasko;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldCheckIfAdult()
    {
        assertTrue(IsAdult.isAdult(18));
        assertFalse(IsAdult.isAdult(12));
        assertFalse(IsAdult.isAdult(-1));
    }
}
