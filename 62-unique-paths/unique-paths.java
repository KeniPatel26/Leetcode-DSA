class Solution {
    public int uniquePaths(int m, int n) {
        int totalSteps = m + n - 2;
        int downSteps = Math.min(m - 1, n - 1); 
        long result = 1;
        
        
        for (int i = 1; i <= downSteps; i++) {
            result = result * (totalSteps - downSteps + i) / i;
        }
        
        return (int) result; 
    }
}
