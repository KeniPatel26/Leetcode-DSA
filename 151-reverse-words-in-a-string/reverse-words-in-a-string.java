import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);

         Stack<String> stack = new Stack<>();
         while (st.hasMoreTokens()) {
            stack.push(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            if (!stack.isEmpty()) {
                sb.append(" ");
        }


        }
        return sb.toString();   
    }
}