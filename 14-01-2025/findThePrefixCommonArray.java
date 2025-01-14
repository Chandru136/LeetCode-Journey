class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        boolean[] hash = new boolean[n+1];
        int count = 0;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            if(hash[A[i]]) {
                count++;
            } else {
                hash[A[i]] = true;
            }
            if(hash[B[i]]) {
                count++;
            } else {
                hash[B[i]] = true;
            }
            res[i] = count;
        }
        return res;
    }
}
