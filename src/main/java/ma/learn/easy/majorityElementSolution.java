package ma.learn.easy;

import java.util.HashMap;
import java.util.Map;
// problem link: https://leetcode.com/problems/majority-element/
public class majorityElementSolution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> occur = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int count = occur.getOrDefault(nums[i], 0) + 1;
            occur.put(nums[i], count);  // Always update the map
        }

        int maxCount = 0;
        int majorityElement = -1;

        for (Map.Entry<Integer, Integer> entry : occur.entrySet()) {
            if (entry.getValue() > n / 2) {
                majorityElement = entry.getKey();
                break;
            }
        }

        return majorityElement;
    }
}
