package ma.learn.easy;

import java.util.ArrayList;
import java.util.List;

public class reverseVowelsSolution {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels.add(s.charAt(i));
            }
        }
        StringBuilder gs = new StringBuilder(s);

        for (int i = 0, j = vowels.size() - 1; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                gs.setCharAt(i, vowels.get(j--));
            }
        }

        return gs.toString();
    }
}
