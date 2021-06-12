package assignment2.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    void isVeryWeakAllandShort() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isVeryWeak("ab12/*", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);

    }
    @Test
    void isWeakAllandShort() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isVeryWeak("ab12/*", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);

    }

    @Test
    void isVeryWeakJustLetters() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isVeryWeak("abcde", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);

    }

    @Test
    void isVeryWeakJustNumbers() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isVeryWeak("12345", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'1'};
        assertArrayEquals(expected, actualArray);
    }

    @Test
    void isVeryWeakBothNumAndChar() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isVeryWeak("abc123", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }
    @Test
    void isVeryWeakWithSymbolsToo() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isVeryWeak("abc123#!", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }

    @Test
    void isVeryWeakTooLong() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isVeryWeak("123456789123456789", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }


    @Test
    void isWeakJustNumbers() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isWeak("12345", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }
    @Test
    void isWeakJustLetters() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isWeak("abcde", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'2'};
        assertArrayEquals(expected, actualArray);
    }
    @Test
    void isWeakBothNandL() {Solution25 detector = new Solution25() ;
        String actual = detector.isWeak("abcd123", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }

    @Test
    void isWeakSymbolsToo() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isWeak("abc123#!", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }

    @Test
    void isWeakTooLong() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isWeak("asdfghjklqwertyuiop", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }
    @Test
    void isStrongJustNumbers() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isStrong("123456789", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }

    @Test
    void isStrongJustLetters() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isStrong("abcdeghjkl", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }
    @Test
    void isStrongBoth() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isStrong("abcde12345", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'3'};
        assertArrayEquals(expected, actualArray);
    }
    @Test
    void isStrongAll() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isStrong("abcde12345/*-+", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }
    @Test
    void isStrongTooShort() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isStrong("abc123", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }

    @Test
    void isVeryStrongJustNumbers() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isVeryStrong("113456789", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }

    @Test
    void isVeryStrongJustLetters() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isVeryStrong("abcbstbwrtbr", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }
    @Test
    void isVeryStrongBoth() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isVeryStrong("abcde21321", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }
    @Test
    void isVeryStrongAll() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isVeryStrong("abcde321321-*/-*", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'4'};
        assertArrayEquals(expected, actualArray);
    }
    @Test
    void isVeryStrongTooShort() {
        Solution25 detector = new Solution25() ;
        String actual = detector.isVeryStrong("ab12+-", "0") ;
        char[] actualArray = actual.toCharArray();
        char[] expected = {'0'};
        assertArrayEquals(expected, actualArray);
    }

}