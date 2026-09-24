class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        HashSet<Character> set =  new HashSet<>(); 
        int max=0;

        for(int i = 0; i<s.length(); i++){
            char chr = s.charAt(i);
            while(set.contains(chr)){
                char chl = s.charAt(l);
                set.remove(chl);
                l++;
            }
            set.add(chr);
            max = Math.max(max, i-l+1);
        }
        return max;
    }
}