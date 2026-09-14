class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i = 0;i < piles.length; i++){
            high = Math.max(high, piles[i]);
        }

        while(low <= high){
            long hr = 0;
            int guess = low + (high - low)/2;

            for(int i = 0; i < piles.length; i++){
            hr = hr + piles[i]/guess;
            if(piles[i] % guess != 0){
                hr++;
            }
        }

            if(hr > h){
                low = guess + 1;
            }
            else{
                high = guess - 1;
            }
        }
        return low;
    }
}