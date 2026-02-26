class Solution {
    public boolean isPalindrome(String s) {

        String temp = s.trim().toLowerCase(); 

        temp = temp.replaceAll("[^a-z0-9]", "");

        if(temp.equals("")) {
            return true;
        }

        StringBuilder revB = new StringBuilder();
        revB.append(temp);
        revB.reverse();

        String rev = revB.toString();

        if(temp.equals(rev)) {   
            return true;
        }

        return false;
    }
}