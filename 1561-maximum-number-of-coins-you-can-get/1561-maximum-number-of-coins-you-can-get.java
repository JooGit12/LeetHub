import java.util.Arrays;

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int byeBob = piles.length / 3;
        int mine = 0;
        
        for (int i = piles.length - 2; i >= byeBob; i -= 2) {
			mine += piles[i];
		}
        
        return mine;
    }
}
