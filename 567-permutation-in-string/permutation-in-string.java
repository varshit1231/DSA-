class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        int k = s1.length();
        int p_table[] = new int[26];
        int win_table[] = new int[26];
        for(char ch : s1.toCharArray()){
            p_table[ch - 'a']++;

        }
        for(int r=0; r<s2.length(); r++){
            char ch_r = s2.charAt(r);
            win_table[ch_r-'a']++;
            
            if(r-left+ 1 == k){
                if(Arrays.equals(p_table, win_table)){
                    return true;
                }
                char ch_l = s2.charAt(left);
                win_table[ch_l - 'a']--;
                left++;
            }
        }
        return false;
    }
}