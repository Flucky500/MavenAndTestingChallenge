package pl.pasko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldReturnTrueIfAgeIs18() {
        //given
        int age = 18;
        //when
        boolean result = AdultChecker.isAdult(age);
        //then
        assertTrue(result);
    }
    @Test
    public void shouldReturnFalseIfAgeIs15() {
        //given
        int age = 15;
        //when
        boolean result = AdultChecker.isAdult(age);
        //then
        assertFalse(result);
    }
}
