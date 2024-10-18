package ma.learn.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// Problem link: https://leetcode.com/problems/valid-anagram/
public class ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length() ) return false;
        char [] string1 = s.toCharArray();
        char [] string2 = t.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        return Arrays.equals(string1,string2);
    }
}
