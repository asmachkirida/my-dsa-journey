package ma.learn.easy;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesSolution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> myset = new HashSet<Integer>();
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (myset.add(nums[i])) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
