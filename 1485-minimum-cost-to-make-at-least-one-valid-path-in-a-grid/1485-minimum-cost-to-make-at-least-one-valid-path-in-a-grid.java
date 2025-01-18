class Solution {

    static int n;
    static int m;

    static int helper(int arr[][]){

        int dx[] = {0,0,1,-1};
        int dy[] = {1,-1,0,0};

        int dist[][] = new int[n][m];
        for(var a : dist) Arrays.fill(a,Integer.MAX_VALUE);
        
        Deque<int[]> dq = new ArrayDeque<>();
        
        dq.addFirst(new int[]{0,0});
        dist[0][0] = 0;

        while(dq.size()!=0){
            int a[] = dq.removeFirst();
            int x = a[0];
            int y = a[1];

            int dir = arr[x][y];

            for(int k=0; k<4; k++){
                int nx = x+dx[k];
                int ny = y+dy[k];
                int wt = 1;
                if(k+1==dir) wt = 0;
                if(nx>=0 && ny>=0 && nx<n && ny<m){
                    if(dist[nx][ny]>dist[x][y]+wt){
                        dist[nx][ny]=dist[x][y]+wt;
                        if(wt==1) dq.addLast(new int[]{nx,ny});
                        else dq.addFirst(new int[]{nx,ny});
                    }
                } 
            }
         
        }
        return dist[n-1][m-1];
    }
    
    public int minCost(int[][] arr) {
        n = arr.length;
        m = arr[0].length;
        return helper(arr);
    }
}