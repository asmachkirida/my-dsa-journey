package ma.learn.easy;
// problem link : https://leetcode.com/problems/palindrome-number/
public class isPalindromeSolution {
    public boolean isPalindrome(int x) {
        // if the number is negative, we know already thats its not palindrome
        if (x < 0) {
            return false;
        }
// we convert the number into a string
        String numStr = Integer.toString(x);

        int i = 0;
        int j = numStr.length() - 1;

        while (i < j) {
            if (numStr.charAt(i) != numStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
