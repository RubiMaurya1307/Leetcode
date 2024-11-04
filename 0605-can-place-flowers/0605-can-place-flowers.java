class Solution {
    public boolean canPlaceFlowers(int[] fbed, int n) {
        int len = fbed.length;
        int canPlant = 0;

        if (len==1 && fbed[0]==0 && n==1) return true;

        if (len>1 && fbed[0]==0) {
            if (fbed[1] == 0) {
                fbed[0] = 1;
                canPlant++;
            }
        }

        for (int i = 1; i < len - 1; i++) {
            if (fbed[i - 1]==0 && fbed[i]==0 && fbed[i + 1]==0) {
                fbed[i] = 1;
                canPlant++;
            }
        }

        if (len>1 && fbed[len-1]==0) {
            if (fbed[len - 2] == 0) {
                fbed[len - 2] = 1;
                canPlant++;
            }
        }

        return canPlant >= n;
    }
}