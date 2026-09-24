class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<fruits.length; i++){
            map.put(fruits[i], map.getOrDefault(fruits[i],0)+1);

        while(map.size() > 2){
            int value = fruits[l];
            map.put(value, map.get(value) - 1);

            if(map.get(value) == 0){
                map.remove(value);
            }
            l++;
        }
        ans = Math.max(ans, i-l+1);
    }
        return ans;
    }
}