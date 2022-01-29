package pl.pasko.oddEven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenCheckerTest {

    @Test
    void shouldReturnTrueIfNumberIs2() {
    //given
    int numberOne = 2;
    //when
    boolean result = OddEvenChecker.isEven(numberOne);
    // then
    assertTrue(result);
    }
    @Test
    void shouldReturnFalseIfNumberIs1() {
        //given
        int numberOne = 1;
        //when
        boolean result = OddEvenChecker.isEven(numberOne);
        // then
        assertFalse(result);
    }
    @Test
    void shouldReturnTrueIfNumberIs0() {
        //given
        int numberOne = 0;
        //when
        boolean result = OddEvenChecker.isEven(numberOne);
        // then
        assertTrue(result);
    }
}