package ma.learn.easy;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set =  new HashSet<>();
        for(Integer num : nums)
        {
            if(set.contains(num)){
                return true;}
            set.add(num);

        }
        return false;
    }
}
