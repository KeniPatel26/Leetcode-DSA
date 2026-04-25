import java.util.StringTokenizer;

class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        StringBuilder rev = new StringBuilder();

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            rev.insert(0, word + " ");
        }

        return rev.toString().trim();
    }
}