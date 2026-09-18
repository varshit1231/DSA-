class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
             if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
             }
             else{
                map.put(nums[i],1);
             }
        }
        for(int i=0; i<n; i++){
        if(map.get(nums[i]) > n/3 ){
            if(!list.contains(nums[i])){
            list.add(nums[i]);
            }
        }
    }
        return list;
    }
}