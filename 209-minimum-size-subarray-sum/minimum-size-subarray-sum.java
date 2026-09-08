class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int min = nums.length + 1;
        for(int i=0; i<nums.length; i++){
            // expansion 
            sum += nums[i];

            while(sum >= target){
                // update
                min = Math.min(min,i-l+1);
                sum -= nums[l];
                l++;
            }
        }
        return (min == nums.length+1?0:min);
    }
}