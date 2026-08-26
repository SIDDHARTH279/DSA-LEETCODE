class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int l = 0;
        int product = 1;
        int cnt = 0;

        if(k <= 1) {
            return 0;
        }

        for(int r = 0; r < nums.length; r++) {
            product *= nums[r];
            while(product >= k) {
                product /= nums[l];
                l++;
            }

            cnt += r-l+1;
        }

        return cnt;





        
    }
}