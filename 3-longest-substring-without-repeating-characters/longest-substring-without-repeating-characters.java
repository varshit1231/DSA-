class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        HashSet<Character> set =  new HashSet<>(); 
        int max=0;

        for(int r=0; r<s.length(); r++){
            char ch_r = s.charAt(r);



            while(set.contains(ch_r)){
                char ch_l = s.charAt(l);
                set.remove(ch_l);
                l++;
            }
            set.add(ch_r);
            max= Math.max(max, r-l+1);
        }
        return max;
    }
}