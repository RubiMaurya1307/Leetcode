class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0)
            return m*n;
        int smallX = Integer.MAX_VALUE;
        int smallY = Integer.MAX_VALUE;
        for(int[] op : ops){
            int x = op[0];
            int y = op[1];
            smallX = Math.min(smallX,op[0]);
            smallY = Math.min(smallY,op[1]);
        }
        return smallX*smallY;
    }
}