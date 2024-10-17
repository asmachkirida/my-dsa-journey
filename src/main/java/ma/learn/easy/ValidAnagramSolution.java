package ma.learn.easy;

import java.util.HashMap;
import java.util.Map;
// Problem link: https://leetcode.com/problems/valid-anagram/
public class ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length() ) return false;
        Map<Character,Integer> mymap= new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            int nbroccur = mymap.getOrDefault(s.charAt(i),0)+1;
            mymap.put(s.charAt(i),nbroccur);
        }
        for (int i = 0; i < t.length(); i++) {
            if (!mymap.containsKey(t.charAt(i)) || mymap.get(t.charAt(i)) == 0) {
                return false;
            }
            mymap.put(t.charAt(i), mymap.get(t.charAt(i)) - 1);
        }
        return true;

    }
}
