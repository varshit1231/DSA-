class Solution {
    public void nextPermutation(int[] nums) {
       int p=-1;
        int len= nums.length;
        for(int i=len - 2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        if(p!= -1){
        for(int i=len-1;i>=p;i--){
            if(nums[i]>nums[p]){
                int t=nums[i];
                nums[i]= nums[p];
                nums[p]= t;
                break;
            }
        }
        }
        int left=p+1;
        int right= len-1;
        while(left<right){
            int temp =nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}