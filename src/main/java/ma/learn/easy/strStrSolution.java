package ma.learn.easy;

public class strStrSolution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j = 0;
            while (j < needleLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needleLength) {
                return i;
            }
        }
        return -1;
    }
}
