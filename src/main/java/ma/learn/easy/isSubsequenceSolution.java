package ma.learn.easy;

public class isSubsequenceSolution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int sl=s.length();
        int tl=t.length();

        while (i < sl && j < tl) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == sl;
    }
}
