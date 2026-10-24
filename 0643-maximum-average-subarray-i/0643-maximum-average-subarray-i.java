class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum=0 , winsums=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            winsums+=nums[i];
        }
        maxsum=winsums;
        for(int i=k;i<n;i++){
            winsums += nums[i] - nums[i-k];
            maxsum=Math.max(maxsum,winsums);
        }
        return maxsum/k;
    }
}