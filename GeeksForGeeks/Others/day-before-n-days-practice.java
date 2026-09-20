class Solution {
    public int nthDay(int d, int n) {
        // code here
        int x=n%7;
        int ans=d-x;
        if(ans<0){
            ans=ans+7;
        }
        return ans;
    }
}