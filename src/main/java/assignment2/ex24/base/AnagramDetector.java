package assignment2.ex24.base;

import java.util.Locale;
import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {
        if (word1.length() == word2.length()) {
        }
        else {
            return false;
        }
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();


        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        if (word1Array.equals(word2Array)) {
            return true;
        }
        else{
            return false;
        }
    }
}
