package ma.learn.easy;
import java.util.*;

class twoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        // we gonna use a hashmap to see if the number that we need to complement the target exists in the array
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // example : if our target is 9 and we encountered number 7 the complement is going to be 2, once I encounter the number 2 while looping, I can return the index of the complement and the number
            int complement = target - nums[i];
            if(map.containsKey(complement))
            {
                return new int[] { map.get(complement), i };
            }
            // if it doesnt already exists we add it
            map.put(nums[i], i);
        }
        // in case nothing was found, we return this
        return new int[] {-1, -1};


    }
}

