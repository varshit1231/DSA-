class Solution {
    public int minSteps(String s, String t) {
         int[] c = new int[26]; 
        for (int i = 0;i<s.length();i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0;i<t.length();i++) {
            c[t.charAt(i) - 'a']--;
        }
        int steps = 0;
        for (int ch:c) {
            if (ch > 0) {
                steps += ch;
            }
        }
        return steps;
    }
}