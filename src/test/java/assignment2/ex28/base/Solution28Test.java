package assignment2.ex28.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void sumOf01234() {
        int actual = 0;
        for (int i = 0; i < 5; i++) {
            actual = Solution28.summerUpper(i, actual);
        }
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }
}