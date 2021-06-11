package assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagramReturnsFalseForNonanagrams(){

        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("difo", "god");

        assertFalse(actual);
    }

    @Test
    void isAnagramReturnsTrueForAnagrams(){

        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("difo", "fido");

        assertTrue(actual);
    }

    @Test
    void isAnagramReturnsTrueForOtherAnagrams(){

        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("tone", "note");

        assertTrue(actual);
    }
}