class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int sum=0;
        int ans=Integer.MIN_VALUE;
         for(int i=0; i<nums.length; i++){
            sum+=nums[i];

         if(i-l+1 == k){
            ans= Math.max(ans,sum);
            sum -= nums[l];
            l++;
         }
         }
         return ans*1.0 /k;
    }
}