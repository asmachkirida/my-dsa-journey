package ma.learn.easy;

import java.util.HashSet;
import java.util.Set;

public class singleNumberSolution {
    public int singleNumber(int[] nums) {
        // I'm using Sets to store values
        Set<Integer> set = new HashSet<>();
        // If the number already exists in the set we remove it,
        // else we add it, we'll do the same with every number and at the end we'll be left with the only number that's not duplicated in the set
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        // then we return it
        return set.iterator().next();
    }
}
