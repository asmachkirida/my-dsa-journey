package ma.learn.easy;
// problem link : https://leetcode.com/problems/longest-common-prefix/
public class longestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        int n =strs.length;
        if (strs == null || n == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < n; i++) {
// as long as strs[i] isnt starting with the prefix at position 0
            while (strs[i].indexOf(prefix) != 0) {
                // we take away a char from yje prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
