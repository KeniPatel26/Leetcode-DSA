class Solution {
     static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > n - k)
            k = n - k;
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mat = new ArrayList<>();
      
        // Iterate through every row and
    	// print entries in it
        for (int row = 0; row < numRows; row++) {
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i <= row; i++)
                arr.add(binomialCoeff(row, i));
            mat.add(arr);
        }
        return mat;
    }
}