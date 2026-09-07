class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int k = p.length();
        int p_table[] = new int[26];
        int win_table[] = new int[26];
        for(char ch : p.toCharArray()){
            p_table[ch - 'a']++;

        }
        for(int r=0; r<s.length(); r++){
            char ch_r = s.charAt(r);
            win_table[ch_r-'a']++;
            
            if(r-left+ 1 == k){
                if(Arrays.equals(p_table, win_table)){
                    result.add(left);
                }
                char ch_l = s.charAt(left);
                win_table[ch_l - 'a']--;
                left++;
            }
        }
        return result;
    }
}