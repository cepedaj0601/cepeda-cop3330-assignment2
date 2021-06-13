package assignment2.ex27.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution27Test {

    @Test
    void validateFirstNameBlank() {
        int actual = Solution27.validateFirstName("");
        int expected = (0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void validateLastNameBlank() {
        int actual = Solution27.validateLastName("");
        int expected = (0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void validateZipCodeChars() {
        boolean actual = Solution27.validateZipCode("ABCDE");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void validateIdWrongCharacterType() {
        boolean actual = Solution27.validateId("A12-1234");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void validateFirstNameTooShort() {
        int actual = Solution27.validateFirstName("j");
        int expected = (2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void validateLastNameTooShort() {
        int actual = Solution27.validateLastName("J");
        int expected = (2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void validateZipCodeBoth() {
        boolean actual = Solution27.validateZipCode("ABC12");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void validateIdCorrect() {
        boolean actual = Solution27.validateId("Aa-1234");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void validateFirstNameCorrect() {
        int actual = Solution27.validateFirstName("Jimmy");
        int expected = (1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void validateLastNameCorrect() {
        int actual = Solution27.validateLastName("James");
        int expected = (1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void validateZipCodeCorrect() {
        boolean actual = Solution27.validateZipCode("ABCDE");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void validateIdTooLong() {
        boolean actual = Solution27.validateId("AA-34567");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

}