package assignment2.ex33.base;

import assignment2.ex31.base.Solution31;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void Option0() {
        String actual = Solution33.responseSelector(0);
        String expected = "No.";
        assertEquals(expected, actual);
    }

    @Test
    void Option1() {
        String actual = Solution33.responseSelector(1);
        String expected = "Yes.";
        assertEquals(expected, actual);
    }

    @Test
    void Option2() {
        String actual = Solution33.responseSelector(2);
        String expected = "Maybe.";
        assertEquals(expected, actual);
    }

    @Test
    void Option3() {
        String actual = Solution33.responseSelector(3);
        String expected = "Ask again later.";
        assertEquals(expected, actual);
    }
}