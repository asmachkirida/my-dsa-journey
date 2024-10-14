package ma.learn.easy;
// problem link: https://leetcode.com/problems/remove-element/
public class removeElementSolution {
    public int removeElement(int[] nums, int val) {
        // to keep track of the length of the array
        int k = 0;
        for (int j = 0; j < nums.length; j++) {
// we check if the value was different than n[j], we assign it to nums[k], which means we're just keeping the different values and we're ignoring the similar ones
            if (nums[j] != val) {
                nums[k] = nums[j];
                k++;
            }
        }
        return k;
    }
}
