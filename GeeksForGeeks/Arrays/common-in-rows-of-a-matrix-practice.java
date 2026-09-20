class Solution {
    public int distinct(int[][] mat) {
        // code here
        int n=mat.length;
        Set<Integer> commonSet=new HashSet<>();
        for(int j=0;j<n;j++){
            commonSet.add(mat[0][j]);
        }
        for(int i=1;i<n;i++){
            Set<Integer> currentRowSet=new HashSet<>();
            for(int j=0;j<n;j++){
                currentRowSet.add(mat[i][j]);
            }
            commonSet.retainAll(currentRowSet);
        }
        return commonSet.size();
    }
}