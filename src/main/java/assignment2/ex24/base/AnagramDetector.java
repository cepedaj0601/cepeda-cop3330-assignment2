package assignment2.ex24.base;

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {
        if (word1.length() == word2.length()) {

            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();

            char[] word1Array = word1.toCharArray();
            char[] word2Array = word2.toCharArray();


            Arrays.sort(word1Array);
            Arrays.sort(word2Array);

            new String (word1Array);
            new String (word2Array);


            return Arrays.equals(word1Array, word2Array);
        }
        else {
            return false;
        }

    }
}
